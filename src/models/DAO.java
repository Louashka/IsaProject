package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	public static Connection getConnection(){
		
		Connection con = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/isaProject";
			String login = "postgres";
			String password = "postgres";
			con = DriverManager.getConnection(url, 
					login, password);
			System.out.println("Соединение успешно установлено");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Ошибка соединения");
		} 
		
		return con;
	}
	
	public static ArrayList<User> getUsers(){
		Connection con = getConnection();
		ArrayList<User> list = new ArrayList<>();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users");
			while(rs.next()){
				User user = new User(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), Integer.parseInt(rs.getString(5)), Integer.parseInt(rs.getString(6)));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Ошибка извлечения данных");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return list;
		
	}
	
	public static void addUser(User user){	
		
		Connection con = getConnection();	
		String sql = "insert into users (id,nickname, password_, "
		 + "email, level_, progress) values (?,?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, user.getId());
			stmt.setString(2, user.getNickname());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, user.getEmail());
			stmt.setInt(5, user.getLevel());
			stmt.setInt(6, user.getProgress());
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Ошибка записи данных");
		}
	}
	
	public static void deleteUsers(ArrayList<User> users){
		
		Connection con = getConnection();	
		String sql = "delete from users where "
				+ "id = ?";
		
		for (User user: users){
			PreparedStatement stmt;
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, user.getId());
				stmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
		}
		
	}
	
	
}
