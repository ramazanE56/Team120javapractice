package practice_day08;
// Bir "Product" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.

// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet
public class Pruduct {
    String name;
    double price;
    int stock;
    public Pruduct(String name,double price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
        display();
    }

    public void display() {
        System.out.println("Ürün adı :"+name+" , Fiyatı:  "+price+" ,Stok Adedi: "+stock);

    }

    public static void main(String[] args) {
        Pruduct pruduct = new Pruduct("MSI Notebook",26500.99,10);

    }

}
