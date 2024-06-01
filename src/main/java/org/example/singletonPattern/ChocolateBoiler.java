package org.example.singletonPattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    // Sınıfın tek örneğini saklamak için bir statik değişken
    private static ChocolateBoiler uniqueInstance;

    // Constructor'ı özel yaparak dışarıdan yeni örnek oluşturulmasını engelliyoruz
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Sınıfın tek örneğini döndüren statik yöntem
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // dolum işlemi
            System.out.println("Filling the boiler with a chocolate and milk mixture");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // boşaltma işlemi
            empty = true;
            System.out.println("Draining the boiled chocolate and milk");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // kaynatma işlemi
            boiled = true;
            System.out.println("Boiling the chocolate and milk mixture");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}

