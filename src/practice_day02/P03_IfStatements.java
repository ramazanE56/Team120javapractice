package practice_day02;

import java.util.Scanner;

public class P03_IfStatements {
    public static void main(String[] args) {


        /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unusalı kullanin
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bugün günlerden hangi gün: ");
        String gunAdi = scanner.next().toLowerCase();

        if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println("Bugünü "+gunAdi+" olarak girdiniz");
            System.out.println("Bugün Hafta Sonu");
        }
        if (gunAdi.equals("pazartesi") || gunAdi.equals("salı") || gunAdi.equals("çarşamba") || gunAdi.equals("perşembe") || gunAdi.equals("cuma")) {
            System.out.println("Bugünü "+gunAdi+" olarak girdiniz");
            System.out.println("Bugün hafta içi");

        }
        if (!(gunAdi.equals("pazartesi") || gunAdi.equals("salı") || gunAdi.equals("çarşamba") || gunAdi.equals("perşembe") || gunAdi.equals("cuma") || gunAdi.equals("cumartesi") || gunAdi.equals("pazar"))) {
            System.out.println("Hatalı giriş yapıldı.");
            System.out.println(gunAdi+" bir gün adı değildir. Lütfen bir gün adı giriniz");


        }
    }
}