package practice_day06;

import java.util.Scanner;

public class stringmanipulation {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle alin
    - cumlede ev geciyorsa, "home home sweet home" yazdirin
    - cumlede is geciyorsa, "calismak guzeldir"
    - ikisini de iceriyorsa "Hem ev lazim hem is"
    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
         */

        /*
        ÖDEV-Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
    - ilk harf kucuk harf olmali
    - son karakter rakam olmali
    - sifre bosluk icermemeli
    - uzunlugu en az 10 karakter olmali
         */

        /*
        Ödev: Kullanıcıdan bir metin girişi alın
         ve metindeki sesli harfleri sayan bir program yazın.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle= scan.nextLine();
        String kucukcumle=cumle.toLowerCase();

        if (kucukcumle.contains("ev")&&kucukcumle.contains("is")){
            System.out.println("Hem Ev Hem İş Lazım");
        } else if (kucukcumle.contains("ev")) {
            System.out.println(" home home sweet home");
        } else if (kucukcumle.contains("iş")) {
            System.out.println("çalışmak güzeldir");
        }else{
            System.out.println("Çok çalışman Lazım");
        }
    }
}
