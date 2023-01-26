package model;


public class Mineur extends Visiteur{
	
	private int id_mineur;
	private String nom;
	private String prenom;
	private int age;
	private String cookies;//Enum COOKIE
	private String lait;

	public Mineur() {
		super();
	}

	public Mineur(int id_mineur, String nom, String prenom, int age, String cookies, String lait) {
		super();
		this.id_mineur = id_mineur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cookies = cookies;
		this.lait = lait;
	}


	public Mineur(String nom, String prenom, int age, String cookies, String lait) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cookies = cookies;
		this.lait = lait;
	}

	public int getId_mineur() {
		return id_mineur;
	}

	public void setId_mineur(int id_mineur) {
		this.id_mineur = id_mineur;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	public String getCookies() {
		return cookies;
	}

	public void setCookies(String cookies) {
		this.cookies = cookies;
	}

	public String getLait() {
		return lait;
	}

	public void setLait(String lait) {
		this.lait = lait;
	}

}
