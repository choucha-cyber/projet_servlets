package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Visiteur;

public class VisiteurRepo {
	static Connection connect = Connect.getConnection();
	
	public boolean create(Visiteur object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect
					.prepareStatement("INSERT INTO visiteur (nom, prenom, email, password) VALUES (?,?,?,?)");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setString(3, object.getEmail());
			req.setString(4, object.getPassword()); //a encode

			req.executeUpdate();

			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion KO");
		}
		return msg;
	}

	public static List<Visiteur> read() {
		List<Visiteur> listeVisiteurs = new ArrayList<>();

		// CRUD - Read
		ResultSet rs = null;
		PreparedStatement sql2;
		try {
			sql2 = connect.prepareStatement("SELECT * FROM visiteur");

			rs = sql2.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id_visiteur"));

				Visiteur visiteur = new Visiteur(rs.getString("nom"), rs.getString("prenom"));
						

				listeVisiteurs.add(visiteur);
			}
			
			return listeVisiteurs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeVisiteurs;
	}
	
	public Visiteur findById(int id) {
		Visiteur visiteur = null;
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM visiteur WHERE id_visiteur = ?");

			req.setInt(1, id);

			ResultSet resultSet = req.executeQuery();

			if (resultSet.next()) {
				int id_visiteur=resultSet.getInt("id_visiteur");
				String nom = resultSet.getString("nom");
				String prenom = resultSet.getString("prenom");
				

				visiteur = new Visiteur(nom, prenom);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("find KO");
		}

		return visiteur;
	}

}
