package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih);//2022-10-29

        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.minusWeeks(5).minusDays(3));

        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3));


        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth());//OCTOBER
        System.out.println(tarih.getDayOfMonth());//29;
        System.out.println(tarih.getDayOfYear());//302

        System.out.println(tarih.isLeapYear());//false
        System.out.println(tarih.withYear(2000).isLeapYear());//true
        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));//2020-11-13
        System.out.println(tarih.lengthOfYear());//365
        System.out.println(tarih.withYear(2020).lengthOfYear());//366
        System.out.println(tarih.withYear(1992).withMonth(2).withDayOfMonth(21).getDayOfWeek());//FRIDAY

        LocalDate date1= LocalDate.of(2011,11,11);
        LocalDate date2= LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date1));//true
        System.out.println(date2.isAfter(date1));//false

        System.out.println(tarih.equals(date1));//false

    }
}
