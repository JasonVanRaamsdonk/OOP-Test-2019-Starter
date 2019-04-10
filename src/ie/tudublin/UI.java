package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet{

	ArrayList<Resistor> resistors = new ArrayList<Resistor>();
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
		Table table = loadTable("colours.csv", "header");
		for(TableRow row:table.rows()){
			Colour c = new Colour(row);
			colours.add(c);
		}
	}

	public void printColours(){
		for(int i = 0; i < colours.size(); i++){
			Colour c = colours.get(i);
			print("value: " + c.value);
		}
	}

	public void printResistors(){
		for(int i = 0; i < resistors.size(); i++){
			Resistor r = resistors.get(i);
			print("value: " + r.value);
		}
	}

	public int colourFinder(int value){
		for(int i = 0; i < colours.size(); i++){
			Colour c = colours.get(i);
			if(c.value == value){
				return value;
			} 
		}
		return -1;
	}

	public void loadResistors(){
		String[] rows = loadStrings("resistors.csv");
		for(String row:rows){
			//Resistor resist = new Resistor(row);
			resistors.add(new Resistor(row));
		}
	}

	public void drawResistor(){
		System.out.println(resistors.size());
		float gap = 0;
		float border = height * 0.05f;
		// stroke(0);
		// fill(255);
		for(int i = 0; i < resistors.size(); i++){
			float y = map(i, 0, resistors.size() - 1, border, height - border);
			stroke(0);
			fill(255);
			rect(border * 2, border + gap, border * 4, border * 2);
			Resistor res = resistors.get(i);
			int val_r = res.value;
			Colour c = colours.get(i);
			fill(c.r, c.b, c.g);
			rect(border * 2.4f, border + gap, border - 20, border * 2);
			fill(c.r, c.b, c.g);
			rect(border * 2.8f, border + gap, border  , border * 2);
			fill(c.r, c.b, c.g);
			rect(border * 3.2f, border + gap, border - 60, border * 2);

			gap += border * 5;
			
		}
		

		// float y = map(1, 0, resistors.size() - 1, border, height - border);
		// rect(border + gap, y, border * 2, y + border);
		
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);

		loadColours();
		loadResistors();
		printResistors();
		printColours();
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(255);
		drawResistor();
		
	}
}
