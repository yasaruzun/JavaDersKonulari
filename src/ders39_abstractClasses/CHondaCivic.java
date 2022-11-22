package ders39_abstractClasses;

public class CHondaCivic extends BHonda {


    @Override
    public void motor() {
        System.out.println("honda civic araclar vtect teknolojili cevreci motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("civic araclar sedan veya hb kasa kullanir");
    }

    @Override
    public void tekerlek() {

        System.out.println("civic araclar 155 55 55 olcu teker kullanir");
    }

    @Override
    public void yakit() {
        System.out.println("Civic araclar benzinlidir");
    }

    @Override
    public void guvenlik() {
        System.out.println("civic araclar guvenlik standardına uyar");
    }

    @Override
    public void abs() {
        System.out.println("honda civic arabalar standar olarak abs kullanir ");
    }

    @Override
    public void klima() {
        System.out.println("honda civic arabalar standar olarak klima kullanir ");

    }

    public static void main(String[] args) {
        /*
            Abstract parent class'lardaki abstract method'lar concrete child class'lar
            tarafindan mecburen override edilir
            Ancak abstract parent'lardaki concrete methodlar'i override etmek
            mecburi degildir
            Eger child class'a uyarlamak isterseniz override edebilirsiniz veya
            override etmeyip parent class'daki hali ile kullanabilirsiniz

         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();//Araba
        civic1.klima();//Araba
        civic1.marka();//Honda
        civic1.ozelTeknoloji();//Honda

    }
}
