package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	words w;
	
	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
	void printModel()
    {
       
    }

	public loadFile()
	{
		
		for(i = 0; i < sonnet.length; i++)
		{
			loadStrings("filename.txt"); // Load a text file into a String array
			split(line, ' '); // Split a string into an array of words
			w.replaceAll("[^\\w\\s]",""); // Remove punction characters
			s.toLowerCase() // Convert a string to lower case 	 
	
		}
		
			
		
	}

	public findWord(str)
	{
		count++;
	}

	public findFollow(str)
	{
		return false;
	}

	public printModel()
	{

	}


}
