package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

@SuppressWarnings("unused")
public class projectApp {

	@SuppressWarnings("unused")
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
 DbConnection.getConnection();
	}

}
