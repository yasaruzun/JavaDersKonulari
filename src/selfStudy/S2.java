package selfStudy;

public class S2 {
    /*
     * Write a java program that calculates the average value of array elements
     *
     * input[]= {1,2,3,4,5,6,7}
     *
     * Output : 4
     */
    public static void main(String[] args) {


             int input[]= {1,2,3,4,5,6,7};

             int toplam=0;
             int ort=0;

        for (int i = 0; i <input.length ; i++) {

            toplam+=input[i];


        }

        ort=toplam/ input.length;

        System.out.println(ort);






    }
}
