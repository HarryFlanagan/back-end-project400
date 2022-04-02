package com.example.project400.scheduledShift;

import com.example.project400.model.Employee;
import com.example.project400.model.ScheduledShift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduledShiftService {

    private final ScheduledShiftRepository scheduledShiftRepository;

    @Autowired
    public ScheduledShiftService(ScheduledShiftRepository shiftPositionRepository) {
        this.scheduledShiftRepository = shiftPositionRepository;
    }

    public List<ScheduledShift> getScheduledShifts() {return scheduledShiftRepository.findAll();}

    public List<ScheduledShift> getScheduledShiftsByShiftId (Long shiftId) {
        return scheduledShiftRepository.findScheduledShiftByShiftId(shiftId);
    }

    public void addNewScheduledShift(ScheduledShift scheduledShift) {
        scheduledShiftRepository.save(scheduledShift);
    }

    public void deleteScheduledShift(Long scheduledShiftId) {
        boolean scheduledShiftExists = scheduledShiftRepository.existsById(scheduledShiftId);
        if (!scheduledShiftExists){
            throw new IllegalStateException("Scheduled Shift with id " + " does not exist");
        }
        scheduledShiftRepository.deleteById(scheduledShiftId);
    }
}
