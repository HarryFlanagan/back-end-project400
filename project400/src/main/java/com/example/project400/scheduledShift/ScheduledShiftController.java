package com.example.project400.scheduledShift;

import com.example.project400.model.Employee;
import com.example.project400.model.ScheduledShift;
import com.example.project400.model.Shift;
import com.example.project400.shift.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/scheduledShift")
@CrossOrigin(origins = "*")
public class ScheduledShiftController {
    /*Dependency Injection*/
    @Autowired
    private final ScheduledShiftService scheduledShiftService;

    public ScheduledShiftController(ScheduledShiftService scheduledShiftService) {this.scheduledShiftService = scheduledShiftService;}

    @GetMapping
    public List<ScheduledShift> getScheduledShifts() {return scheduledShiftService.getScheduledShifts();}

    @GetMapping(path = "{shiftId}")
    public List<ScheduledShift> getScheduledShiftByShiftId(@PathVariable("shiftId") Long id){ return scheduledShiftService.getScheduledShiftsByShiftId(id);}

    @PostMapping
    public void addNewScheduledShift(@RequestBody ScheduledShift scheduledShift){ scheduledShiftService.addNewScheduledShift(scheduledShift);}

    @DeleteMapping(path = "{scheduledShiftId}")
    public void deleteEmployee(@PathVariable("scheduledShiftId") Long id){
        scheduledShiftService.deleteScheduledShift(id);
    }

}

