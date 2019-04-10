package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet{

	ArrayList<Resistor> resistor = new ArrayList<Resistor>();
	ArrayList<Colour> colours = new ArrayList<Colour>();

	public void separate(int value){
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void loadColours(){
		Table table = loadTable("colours,csv", "header");
		for(TableRow row:table.rows()){
			colours.add(new Colour(row));
		}

		// public void loadDataSet(){
		// 	Table table = loadTable("HabHYG15ly.csv", "header");
		// 	for(TableRow row:table.rows()){
		// 		stars.add(new Star(row));       
		// 	}
		// }
	
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
}
