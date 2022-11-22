package ders13_nestedForLoop_Method_Oluşturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input= "java her geçen gün güzelleşiyor"; //bir önceki soruda kaydetmedi sadece yazdırdı. burada kaydedecek.
        // bu nedenle ters halini boş string oluşturduk

       String tersInput="";

        for (int i = input.length()-1; i>=0 ; i--) {

            tersInput+=input.substring(i,i+1);

        }

        System.out.println("ters hali :" +tersInput);//royişellezüg nüg neçeg reh avaj

    }
}
