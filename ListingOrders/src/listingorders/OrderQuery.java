package listingorders;

import static java.sql.DriverManager.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Lidia Nagy
 * 
 * Create a Java program that lists orders for standard output from the orders table.
 * Create the OrderQuery class and the static method listOrders in it, which has a java.sql.Connection parameter.
 * In the method, perform a query using PreparedStatement, which returns the order_id and price columns from the orders table, which are printed by the program.
 * to standard output.
 */

public class OrderQuery {
	static final String HOST = "localhost";
	static final int PORT = 3306;
	static final String DATABASE = "orders_joins";
	static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
	private static final String URL2 = URL + "?useUnicode=true&serverTimezone=UTC";

	public static void main(String[] args) {
		try (Connection connection = getConnection(URL2, "root", Password)) {
			OrderQuery.listOrders(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void listOrders(Connection connection) throws SQLException {
		String sqlScript = "Select order_id, price FROM orders;";
		/**
		 * I check that the sql statement is correct or not.
		 */
		System.out.println(sqlScript);
		try (PreparedStatement prepareStatement = connection.prepareStatement(sqlScript);) {
			try (ResultSet resultSet = prepareStatement.executeQuery();) {
				while (resultSet.next()) {
					String orderId = resultSet.getString("order_id");
					String price = resultSet.getString("price");
					System.out.println(orderId + " " + price);
				}
			}

		}

	}

}