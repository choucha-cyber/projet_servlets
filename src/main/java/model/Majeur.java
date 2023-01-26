package model;


public class Majeur extends Visiteur{
	
	private int id_majeur;
	private String nom;
	private String prenom;
	private int age;
	private String boissons;
	private String vote; //oui || non/ne sais pas == non
	
	public Majeur() {
		super();
	}

	public Majeur(int id_majeur, String nom, String prenom, int age, String boissons, String vote) {
		super();
		this.id_majeur = id_majeur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.boissons = boissons;
		this.vote = vote;
	}
	
	

	public Majeur(String nom, String prenom, int age, String boissons, String vote) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.boissons = boissons;
		this.vote = vote;
	}

	public int getId_majeur() {
		return id_majeur;
	}

	public void setId_majeur(int id_majeur) {
		this.id_majeur = id_majeur;
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

	public String getBoissons() {
		return boissons;
	}

	public void setBoissons(String boissons) {
		this.boissons = boissons;
	}

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}


}
