package ie.tudublin;

import processing.core.PApplet;
public class follow extends PApplet {
    
    String word;
	int count;
    
    public void Follow(String word, int count)
	{
		this.word = word;
		this.count = count;
	}

    public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString()
	{
		String string;
		string = "Word:" + word + "Count:" + count;
		return string;
	}
}
