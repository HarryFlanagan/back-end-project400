package com.example.project400.model;

import javax.persistence.*;

@Entity
@Table(name = "scheduled_shift")
public class ScheduledShift {

    @Id
    @SequenceGenerator(
            name = "scheduledShift_sequence",
            sequenceName = "scheduledShift_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "scheduledShift_sequence"
    )
    private Long scheduledShiftId;
    @ManyToOne()
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @ManyToOne()
    @JoinColumn(name = "shiftId")
    private Shift shift;

    public ScheduledShift() {
    }

    public ScheduledShift(Employee employee, Shift shift) {
        this.employee = employee;
        this.shift = shift;
    }

    public ScheduledShift(Long scheduledShiftId) {
        this.scheduledShiftId = scheduledShiftId;
    }

    public ScheduledShift(Long scheduledShiftId, Shift shift) {
        this.scheduledShiftId = scheduledShiftId;
        this.shift = shift;
    }

    public ScheduledShift(Long scheduledShiftId, Employee employee, Shift shift) {
        this.scheduledShiftId = scheduledShiftId;
        this.employee = employee;
        this.shift = shift;
    }

    public Long getScheduledShiftId() {
        return scheduledShiftId;
    }

    public void setScheduledShiftId(Long scheduledShiftId) {
        this.scheduledShiftId = scheduledShiftId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "ScheduledShift{" +
                "scheduledShiftId=" + scheduledShiftId +
                ", employee=" + employee +
                ", shift=" + shift +
                '}';
    }
}
