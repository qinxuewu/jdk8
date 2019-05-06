package com.shengsiyuan.joda;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;

/**
 * @author wangmeng
 * @date 2019/5/6
 * @desciption
 */
public class Java8TimeTest {


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear()+","+localDate.getMonthValue()+","+localDate.getDayOfMonth());

        System.out.println("--------------");
        LocalDate localDate1 = LocalDate.of(2019,5,6);
        System.out.println(localDate1);

        System.out.println("------------------");
        LocalDate localDate2 = LocalDate.of(2010,3,25);
        MonthDay monthDay = MonthDay.of(localDate2.getMonth(),localDate2.getDayOfMonth());
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2011,3,25));
        if (monthDay.equals(monthDay1)){
            System.out.println("euals");
        }else {
            System.out.println("not euqals");
        }
        System.out.println("---------------------------");
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime time2 = time.plusHours(3).plusMinutes(20);
        System.out.println(time2);
        System.out.println("-----------------------");

        LocalDate localDate3 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate3);

        LocalDate localDate4 = localDate.minus(2,ChronoUnit.MONTHS);
        System.out.println(localDate4);

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        System.out.println("-------------");
        LocalDate localDate5 = LocalDate.now();
        LocalDate localDate6 = LocalDate.of(2017,3,19);
        System.out.println(localDate5.isAfter(localDate6));
        System.out.println(localDate5.isBefore(localDate6));
        System.out.println(localDate5.equals(localDate6));

        System.out.println("------------------------");
        Set<String>set =  ZoneId.getAvailableZoneIds();

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println(zonedDateTime);


        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());
        System.out.println("-----------------------");

        YearMonth yearMonth1 = YearMonth.of(2016,2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth1.isLeapYear());

        System.out.println("----------------------");
        LocalDate localDate7 = LocalDate.now();
        LocalDate localDate8 = LocalDate.of(2018,5,20);
        Period period = Period.between(localDate7,localDate8);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}