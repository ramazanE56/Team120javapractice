package practice_day02;

import java.util.Scanner;

public class P03IfStatements2 {
    public static void main(String[] args) {
         /*
   2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
    Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
    Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
    50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
    Ad:
    Soyad:
    1.Vize:
    2. Vize:
    Final :
    Yıl Sonu Notu:
    Ders Durumu :
     */

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Lütfen Soyadınızı Giriniz");
        String surname = scanner.nextLine();
        System.out.println("Lütfen vize ve final notlarınızı sırası ile giriniz");
        System.out.print("1.Vize : ");
        double vize1 = scanner.nextDouble();

        System.out.print("2.Vize : ");
        double vize2 = scanner.nextDouble();

        System.out.print("Final Notu : ");
        double finalNotu = scanner.nextDouble();
        double yilSonuNotu = (((vize1+vize2)/2)*40/100)+(finalNotu*60/100);
        System.out.println("Adınız : "+name);
        System.out.println("Soyadınız : "+surname);
        System.out.println("1.vize Notu : "+vize1);
        System.out.println("2. vize Notu : "+vize2);


    }
}
