package n3exercici1;

import java.util.ArrayList;
/* Les notícies han de tenir un titular, un text, una puntuació i un preu. 
En el moment de crear-se, el text ha d’estar buit. */

public abstract class SportsArticle {
	protected String title;
	protected String text;
	protected int score;
	protected int price;
	
	public SportsArticle (String title) {
		this.title = title;
		text = "";
		score = 0;
		price = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void calcPrice ();
	
	public abstract void calcScore ();
	
	public String toString () {
		return "Title: " +this.title+ "\nBody: " +this.text+ "\nScore: " +this.score+ "pts\nPrice: " +this.price+ "€\n\n";
	}
}
