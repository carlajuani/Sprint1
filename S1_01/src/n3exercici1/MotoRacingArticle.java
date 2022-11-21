package n3exercici1;
/* De les notícies de motociclisme s’ha d’indicar de quin equip(String) són.
 * Notícies de motociclisme:

    Preu inicial: 100 €

    Honda o Yamaha: 50 €

 * Notícies de Motociclisme:

    3 punts

    Honda o Yamaha: 3 punts */

public class MotoRacingArticle extends SportsArticle {
private String racingTeam;
	
	public MotoRacingArticle (String title, String racingTeam) {
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
		if (this.racingTeam.equalsIgnoreCase("Honda") || this.racingTeam.equalsIgnoreCase("Yamaha")) {
			price += 50;
		}
		return price;
	}
	
	public int calcScore () {
		int score = 3;
		if (this.racingTeam.equalsIgnoreCase("Honda") || this.racingTeam.equalsIgnoreCase("Yamaha")) {
			score += 3;
		}
		return score;
	}
}
