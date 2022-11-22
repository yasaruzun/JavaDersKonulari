package selfStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S1 {

     /*
		 * Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string.(Ignore case sensitivity).

		 İnputu kullanıcıdan alacak sekilde yapalım

		 *
		 * Input : Learning java is easy
		 *
		 * Output: maximum occurring character is : a
		 */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle=scan.nextLine();


        List<String> harfler=new ArrayList<>();

        int sayac=0;

        for (int i = 0; i <cumle.length() ; i++) {

            for (int j = i+1; j <cumle.length() ; j++) {

                if(cumle.charAt(i)==cumle.charAt(j)){

                    sayac++;

                }

            }

        }
        
        
        
        
    }
    
    
}
