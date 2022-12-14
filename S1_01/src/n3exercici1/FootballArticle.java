package n3exercici1;
/* A més, de les notícies de futbol s’ha de saber a quina competició fa referència(String), 
 * a quin club(String) i a quin jugador(String). 
 * Les notícies es venen a diferents mitjans. Per saber el preu de cada notícia hem d'implementar un mètode que es diu calcularPreuNoticia(). 

A continuació s’explica com calcular el preu de cada notícia:
Notícies de futbol: 

    Preu inicial: 300 €

    Lliga de Campions: 100 €

    Barça o Madrid: 100 €

    Ferran Torres o Benzema: 50 €
    Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga de Campions, 
    té un preu de 550 €.
   
    Per calcular les puntuacions de les notícies se segueixen els següents criteris:

Notícies de futbol:

    5 Punts.

    Lliga de Campions: 3 punts

    Lliga: 2 punts

    Barça o Madrid: 1 punt

    Ferran Torres o Benzema: 1 punt

Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça 
a la Lliga de Campions, té una puntuació de 10 punts.*/


public class FootballArticle extends SportsArticle {
	private String competition;
	private String club;
	private String player;
	
	public FootballArticle (String title, String competition, String club, String player) {
		super(title);
		this.competition = competition;
		this.club = club;
		this.player = player;
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

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	public void calcPrice () {
		this.price = 300;
		if (this.competition.equalsIgnoreCase("Champions League")) {
			this.price += 100;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			this.price += 100;
		}
		if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
			this.price += 50;
		}
		System.out.println("Price: " +this.price+ "€");
	}
	
	public void calcScore () {
		this.score = 5;
		if (this.competition.equalsIgnoreCase("Champions League")) {
			this.score += 3;
		} else if (this.competition.equalsIgnoreCase("League")) {
			this.score += 2;
		}
		if (this.club.equalsIgnoreCase("Barca") || this.club.equalsIgnoreCase("Madrid")) {
			this.score += 1;
		}
		if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
			this.score += 1;
		}
		System.out.println("Score: " +this.score+ "pts");
	}
}
