package practice_day08;
// Bir "Car" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
//// Bu constructor, marka ve model bilgilerini alacak şekilde tasarlanmalıdır.
//
//// Örnek çıktı:
//// Car nesnesi oluşturuldu: Ford Focus
public class Car {
    String marka;
    String model;
    public Car(String marka,String model){
        this.marka=marka;
        this.model=model;
    }

    public static void main(String[] args) {
        Car car1= new Car("Renault","Braodway");
        Car car2 = new Car("Ford","Fusion");
        Car car3 = new Car("Renauılt","Megane");
        System.out.println("Arabalarım  :"+car1.marka+" "+car1.model);
        System.out.println("Arabalarım  :"+car2.marka+" "+car2.model);
        System.out.println("Arabalarım  :"+car3.marka+" "+car3.model);

    }


}
