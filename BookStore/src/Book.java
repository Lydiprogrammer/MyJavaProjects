
	/**
	 * @author Lidia Nagy
	 * Create a bookstore warehouse management program as follows.
	 */

public class Book {
	
	/**
	 * The book class has the following attributes.
	 */
	private String name;
	private String nameOfAuthor;
	private int yearOfPublication;
	private int quantity;

	/**
	 * Create a constructor that initializes the name, year of publication, and name of author.
	 * But sets the quantity to 0, because there is no book in warehouse at first.
	 */
	public Book(String name, int yearOfPublication, String nameOfAuthor) {
		this.name = name;
		this.yearOfPublication = yearOfPublication;
		this.nameOfAuthor = nameOfAuthor;
		this.quantity = 0;
	}

	/**
	 * Write the Book Class's public void toString() method to assign
	 * the following text representation to the Book Class instances:
	 * <author>: <name> <yearOfPublication> [<quantity>]
	 */
	public String toString() {
		return nameOfAuthor + ": " + name + " (" + yearOfPublication + ") " + "[" + quantity + "]";
	}

	/**
	 * Create getter and setter methods.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfAuthor() {
		return nameOfAuthor;
	}

	public void setNameOfAuthor(String nameOfAuthor) {
		this.nameOfAuthor = nameOfAuthor;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public int addQuantity(Book book, int quantity) {
		this.quantity += quantity;
		return this.quantity;
	}

	public int substractQuantity(Book book, int quantity) {
		this.quantity -= quantity;
		return this.quantity;
		
	}

}
