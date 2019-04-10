package ie.tudublin;

import processing.data.TableRow;

public class Colour extends UI{
    private String colour;
    private int r;
    private int g;
    private int b;
    private int value;

    public Colour(TableRow row){
        this.colour = row.getString("colour");
        this.r = row.getInt("r");
        this.g = row.getInt("g");
        this.b = row.getInt("b");
        this.value = row.getInt("value");
    }

}