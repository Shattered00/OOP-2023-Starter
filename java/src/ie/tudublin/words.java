package ie.tudublin;
import processing.core.PApplet;
import java.util.ArrayList;

public class words extends PApplet {
   
   String w;

   ArrayList<follow> follow = new ArrayList<follow>();

    public void words(String w)
    {
        this.w = w; 
    }

    public String toString()
	{
		String string;
		string = "Word:" + w;
		return string;
	}
}
