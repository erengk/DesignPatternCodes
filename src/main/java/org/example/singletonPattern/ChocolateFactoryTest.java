package org.example.singletonPattern;

public class ChocolateFactoryTest {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // Aynı örneği kullanarak işlemleri tekrar deneyelim
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        if (boiler == boiler2) {
            System.out.println("Same instance");
        }

        boiler2.fill();
        boiler2.boil();
        boiler2.drain();
    }
}

