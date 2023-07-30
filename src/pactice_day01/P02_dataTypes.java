package pactice_day01;

public class P02_dataTypes {
    public static void main(String[] args) {

        /*
        byte : Sadece tam sayı değer ifade eder. 8 bit
        short :Sadece tam sayı değer ifade eder. 16 bit
        int :Sadece tam sayı değer ifade eder. 32 bit
        long :Sadece tam sayı değer ifade eder.64 bit

        float: Ondalıklı sayıları ifade eder (girilen değerin sonuna f yazmak zorunlu)
        double : Ondalıklı sayıları ifade eder

        boolean : true ya da false
        char : tek tırnak içinde yazılıyor. tek karakter alır.
        scii




         */
        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        System.out.println("Byte max değer  :  "+ b1);
        System.out.println("Byte max değer  :  "+ b2);
        System.out.println();

        short s1 =Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("Short max değer :  "+ s1);
        System.out.println("Short max değer :  "+ s2);
        System.out.println();

        int i1 =Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        System.out.println("İnt max değer :  "+ i1);
        System.out.println("İnt max değer :  "+ i2);
        System.out.println();


        long l1 = Long.MAX_VALUE;
        long l2 = Long.MIN_VALUE;
        System.out.println("Long Max değer : "+ l1);
        System.out.println("Long min değer  :  "+l2 );
        System.out.println();

        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        System.out.println("Float Max değer : "+ f1);
        System.out.println("Float min değer  :  "+f2 );
        System.out.println();

        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println("Double Max değer : "+ d1);
        System.out.println("Double min değer  :  "+l2 );
        System.out.println();



        String isim = "Murat";
        char giris = 'm';
        System.out.println("isim = " + isim);
        System.out.println("giris = " + giris);
        System.out.println(isim.charAt(3));//index 0 dan başlıyor unutma









    }
}
