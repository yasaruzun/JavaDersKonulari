package ders40_Interfaces;

import java.util.ArrayList;
import java.util.List;

public class I09_ChildOfI08 implements I08_InterfaceStaticVeDefaultMethods{


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    public static void main(String[] args) {


        //I08_InterfaceStaticVeDefaultMethods.method3(); Non-static method 'method3()' cannot be referenced from a static context
        I08_InterfaceStaticVeDefaultMethods.method4();

        I09_ChildOfI08 obj= new I09_ChildOfI08();
        obj.method3();

    }

}
