package ie.tudublin;

import processing.data.TableRow;

public class Resistor extends UI{
    int value;
    private int ones;
    private int tens;
    private int hundreds;

    public Resistor(String row) {
        String[] fields = row.split(" ");
        this.value = Integer.parseInt(fields[0]);
        this.ones = value - ((hundreds * 100)  + (tens * 10));
        this.tens = (value - (hundreds * 100)) / 10;
        this.hundreds = (value / 100);
    }
    
    // overloaded constructor
    public Resistor(TableRow row)
    {
        this.value = row.getInt(0);   
    }
}