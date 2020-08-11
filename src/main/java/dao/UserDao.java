package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import utility.ConnectionManager;

public class UserDao implements UserDaoInterface {

	public int signup(User user) throws IOException {
		String INSERT_USERS_SQL="insert into USERS(email,password)values(?,?)";
		int result=0;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement(INSERT_USERS_SQL);
			st.setString(1, user.getEmail());
			st.setString(2, user.getPassword());
			System.out.println(st);
			result = st.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean loginUser(User user) throws IOException {
		boolean status = false;
		try {
			Connection con = ConnectionManager.getConnection();
			PreparedStatement st = con.prepareStatement("select * from USERS where email=? and password =?");
			st.setString(1, user.getEmail());
			st.setString(2, user.getPassword());
			ResultSet rs = st.executeQuery();
			status = rs.next();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

}
