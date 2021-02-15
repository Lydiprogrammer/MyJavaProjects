package insertcommandlineparametersintoadatabase;

import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 * @author Lidia Nagy
 * 
 * Create a Java program that fill a table in the database with command line parameters and then reads them.
 * Create a homework33 schema in the database and create a table called argument.
 * There should be a single column of text in the argument table.
 * Create the executable ArgumentWriter class, configure some parameters for the main method in Eclipse in the Run Configurations window.
 * When the program starts, greet the user and join the homework33 schema.
 * Create an instance of ArgumentInitializer, ArgumentInserter, and ArgumentReader.
 * In the following, we first initialize the table with the ArgumentInitializer class, and then use ArgumentInserter to insert the command line arguments into the
 * table.
 * Finally, we use ArgumentReader to extract the contents of the database and write the values ​​to the standard output one below the other.
 */


public class ArgumentWriter {
	
	public static final String HOST = "localhost";
	public static final int PORT = 3306;
	public static final String DATABASE = "homework33";
	public static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
	public static final String SETTINGS = "?useUnicode=true&serverTimezone=UTC";
	private static final String URL2 = URL + SETTINGS;


	public static void main(String[] args) {
		System.out.println("Command line parameters: " + Arrays.toString(args));
		System.out.println("Welcome :) ");
		try (Connection connection = getConnection(URL2, "root", Password);
				Statement statement = connection.createStatement() ) {
			ArgumentInitializer argumentInitializer = new ArgumentInitializer(connection);
			argumentInitializer.initialize();
			ArgumentInserter argumentInserter = new ArgumentInserter(connection);
				for(int i = 0; i < args.length; i++) {
					argumentInserter.insert(args[i]);
				}
				ArgumentReader argumentReader = new ArgumentReader(connection);
				argumentReader.getArguments();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
