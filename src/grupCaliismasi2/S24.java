package grupCaliismasi2;

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

public class S24 {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        String kelime="al";
        String tersKelime="";

        while(!(kelime.length() ==4)){
            System.out.println("lütfen 4 harfli bir kelime giriniz");
            kelime=scan.nextLine();

        }

        for (int i = kelime.length()-1; i >=0 ; i--) {

            tersKelime+=kelime.charAt(i);

        }
        System.out.println(tersKelime);
    }
}
