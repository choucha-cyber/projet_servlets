package model;

public class Visiteur {
	
	private int id_visiteur;//AI
	private String nom;
	private String prenom;
	private String email;
	private String password;
	public Visiteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Visiteur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}
	public Visiteur(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	
	public int getId_visiteur() {
		return id_visiteur;
	}
	public void setId_visiteur(int id_visiteur) {
		this.id_visiteur = id_visiteur;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
