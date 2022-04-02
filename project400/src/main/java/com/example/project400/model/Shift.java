package com.example.project400.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long shiftId;
    private String Day;
    private String Type;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shift")
    private List<ScheduledShift> scheduledShifts;

    public Shift() {
    }

    public Shift(String day, String type) {
        Day = day;
        Type = type;
    }

    public Shift(Long shiftId, String day, String type) {
        this.shiftId = shiftId;
        Day = day;
        Type = type;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Shifts{" +
                "shiftId=" + shiftId +
                ", Day='" + Day + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
