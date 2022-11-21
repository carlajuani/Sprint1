package n3exercici1;
/* De les notícies de tenis s’ha de saber de quina competició(String) 
 * parlen i de quins tenistes(String). 
 * Notícies de tenis:

    Preu inicial: 150 € 

    Federer, Nadal o Djokovic: 100 €

	Notícies de Tenis:

    4 punts

    Federer, Nadal o Djokovic: 3 punts */

public class TennisArticle extends SportsArticle {
	private String competition;
	private String player;
	
	public TennisArticle (String title, String competition, String player) {
		super(title);
		this.competition = competition;
		this.player = player;
		this.price = calcPrice();
		this.score = calcScore();
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	public int calcPrice () {
		int price = 150;
		if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
			price += 50;
		}
		return price;
	}
	
	public int calcScore () {
		int score = 4;
		if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
			score += 3;
		}
		return score;
	}
}
