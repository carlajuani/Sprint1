package n3exercici1;
/* En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i 
motociclisme.

La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i el sou.
 Un cop assignat un DNI, aquest no podrà canviar mai. Tots els redactors tenen el mateix sou, i si en un futur 
 l’empresa pot incrementar-lo, 
ho farà a tothom per igual. De moment el sou actual és de 1500 €.

Cada redactor pot treballar en més d’una notícia.  */

import java.util.ArrayList;

public class Writer {
	private String name;
	private final String dni;
	private static double salary;
	protected ArrayList<SportsArticle> articles;

	
	public Writer (String name, String dni) {
		this.name = name;
		this.dni = dni;
		salary = 1500.0;
		this.articles = new ArrayList<SportsArticle>();
	}
	
	public String getName () {
		return this.name;
	}
	
	public String getDni () {
		return this.dni;
	}
	
	public static double getSalary () {
		return salary;
	}
	
	public ArrayList<SportsArticle> getArticles () {
		return this.articles;	
	}
	
	//setters
	public void setName (String name) {
		this.name = name;
	}
	
	//specific methods
	public void addArticle (SportsArticle article) {
		articles.add(article);
	}
	
	public void removeArticle (int articlesIndex) {
		articles.remove(articlesIndex);
	}
	
	public String showArticles () {
		String articlesToShow = "";
		for (int i = 0; i<this.articles.size(); i++) {
			articlesToShow += this.articles.get(i).toString() + "\n";
		}
		return articlesToShow;
	}
	
	public int searchIndexInArray (String articlesTitle) {
		int index = -1;
 		boolean indexFound = false;
 		int i = 0;
 		while (i<this.articles.size() && !indexFound) {
 			if (this.articles.get(i).getTitle().equalsIgnoreCase(articlesTitle)) {
 				index = i;
 				indexFound = true;
 			}
 			i++;
 		}
 		return index;
	}
}
