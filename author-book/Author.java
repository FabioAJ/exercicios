/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 23/01/2019
Objetivo sucinto do programa: cria uma classe Author
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1Znd6TTkM0lh0M9vUTP1yVve8KSKEn8TlKzfJf8zyX9U/edit 
*/

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "name = " + name + ", email = " + email + ", gender = " + gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (name.equalsIgnoreCase(other.getName()) && email.equalsIgnoreCase(other.getEmail())) {
			return true;
		}
		return false;
	}
	

}
