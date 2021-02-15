package insertcommandlineparametersintoadatabase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Lidia Nagy
 * 
 * Create the ArgumentInitializer class.
 */

public class ArgumentInitializer {

	public static final String SQL_DELETE_SCRIPT = "DELETE FROM argument;";
	private Connection connection;

	/**
	 * In the class constructor, wait for a java.sql.Connection parameter that is stored in an instance-level field.
	 */
	public ArgumentInitializer(Connection connection) {
		this.connection = connection;
	}
	

	/**
	 * Create an initialize method that deletes all rows from the argument table.
	 * After deleting, write out how many rows have been deleted.
	 */
	public void initialize() throws SQLException {
		try (Statement stm = this.connection.createStatement();) {
			int rowsAffected = stm.executeUpdate(SQL_DELETE_SCRIPT);
			System.out.println(rowsAffected + " row(s) deleted.");
		}
	}

}
