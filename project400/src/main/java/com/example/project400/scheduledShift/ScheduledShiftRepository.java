package com.example.project400.scheduledShift;

import com.example.project400.model.Employee;
import com.example.project400.model.ScheduledShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ScheduledShiftRepository extends JpaRepository<ScheduledShift, Long> {
    @Query(value = "SELECT * FROM scheduled_shift WHERE shift_id =?1", nativeQuery = true)
    List<ScheduledShift> findScheduledShiftByShiftId(Long shiftId);
}
