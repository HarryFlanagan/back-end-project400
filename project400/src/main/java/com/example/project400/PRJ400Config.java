package com.example.project400;

import com.example.project400.employee.EmployeeRepository;
import com.example.project400.model.Employee;
import com.example.project400.model.ScheduledShift;
import com.example.project400.model.Shift;
import com.example.project400.scheduledShift.ScheduledShiftRepository;
import com.example.project400.shift.ShiftRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PRJ400Config {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository, ShiftRepository shiftRepository, ScheduledShiftRepository scheduledShiftRepository) {
        return args -> {
//            Employee shaina = new Employee(
//                    "Shaina",
//                    "McGovern",
//                    "shaina@mail.com",
//                    "0871126409",
//                    LocalDate.of(1994, Month.JUNE, 24),
//                    11.50,
//                    false)
//            ;
//            Employee harry = new Employee(
//                    "Harry",
//                    "Flanagan",
//                    "harry@mail.com",
//                    "0871126409",
//                    LocalDate.of(1997, Month.JUNE, 30),
//                    15.50,
//                    true);
//            Employee rich = new Employee(
//                    "Richard",
//                    "Doherty",
//                    "rich@mail.com",
//                    "0871126444",
//                    LocalDate.of(1991, Month.NOVEMBER, 26),
//                    12.50,
//                    true);
//            Employee karen = new Employee(
//                    "Karen",
//                    "O'Dowd",
//                    "karen@mail.com",
//                    "0834564409",
//                    LocalDate.of(1994, Month.APRIL, 2),
//                    10.50,
//                    false);
//            employeeRepository.saveAll(
//                    List.of(shaina, harry, rich, karen)
//            );
            Shift mondayMorning = new Shift("Monday", "Morning");
            Shift mondayDay = new Shift("Monday", "Day");
            Shift mondayNight = new Shift("Monday", "Night");
            Shift tuesdayMorning = new Shift("Tuesday", "Morning");
            Shift tuesdayDay = new Shift("Tuesday", "Day");
            Shift tuesdayNight = new Shift("Tuesday", "Night");
            Shift wednesdayMorning = new Shift("Wednesday", "Morning");
            Shift wednesdayDay = new Shift("Wednesday", "Day");
            Shift wednesdayNight = new Shift("Wednesday", "Night");
            Shift thursdayMorning = new Shift("Thursday", "Morning");
            Shift thursdayDay = new Shift("Thursday", "Day");
            Shift thursdayNight = new Shift("Thursday", "Night");
            Shift fridayMorning = new Shift("Friday", "Morning");
            Shift fridayDay = new Shift("Friday", "Day");
            Shift fridayNight = new Shift("Friday", "Night");
            Shift saturdayMorning = new Shift("Saturday", "Morning");
            Shift saturdayDay = new Shift("Saturday", "Day");
            Shift saturdayNight = new Shift("Saturday", "Night");
            Shift sundayMorning = new Shift("Sunday", "Morning");
            Shift sundayDay = new Shift("Sunday", "Day");
            Shift sundayNight = new Shift("Sunday", "Night");
            shiftRepository.saveAll(
                    List.of(mondayMorning,
                            mondayDay,
                            mondayNight,
                            tuesdayMorning,
                            tuesdayDay,
                            tuesdayNight,
                            wednesdayMorning,
                            wednesdayDay,
                            wednesdayNight,
                            thursdayMorning,
                            thursdayDay,
                            thursdayNight,
                            fridayMorning,
                            fridayDay,
                            fridayNight,
                            saturdayMorning,
                            saturdayDay,
                            saturdayNight,
                            sundayMorning,
                            sundayDay,
                            sundayNight)
            );
//            ScheduledShift scheduledShift1 = new ScheduledShift(harry,mondayDay);
//            scheduledShiftRepository.saveAll(
//                    List.of(scheduledShift1));
        };
    }
}