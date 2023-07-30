package practice_day04;

import java.util.Scanner;

public class P01IfElseStatement {
    public static void main(String[] args) {
        /*
        Soru:
        kenar değerleri girilen bir üçgenin dik içgen olup olmadığını
        kontrol edip dönüt veren kod dizisini yazınız
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontrol edilecek üçgenin uzunluklarını giriniz");
        System.out.print("Birinci kenarın uzunluğu : ");
        int a = scanner.nextInt();

        System.out.print("ikinci kenarın uzunluğu : ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü kenarın uzunluğu : ");
        int c = scanner.nextInt();
        System.out.println("================================== 1. Çözüm ==================================");
        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");

        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else if ((b * b) + (c * c) == (a * a)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        } else {
            System.out.println("Girilen değerlerle bir dik üçgen elde edilemez");
        }
        System.out.println("================================== 2. Çözüm ==================================");

        if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)) {
            System.out.println("Girdiğiniz değerlere sahip üçgen dik üçgendir");
        }else {
            System.out.println("Girilen değerlerle bir dik üçgen elde edilemez");
        }

    }
}
