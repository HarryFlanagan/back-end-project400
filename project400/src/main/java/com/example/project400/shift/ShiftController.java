package com.example.project400.shift;

import com.example.project400.model.Employee;
import com.example.project400.model.Shift;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/shift")
@CrossOrigin(origins = "*")
public class ShiftController {

    /*Dependency Injection*/
    @Autowired
    private final ShiftService shiftService;

    public ShiftController(ShiftService shiftService) {this.shiftService = shiftService;}

    @GetMapping
    public List<Shift> getShifts() {
        return shiftService.getShifts();
    }

    @GetMapping(path = "{shiftId}")
    public Optional<Shift> getShiftById(@PathVariable("shiftId") Long id){ return shiftService.getShiftById(id);}

}
