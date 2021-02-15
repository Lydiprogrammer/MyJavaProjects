package insertcommandlineparametersintoadatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lidia Nagy
 * 
 * Create the ArgumentReader class.
 */
public class ArgumentReader {
	public static final String SQL_QUERY_SCRIPT = "SELECT argument_id FROM argument;";
	private Connection connection;

	/**
	 * In the class constructor, wait for a java.sql.Connection parameter that is stored in an instance-level field.
	 */
	
	public ArgumentReader(Connection connection) {
		this.connection = connection;
	}
	
	/**
	 * The class should have a getArguments method that returns all elements of the argument table in a java.util.List.
	 */
	public List<String> getArguments() throws SQLException {
		List<String> results = new ArrayList<>();
		try (Statement statement = this.connection.createStatement(); 
				ResultSet resultSet = statement.executeQuery(SQL_QUERY_SCRIPT)) {
			while (resultSet.next()) {
				results.add(resultSet.getString("argument_id"));
				System.out.println("The argument table contains the following: " + results);
			}
		}
		return results;
	}

}
