package com.example.project400.shift;

import com.example.project400.model.Employee;
import com.example.project400.model.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShiftService {

    private final ShiftRepository shiftRepository;
    @Autowired
    public ShiftService(ShiftRepository shiftRepository){
        this.shiftRepository = shiftRepository;
    }

    public List<Shift> getShifts() {return shiftRepository.findAll();}

    public Optional<Shift> getShiftById (Long shiftId) {
        boolean employeeExists = shiftRepository.existsById(shiftId);
        if (!employeeExists){
            throw new IllegalStateException("Employee with id " + shiftId + " does not exist");
        }
        return shiftRepository.findById(shiftId);
    }

}
