public class Electronics {
    String name;
    String brand;
    String model;
    double power;
    boolean battery;
    double weight;
    String processor;
    int ram;
    int storage;
    String connectivity;

    public Electronics() {
        System.out.println("default constructor");
    }

    public Electronics(String name, String brand, String model, double power, boolean battery) {
        this();
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.battery = battery;
        System.out.println("Constructor 2: Calls Constructor 1");
    }

    public Electronics(String name, String brand, String model, double power, boolean battery, double weight, String processor) {
        this(name, brand, model, power, battery);
        this.weight = weight;
        this.processor = processor;
        System.out.println("Constructor 3: Calls Constructor 2");
    }

    public Electronics(String name, String brand, String model, double power, boolean battery, double weight, String processor, int ram, int storage) {
        this(name, brand, model, power, battery, weight, processor);
        this.ram = ram;
        this.storage = storage;
        System.out.println("Constructor 4: Calls Constructor 3");
    }

    public Electronics(String name, String brand, String model, double power, boolean battery, double weight, String processor, int ram, int storage, String connectivity) {
        this(name, brand, model, power, battery, weight, processor, ram, storage);
        this.connectivity = connectivity;
        System.out.println("Constructor 5: Calls Constructor 4");
    }

    public static void main(String[] args) {
        Electronics device = new Electronics("Laptop", "TechBrand", "ModelX", 65.5, true, 1.8, "X5 Processor", 16, 512, "Wi-Fi, Bluetooth");
    }
}
