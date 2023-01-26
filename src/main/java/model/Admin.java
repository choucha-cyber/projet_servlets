package model;

public class Admin {
	
	private int id_admin;//AI
	private String nom;
	private String prenom;
	private String email;
	private String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id_admin, String nom, String prenom, String email, String password) {
		super();
		this.id_admin = id_admin;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	public Admin(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	public int getId_admin() {
		return id_admin;
	}
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
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
