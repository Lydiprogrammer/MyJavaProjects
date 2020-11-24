
	/**
	 * @author Lidia Nagy
	 * The Stock Class keeps registered of books as follows: The Stock Class
	 * does not have getter and setter methods.
	 */

public class Stock {

	/**
	 * It has a non-public array in which stores books.
	 */
	private Book book;
	private Book book2;
	private Book[] books = { book, book2 };

	/**
	 * The constructor sets up the registered books.
	 */
	public Stock(Book[] books) {
		this.books = books;
	}

	/**
	 * There is an add method that accepts a book as a parameter. If is the book in
	 * the stock: It means that all of its fields are the same as any of the books.
	 * It increments the quantity field of the relevant element of the array by one.
	 * If a book is not found, indicate it in the program.
	 */
	public boolean add(Book addBook) {
		boolean registered = false;
		for (Book book : books) {
			if (!(book.equals(addBook))) {
				registered = false;
			} else if (book.equals(addBook)) {
				book.addQuantity(book, 1);
				System.out.println("A " + book + " mennyiségét megnöveltük eggyel.");
				return true;
			}
		}
		System.out.println("Nem található a könyv a nyilvántartásban.");
		return registered;
	}

	/**
	 * There is a sell method that accepts a book as a parameter. If the book is in
	 * stock, it reduces the quantity field of the relevant element of the array by
	 * one, unless the quantity is zero. The program indicates if the quantity is
	 * zero. If a book is not found, indicate it in the program.
	 */
	public boolean sell(Book sellBook) {
		boolean sell = false;
		for (Book book : books) {
			if (!(book.equals(sellBook))) {
				sell = false;
			} else if (book.equals(sellBook) && book.getQuantity() != 0) {
				book.substractQuantity(book, 1);
				System.out.println("A " + book + " mennyiségét csökkentettük eggyel.");
				return true;
			} else if (book.equals(sellBook) && book.getQuantity() == 0) {
				System.out.println("Ebből a könyből az összes elfogyott!");
				return false;
			}
		}
		System.out.println("Nem található a könyv a nyilvántartásban.");
		return sell;
	}

	/**
	 * There is a print method in which it writes Book instances under each other.
	 */
	public void print() {
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
