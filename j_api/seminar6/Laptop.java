package j_api.seminar6;

public class Laptop {
    private String name;
    private String OS;
    private String colour;
    private int serial_number;
    private double cost;
    private int main_memory;
    private int hdd_capacity;


    public Laptop(String name, String OS, String colour, int serial_number, double cost, int main_memory,
                  int hdd_capacity) {
        this.name = name;
        this.OS = OS;
        this.colour = colour;
        this.serial_number = serial_number;
        this.cost = cost;
        this.main_memory = main_memory;
        this.hdd_capacity = hdd_capacity;
    }

    public Laptop(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Laptop() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOS() {
        return this.OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSerialNumber() {
        return this.serial_number;
    }

    public void setName(int serial_number) {
        this.serial_number = serial_number;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        if (cost > 0)
            this.cost = cost;
    }

    public int getMain_Memory() {
        return this.main_memory;
    }

    public void setMain_memory(int main_memory) {
        this.main_memory = main_memory;
    }

    public int getHdd_capacity() {
        return this.hdd_capacity;
    }

    public void setHdd_capacity(int hdd_capacity) {
        this.hdd_capacity = hdd_capacity;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %.02f %d %d", getName(), getOS(), getColour(), getSerialNumber(), getCost(),
                getMain_Memory(), getHdd_capacity());
    }

    @Override
    public int hashCode() {
        return serial_number;
    }

    @Override
    public boolean equals(Object o) {
        var laptop = (Laptop) o;
        return laptop.serial_number == this.serial_number && laptop.name == this.name;
    }
}
