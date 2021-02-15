package insertcommandlineparametersintoadatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Lidia Nagy
 * 
 * Create the ArgumentInserter class.
 */
public class ArgumentInserter {
	public static final String SQL_INSERT_SCRIPT = "INSERT INTO argument(argument_id) VALUES (?);";
	private Connection connection;

	/**
	 * In the class constructor, wait for a java.sql.Connection parameter that is stored in an instance-level field.
	 */
	public ArgumentInserter(Connection connection) {
		this.connection = connection;
	}
	

	/**
	 * The class should have an insert method that inserts the String parameter into the argument table.
	 */
	public void insert(String parameter) throws SQLException {
		try (PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT_SCRIPT);) {
			preparedStatement.setString(1, parameter);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println(rowsAffected + " row changed: " + SQL_INSERT_SCRIPT);
		}

	}

}
