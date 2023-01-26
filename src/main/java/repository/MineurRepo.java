package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Mineur;


public class MineurRepo {

	static Connection connect = Connect.getConnection();
	
	public boolean create(Mineur object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect
					.prepareStatement("INSERT INTO mineur (nom, prenom, age, cookies, lait) VALUES (?,?,?,?,?)");
			req.setString(1, object.getNom());
			req.setString(2, object.getPrenom());
			req.setInt(3, object.getAge());
			req.setString(4, object.getCookies());
			req.setString(5, object.getLait());

			req.executeUpdate();

			msg = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertion KO");
		}
		return msg;
	}
	
	public static List<Mineur> read() {
		List<Mineur> listeMineurs = new ArrayList<>();

		// CRUD - Read
		ResultSet rs = null;
		PreparedStatement sql2;
		try {
			sql2 = connect.prepareStatement("SELECT * FROM mineur");

			rs = sql2.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id_mineur"));

				Mineur mineur = new Mineur(rs.getString("nom"), rs.getString("prenom"), rs.getInt("age"), rs.getString("cookies"), rs.getString("lait"));
						

				listeMineurs.add(mineur);
			}
			
			return listeMineurs;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeMineurs;
	}
	
	public Mineur findById(int id) {
		Mineur mineur = null;
		try {
			PreparedStatement req = connect.prepareStatement("SELECT * FROM mineur WHERE id_mineur = ?");

			req.setInt(1, id);

			ResultSet resultSet = req.executeQuery();

			if (resultSet.next()) {
				int id_mineur=resultSet.getInt("id_mineur");
				String nom = resultSet.getString("nom");
				String prenom = resultSet.getString("prenom");
				int age=resultSet.getInt("age");
				String cookies=resultSet.getString("cookies");
				String lait=resultSet.getString("lait");
						
				//String nom, String prenom, int age, Object cookies, Object lait
				mineur = new Mineur(nom, prenom, age, cookies, lait);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("find KO");
		}

		return mineur;
	}

}
