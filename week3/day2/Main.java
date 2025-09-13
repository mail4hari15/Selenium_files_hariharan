package week3.day2;

public class Main {

	public static void main(String[] args) {
		DatabaseConnection db = new JavaConnection();
		db.connect();
		db.executeUpdate("UPDATE users SET name='Hari' WHERE id=1");
		db.disconnect();

	}

}
