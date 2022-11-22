package ders23_Constructors;

public class Haraba {


    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Haraba(String mrk,String mdl,String ykt,int yl,int fyt){

        marka=mrk;
        model=mdl;
        yakit=ykt;
        yil=yl;
        fiyat=fyt;

    }

    public Haraba(String mrk,String mdl,int yl){
        //istersek parametleri azaltarak da construstor olusturabiliriz.
        marka=mrk;
        model=mdl;
        yil=yl;
    }

    public Haraba(){
        //gorunur durumdaki parametresiz constructor
        //default constructor DEGILDIR
        //default constructor'un body'si de bos olur
        //ancak parametresiz constructor'da body'e kod yazilabilir

        //parametresiz constructor'in body'sinde kod yoksa
        //default constructor ile ayni islevi gorur ama
        //yine de gorunur durumda ise default constructor denmez
    }

//biz gözle görülür herhangi bir constructor olusturdugumuzda
    //java default constructor'ı siler
    //bu durumda daha once olusturulmus olan objelerin sorun olmaması ıcın
    //class'a parametresiz bir constructor eklememiz faydali olur

    public int maxHiz(String yakit) {

        int maxHiz = 120;

        if (yakit.equalsIgnoreCase("dizel")) {

            maxHiz = 200;
        } else if (yakit.equalsIgnoreCase("benzin")) {
            maxHiz = 230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz = 180;
        }

        return maxHiz;

    }


    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka :" + marka +
                "\nmodel:" + model +
                "\nyakit=" + yakit +
                "\nyil:" + yil +
                "\nfiyat:" + fiyat;

    }
}