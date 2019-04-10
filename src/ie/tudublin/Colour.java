package ie.tudublin;

import processing.data.TableRow;

public class Colour extends UI{
    public String colour;
    public int r;
    public int g;
    public int b;
    public int value;

    public Colour(TableRow row){
        this.colour = row.getString("colour");
        this.r = row.getInt("r");
        this.g = row.getInt("g");
        this.b = row.getInt("b");
        this.value = row.getInt("value");
    }
    

}