package ders45_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C01_Maps {
    public static void main(String[] args) {

        /*
        verilen bir cumlede kullanilan her bir harfi ve
        o harfin kullanim miktarini
        A=5, b=3 .... gibi yazidirin
         */

        String str="Javayi balonu patlatmadan bitirelim";

        // J=1, a=7,v=1,y=2,i=3,.........

        String [] haflerArr= str.split("");//[J, a, v, a, y, i,  , b, a, l, o, n, u,  , p, a, t, l, a, t, m, a, d, a, n,  , b, i, t, i, r, e, l, i, m]


        Map<String,Integer> kullanimMiktarlariMap=new TreeMap<>();
        int sayac=1;

        //1- tum harfleri sirasi ile ele alacagiz

        for (int i = 0; i < haflerArr.length ; i++) {

            //2- ele aldigimiz harf'in , daha once map'e eklenip eklenmedigini kontrol edelim

            if(kullanimMiktarlariMap.containsKey(haflerArr[i])){
                continue;
            }else{
                //kod buraya geldiyse o harf henuz map'e eklenmemistir
                //o zaman bu harfin kullanim miktarini bulmaliyiz

                for (int j = i+1; j < haflerArr.length ; j++) {
                    if(haflerArr[j].equals(haflerArr[i])){
                        sayac++;

                    }

                }
                //sayma islemi bitti, key ve value'yu map e ekleyelim
                kullanimMiktarlariMap.put(haflerArr[i],sayac);
                sayac=1;

            }

        }
        System.out.println(kullanimMiktarlariMap);
    }
}
