package n3exercici1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/* A la classe principal s’ha de fer un menú amb les següents opcions:

1.- Introduir redactor.

2.- Eliminar redactor.

3.- Introduir notícia a un redactor.

4.- Eliminar notícia (ha de demanar redactor i titular de la notícia).

5.- Mostrar totes les notícies per redactor.

6.- Calcular puntuació de la notícia.

7.- Calcular preu-notícia. */

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FALTARIA CANVIAR ELS IF ELSE DELS INDEXOUTOFBOUNDS/-1 PER UN MÈTODE INTERMIG/THROW EXCEPTION
		ArrayList<Writer> editorialStaff = new ArrayList<Writer>();
	    boolean exit=false;
	    do
	    {
	      System.out.println("\n1.New writer");
	      System.out.println("2.Remove writer");
	      System.out.println("3.New writer's article");
	      System.out.println("4.Remove writer's article");
	      System.out.println("5.Show writer's articles");
	      System.out.println("6.Calculate article's score");
	      System.out.println("7.Calculate article's price");
	      System.out.println("8.Exit\n");
	      int selectedOption = scanningForInt("Please select an option number from the menu:");
	      switch(selectedOption)
	      {
	       case 1: //add new writer to array
	    	   addNewWriter(editorialStaff);
	    	   break;
	    	   
	       case 2: //remove writer from array
	    	   removeWriterFromArray(editorialStaff);
	    	   break;
	    	   
	       case 3: //add article to writer (in Array), first selecting type of article and creating each with a different method
	    	   SportsArticle article = null;
	    	   boolean chosen = false;
		   	    do
		   	    {
		   	      System.out.println("\n1.Football article");
		   	      System.out.println("2.Basket article");
		   	      System.out.println("3.Tennis article");
		   	      System.out.println("4.Formula1 article");
		   	      System.out.println("5.Moto racing articles");
			   	  selectedOption = scanningForInt("Please select the article's theme number from the menu:");
				  switch(selectedOption)
				  {
			       case 1: //
			    	   article = createFootballArticle();
			    	   chosen=true;
			    	   break;
			    	   
			       case 2: //
			    	   article = createBasketArticle();
			    	   chosen=true;
			    	   break;
			    	   
			       case 3: //
			    	   article = createTennisArticle();
			    	   chosen=true;
			    	   break;
			    	   
			       case 4: //
			    	   article = createFormula1Article();
			    	   chosen=true;
			    	   break;
			    	   
			       case 5: //
			    	   article = createMotoRacingArticle();
			    	   chosen=true;
			    	   break;
			       	  }
			      }while(!chosen);
		   	    addArticleToWriter(editorialStaff, article);
	    	   break;
	    	   
		   case 4: //Remove article from arrayList articles, from writer from staff arrayList
			   removeWritersArticle(editorialStaff);
	    	   break;
	    	   
		   case 5: //show writer's articles arrayList from arrayList staff
			   showWritersArticles(editorialStaff);
	    	   break;
	    	   
		   case 6: //Calculate article's score
			   showArticlesScoreOrPrice(editorialStaff, 's');
			   break;
	    	   
		   case 7: //Calculate article's price
			   showArticlesScoreOrPrice(editorialStaff, 'p');
			   break;

	       case 8:
	    	   exit=true;
	    	   System.out.println("Goodbye, come back soon!");
	    	   break;
	       	  }
	      }while(!exit);
	}
	
	//case 1
	static ArrayList<Writer> addNewWriter (ArrayList<Writer> editorialStaff) {
		editorialStaff.add(createWriter());
 	    System.out.println("The writer was successfully added to the staff database");
		return editorialStaff;
	}
	
	//case 2
	static ArrayList<Writer> removeWriterFromArray (ArrayList<Writer> editorialStaff) {
		int writersIndex = searchIndexInArray(editorialStaff, scanningForString("Please indicate writer's dni"));
 	    if (writersIndex == -1) {
 		    System.out.println("ERROR. The writer is not in the staff database");
 	    } else {
		    editorialStaff.remove(writersIndex);
		    System.out.println("The writer was successfully removed from the staff database"); 
 	    }
		return editorialStaff;
	}
	
	//case 3
	static ArrayList<Writer> addArticleToWriter (ArrayList<Writer> editorialStaff, SportsArticle article) {
		int writersIndex = searchIndexInArray(editorialStaff, scanningForString("Please indicate writer's dni"));
   	    if (writersIndex == -1) {
   	    	System.out.println("ERROR. The writer is not in the staff database");
   	    } else {
	    	editorialStaff.get(writersIndex).addArticle(article);
		    System.out.println("The article was added correctly to the database");
   	    }
		return editorialStaff;
	}
	
	//case 4
	static ArrayList<Writer> removeWritersArticle (ArrayList<Writer> editorialStaff) {
		int writersIndex = searchIndexInArray(editorialStaff, scanningForString("Please indicate writer's dni"));
		   if (writersIndex == -1) {
			   System.out.println("ERROR. The writer is not in the staff database");  
		   } else {
			   int articlesIndex = editorialStaff.get(writersIndex).searchIndexInArray(scanningForString("Please indicate the article's title"));
			   if (articlesIndex == -1) {
				   System.out.println("ERROR. The article is not in the writer's database");
		   	   } else {
		   		   editorialStaff.get(writersIndex).removeArticle(articlesIndex);
		    	   System.out.println("The article was deleted successfully from the writer's collection");
		   	   } 
		   }   
		return editorialStaff;
	}
	
	//case 5
	static void showWritersArticles(ArrayList<Writer> editorialStaff) {
		int writersIndex = searchIndexInArray(editorialStaff, scanningForString("Please indicate writer's dni"));
		   if (writersIndex == -1) {
			   System.out.println("ERROR. The writer is not in the staff database");
	   	   } else {
	   		   System.out.println("Articles:\n" +editorialStaff.get(writersIndex).showArticles()); 
	   	   }
	}
	
	//case 6 and 7 score/price
	static void showArticlesScoreOrPrice(ArrayList<Writer> editorialStaff, char atribute) {
		int writersIndex = searchIndexInArray(editorialStaff, scanningForString("Please indicate writer's dni"));
		   if (writersIndex == -1) {
			   System.out.println("ERROR. The writer is not in the staff database");  
		   } else {
			   int articlesIndex = editorialStaff.get(writersIndex).searchIndexInArray(scanningForString("Please indicate the article's title"));
			   if (articlesIndex == -1) {
				   System.out.println("ERROR. The article is not in the writer's database");
		   	   } else {
		   		   if (atribute == 's') {
		   			   System.out.println("Score: " +editorialStaff.get(writersIndex).getArticles().get(articlesIndex).getScore()+ "pts"); 
		   		   } else if (atribute == 'p') {
		   			   System.out.println("Price: " +editorialStaff.get(writersIndex).getArticles().get(articlesIndex).getPrice()+ "€");
		   		   }
		   	   }
		   } 
	}
	
	
	//returns new object class writer with both atributes through the methods scan for string
	static Writer createWriter () {
		return new Writer (scanningForString("Please indicate name"), scanningForString("Please indicate DNI"));
	}
	
	//creates variables with all atributes needed through the method scan for string and sets this variables as parameters to create a new article
	static FootballArticle createFootballArticle () {
		String title = scanningForString("Please introduce the article's title");
		String competition = scanningForString("Please introduce the competition is it about");
		String club = scanningForString("Please introduce the club is it about");
		String player = scanningForString("Please introduce the player is it about");
		return new FootballArticle (title, competition, club, player);
	}
	
	//creates variables with all atributes needed through the method scan for string and sets this variables as parameters to create a new article
	static BasketArticle createBasketArticle () {
		String title = scanningForString("Please introduce the article's title");
		String competition = scanningForString("Please introduce the competition is it about");
		String club = scanningForString("Please introduce the club is it about");
		return new BasketArticle (title, competition, club);
	}
	
	//creates variables with all atributes needed through the method scan for string and sets this variables as parameters to create a new article
	static TennisArticle createTennisArticle () {
		String title = scanningForString("Please introduce the article's title");
		String competition = scanningForString("Please introduce the competition is it about");
		String player = scanningForString("Please introduce the player is it about");
		return new TennisArticle (title, competition, player);
	}
	
	//creates variables with all atributes needed through the method scan for string and sets this variables as parameters to create a new article
	static Formula1Article createFormula1Article () {
		String title = scanningForString("Please introduce the article's title");
		String racingTeam = scanningForString("Please introduce the racing team is it about");
		return new Formula1Article (title, racingTeam);
	}
	
	//creates variables with all atributes needed through the method scan for string and sets this variables as parameters to create a new article
	static MotoRacingArticle createMotoRacingArticle () {
		String title = scanningForString("Please introduce the article's title");
		String racingTeam = scanningForString("Please introduce the racing team is it about");
		return new MotoRacingArticle (title, racingTeam);
	}
		
	
	//returns the writer's index with the parameters arrayList staff and the writer's dni
	static int searchIndexInArray (ArrayList<Writer> editorialStaff, String writersDni) {
		int index = -1;
 		boolean indexFound = false;
 		int i = 0;
 		while (i<editorialStaff.size() && !indexFound) {
 			if (editorialStaff.get(i).getDni().equalsIgnoreCase(writersDni)) {
 				index = i;
 				indexFound = true;
 			}
 			i++;
 		}
 		return index;
	}
	
	static int scanningForInt(String message) {
		int inputInt = 0;
	    boolean correct = false;
	    Scanner setInt = new Scanner(System.in);
	    do {
	        System.out.println(message);
	        try {
	        	inputInt = setInt.nextInt();
	        	correct = true;
	        } catch (InputMismatchException ex) {
	        	System.out.println("ERROR. Input type mismatch");
	        }
	     	setInt.nextLine();
	    } while (!correct);
	    return inputInt;
	}
	
 	static double scanningForDouble(String message) {
		double inputDouble = 0.0;
	    boolean correct = false;
	    Scanner setDouble = new Scanner(System.in);
	    do {
	        System.out.println(message);
	        try {
	        	inputDouble = setDouble.nextDouble();
	        	correct = true;
	        } catch (InputMismatchException ex) {
	        	System.out.println("ERROR. Input type mismatch");
	        }
	     	setDouble.nextLine();
	    } while (!correct);
	    return inputDouble;
	}
	
	static String scanningForString(String message) {
		Scanner setString = new Scanner(System.in);
		System.out.println(message);
		return setString.nextLine();
	}
	
	static char scanningForChar(String message) {
		Scanner setChar = new Scanner(System.in);
		System.out.println(message);
		return setChar.next().charAt(0);
	}

}
