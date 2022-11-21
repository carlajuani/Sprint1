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
		this.price = calcPrice();
		this.score = calcScore();
	}

	public String getRacingTeam() {
		return racingTeam;
	}

	public void setRacingTeam(String racingTeam) {
		this.racingTeam = racingTeam;
	}
	
	public int calcPrice () {
		int price = 100;
		if (this.racingTeam.equalsIgnoreCase("Ferrari") || this.racingTeam.equalsIgnoreCase("Mercedes")) {
			price += 50;
		}
		return price;
	}
	
	public int calcScore () {
		int score = 4;
		if (this.racingTeam.equalsIgnoreCase("Ferrari") || this.racingTeam.equalsIgnoreCase("Mercedes")) {
			score += 2;
		}
		return score;
	}
}
