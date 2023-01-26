package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import model.Boissons;
import model.Majeur;

public class MajeurRepo {

	static Connection connect = Connect.getConnection();

	public boolean create(Majeur object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect
					.prepareStatement("INSERT INTO majeur (nom, prenom, age, boisson, vote) VALUES (?,?,?,?,?)");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setInt(3, object.getAge());
			req.setString(4, object.getBoissons()); 
			req.setString(5, object.getVote());

			req.executeUpdate();

			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion KO");
		}
		return msg;
	}

	public static List<Majeur> read() {
		List<Majeur> listeMajeurs = new ArrayList<>();

		// CRUD - Read
		ResultSet rs = null;
		PreparedStatement sql2;
		try {
			sql2 = connect.prepareStatement("SELECT * FROM majeur");

			rs = sql2.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id_majeur"));

				// String nom, String prenom, int age, Boissons boissons, boolean vote
				Majeur majeur = new Majeur(rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"),
						 rs.getString("boisson"), rs.getString("vote"));

				listeMajeurs.add(majeur);
			}

			return listeMajeurs;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeMajeurs;
	}

	public Majeur findById(int id) {
		Majeur majeur = null;
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM majeur WHERE id_majeur = ?");

			req.setInt(1, id);

			ResultSet resultSet = req.executeQuery();

			if (resultSet.next()) {
				int id_mineur = resultSet.getInt("id_majeur");
				String nom = resultSet.getString("nom");
				String prenom = resultSet.getString("prenom");
				int age = resultSet.getInt("age");
				String boisson = resultSet.getString("boisson");
				String vote = resultSet.getString("vote");

				
				majeur = new Majeur(nom, prenom, age, boisson, vote);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("find KO");
		}

		return majeur;
	}

}
