package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        //dogumunuzdan bugune ne kadar zaman gecti?


        LocalDate bugun= LocalDate.now();

        LocalDate dogumGunu=LocalDate.of(1992,2,21);

        Period gecenSure= Period.between(dogumGunu,bugun);

        System.out.println(gecenSure);//P 30Y 8M 8D

        System.out.println(gecenSure.getYears());//30

    }
}
