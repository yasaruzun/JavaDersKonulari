package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        int urunAdedi = 30;
        boolean kartVarMi = false;
        double listeFiyati = 12.5;
        double toplamFiyat = 0;

        //ana değişken kart olsun

        if (kartVarMi) {


            //kart var
            if (urunAdedi < 0) {
                System.out.println("hatalı ürün adedi giriş");
            } else if (urunAdedi < 10) {
                toplamFiyat = listeFiyati * urunAdedi * 0.85;
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
            } else if (urunAdedi > 10) {
                toplamFiyat = listeFiyati * urunAdedi * 0.80;
                System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat);

            } else {
                //kart yok
                if (urunAdedi < 0) {
                    System.out.println("hatalı ürün adedi giriş");
                } else if (urunAdedi < 10) {
                    toplamFiyat = listeFiyati * urunAdedi * 0.90;
                    System.out.println("%10 indirimli toplam fiyat:" + toplamFiyat);
                } else if (urunAdedi > 10) {
                    toplamFiyat = listeFiyati * urunAdedi * 0.85;
                    System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);

                }


            }
        }
    }
}