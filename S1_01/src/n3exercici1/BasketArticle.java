package n3exercici1;
/* De les notícies de bàsquet s’ha d’indicar a quina competició fa referència(String) 
 * i a quin club(String). 
 * Notícies de bàsquet:

    Preu inicial: 250 €

    Eurolliga: 75 €

    Barça o Madrid: 75 €
    
 Notícies de bàsquet:

    4 punts

    Eurolliga: 3 punts

    ACB: 2 punts

    Barça o Madrid: 1 punt*/


public class BasketArticle extends SportsArticle {
	private String competition;
	private String club;
	
	public BasketArticle (String title, String competition, String club) {
		super(title);
		this.competition = competition;
		this.club = competition;
		this.price = calcPrice();
		this.score = calcScore();
	}

	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public int calcPrice () {
		int price = 250;
		if (this.competition.equalsIgnoreCase("EuroLeague")) {
			price += 75;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			price += 75;
		}
		return price;
	}
	
	public int calcScore () {
		int score = 4;
		if (this.competition.equalsIgnoreCase("EuroLeague")) {
			score += 3;
		} else if (this.competition.equalsIgnoreCase("ABC")) {
			score += 2;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			score += 1;
		}
		return score;
	}
}
