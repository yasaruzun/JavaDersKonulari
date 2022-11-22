package ders20_multiDimensionalArrays;

public class C03_MDA_EnUzunKelimd {
    public static void main(String[] args) {

        //verilen multiDimensional string bir array'dekien uzun String'i  bulan kod yaziniz.

        String [][]arr={{"ilker","nesrin"},{"hasan","Heysem","adem","yusuf enes"}};


        String enUzunKelime=arr[0][0];

        for (int i = 0; i <arr.length ; i++) {//outer array in elemenlarını kontrol eder

            for (int j = 0; j <arr[i].length ; j++) {

                if(arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=arr[i][j];

                }

            }


        }

        System.out.println("en uzun kelime :" +enUzunKelime);


    }
}
