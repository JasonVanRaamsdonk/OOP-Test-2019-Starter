package ie.tudublin;

public class Resistor extends UI{
    private int value;
    private int ones;
    private int tens;
    private int hundreds;

    public Resistor(int value, int ones, int tens, int hundreds) {
        this.value = value;
        this.ones = value - ((hundreds * 100)  + (tens * 10));
        this.tens = (value - (hundreds * 100)) / 10;
        this.hundreds = hundreds = (value / 100);
    }
}