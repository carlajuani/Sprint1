package n3exercici1;

import java.util.Objects;

public class Persona {
	private String name;
	private String surname;
	private String dni;
	
	public Persona(String name, String surname, String dni) {
		this.name = name;
		this.surname = surname;
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + ", dni=" + dni + "]\n";
	}

	@Override
	public int compareTo(Persona o) {
		int comparatorName = o.getName().compareTo(this.getName());
		int result = 0;
		if (comparatorName > 0) {
			result = -1;
		} else {
			result = 1;
		}
		return result;
	}
	
	
}
