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
		this.price = 0;
		this.score = 0;
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
	
	public void calcPrice () {
		this.price = 250;
		if (this.competition.equalsIgnoreCase("EuroLeague")) {
			this.price += 75;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			this.price += 75;
		}
		System.out.println("Price: " +this.price+ "€");
	}
	
	public void calcScore () {
		this.score = 4;
		if (this.competition.equalsIgnoreCase("EuroLeague")) {
			this.score += 3;
		} else if (this.competition.equalsIgnoreCase("ABC")) {
			this.score += 2;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			this.score += 1;
		}
		System.out.println("Score: " +this.score+ "pts");
	}
}
