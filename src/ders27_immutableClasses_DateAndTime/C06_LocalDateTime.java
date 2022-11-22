package ders27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime zaman= LocalDateTime.now();

        System.out.println(zaman);//2022-10-29 T 19:30:08.192046600

        System.out.println(zaman.getDayOfYear());//302


    }
}
