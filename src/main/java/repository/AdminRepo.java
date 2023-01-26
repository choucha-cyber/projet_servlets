package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Admin;

public class AdminRepo {
	
Connection connect = Connect.getConnection();
	
	public boolean create(Admin object) {
		boolean msg = false;
		try {
			PreparedStatement req = connect
					.prepareStatement("INSERT INTO admin (nom, prenom, email, password) VALUES (?,?,?,?)");
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

}
