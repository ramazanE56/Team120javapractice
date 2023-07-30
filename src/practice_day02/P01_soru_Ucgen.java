package practice_day02;

import java.util.Scanner;

public class P01_soru_Ucgen {
    public static void main(String[] args) {
        /*
        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
üçgenin alanını hesaplayıp yazdırın
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir üçgene ait kenar uzunluğu ve bilgilerini sırası ile giriniz");
        System.out.print("Kenar:");
        double kenar = scanner.nextDouble();
        System.out.println("");
        System.out.print("Yükseklik:");
        double yukseklik = scanner.nextDouble();
        System.out.println("");
        System.out.println("Üçgene ait kenaruzunluğu ve yükseklik bilgileri girildi");
        System.out.println("Bu üçgenin alanı: "+ (kenar*yukseklik)/2);



    }
}
