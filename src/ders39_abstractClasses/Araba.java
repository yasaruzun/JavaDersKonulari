package ders39_abstractClasses;

public abstract class Araba {

    /*
    Araba class'ini inherit eden tum class'lar
    motor,marka,kasa ve tekerlek methodlarini override etmek zorunda kalsin
    ancak abs, klima methodlari opsiyonel olsun
    isteyen child bu methodlari override etsin
    isteyen override etmesin
     */

    public abstract void motor();

    public abstract void marka();
    public abstract void kasa();
    public abstract void tekerlek();

    public void abs(){
        System.out.println("güvenlik arttirmak isteyen arabalar abs kullanabilir");
    }
    public void klima(){
        System.out.println("konfor arttirmak isteyen arabalar klima kullanmali");

    }

}
