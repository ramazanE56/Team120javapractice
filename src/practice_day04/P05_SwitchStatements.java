package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        /*
        Kullanıcıdan o günün hangi gün olduğunu girmesini isteyiniz
        haftanın kaçıncı günü olduğunu yazdırın
         */

        System.out.println("Bugün günlerden hangisi");
        Scanner scanner = new Scanner(System.in);
        String gun = scanner.next();
        gun = gun.toLowerCase();

        switch (gun){
            case "pazartesi":
                System.out.println(gun+" :Haftanın 1. günüdür.");
                break;
            case "salı":
                System.out.println(gun+" :Haftanın 2. günüdür.");
                break;
            case "çarşamba":
                System.out.println(gun+" :Haftanın 3. günüdür.");
                break;
            case "perşembe":
                System.out.println(gun+" :Haftanın 4. günüdür.");
                break;
            case "cuma":
                System.out.println(gun+" :Haftanın 5. günüdür.");
                break;
            case "cumartesi":
                System.out.println(gun+" :Haftanın 6. günüdür.");
                break;
            case "pazar":
                System.out.println(gun+" :Haftanın 7. günüdür.");
                break;
            default:
                System.out.println(gun+" :haftanın günü değildir.Hafta sadece 7 gündür.Hatalı girdiniz");

        }
    }
}
