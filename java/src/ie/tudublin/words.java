package ie.tudublin;
import processing.core.PApplet;
import java.util.ArrayList;

public class words extends PApplet {
   
   String w;
   ArrayList<follow> follow = new ArrayList<follow>();

    public void words(String w, ArrayList<follow> follow)
    {
        this.w = w;
        this.follow = new ArrayList<follow>();
    }
   

    public String getW() {
        return w;
    }


    public void setW(String w) {
        this.w = w;
    }


    public ArrayList<follow> getFollow() {
        return follow;
    }


    public void setFollow(ArrayList<follow> follow) {
        this.follow = follow;
    }


    public String toString()
	{
		String string;
		string = "Word:" + w;
		return string;
	}
}
