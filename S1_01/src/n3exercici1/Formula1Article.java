package n3exercici1;
/* De les notícies d'F1 hem de saber a quina escuderia(String) fan referència. 
 *Notícies d'F1:

    Preu inicial: 100 €

    Ferrari o Mercedes: 50 €
 
 Notícies F1:

    4 punts

    Ferrari o Mercedes: 2 punts*/


public class Formula1Article extends SportsArticle {
	private String racingTeam;
	
	public Formula1Article (String title, String racingTeam) {
		super(title);
		this.racingTeam = racingTeam;
		this.price = 0;
		this.score = 0;
	}

	public String getRacingTeam() {
		return racingTeam;
	}

	public void setRacingTeam(String racingTeam) {
		this.racingTeam = racingTeam;
	}
	
	public void calcPrice () {
		this.price = 100;
		if (this.racingTeam.equalsIgnoreCase("Ferrari") || this.racingTeam.equalsIgnoreCase("Mercedes")) {
			this.price += 50;
		}
		System.out.println("Price: " +this.price+ "€");
	}
	
	public void calcScore () {
		this.score = 4;
		if (this.racingTeam.equalsIgnoreCase("Ferrari") || this.racingTeam.equalsIgnoreCase("Mercedes")) {
			this.score += 2;
		}
		System.out.println("Score: " +this.score+ "pts");
	}
}
