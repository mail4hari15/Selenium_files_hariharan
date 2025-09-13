package week3.day2;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connected to the database using JavaConnection.");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from the database.");
	}

	@Override
	public void executeUpdate(String query) {
		// TODO Auto-generated method stub
		  System.out.println("Executing update query: "+ query);
	}

}


