package practice_day08;
// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)
public class Rectangle {
    int lenght;
    int width;
    public Rectangle (int lenght, int width){
        this.lenght=lenght;
        this.width=width;
        display();
    }
    public Rectangle (int side){
        this.lenght=side;
        this.width=side;
        display();
    }

    public void display() {

        if (lenght==width){
            System.out.println("Kenar uzunluğu : "+lenght+" (Kare)");
        }else {
            System.out.println("Uzunluk :"+lenght+" , Genişlik: "+width);
        }

    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(8,8);
        Rectangle rectangle2 = new Rectangle(9);
    }
}
