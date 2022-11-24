package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
	private String name;
	private int score;
	
	public Restaurant(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}

	@Override
	public String toString() {
		return "Restaurant [Name: " + name + ", Score: " + score + "]\n";
	}

	@Override
	public int compareTo(Restaurant o) {
		// TODO Auto-generated method stub
		int comparatorName = o.getName().compareTo(this.getName());
		int result = 0;
		if (comparatorName > 0) {
			result = -1;
		} else if (comparatorName == 0){
			if (this.getScore() < o.getScore()) {
				result = -1;
			} else if (this.getScore() > o.getScore()) {
				result = 1;
			}
		} else {
			result = 1;
		}
		return result;
	}
}
