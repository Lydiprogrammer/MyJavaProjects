
public class BookStore {
	/**
	 * @author Lidia Nagy
	 * Create two books in the main method of BookStore Class.
	 */

	public static void main(String[] args) {
		
		Book book = new Book("A teljesség felé", 2000, "Weöres Sándor");
		System.out.println(book.toString());
		Book book2 = new Book("Kódolj", 2018, "David Whitney");
		System.out.println(book2.toString());
		Book[] books = {book, book2};
		System.out.println();
		
		Stock stock = new Stock(books);
		stock.add(book);
		stock.add(book2);
		stock.print();
		System.out.println();
		stock.sell(book);
		stock.sell(book2);
		System.out.println();
		stock.sell(book);
		stock.sell(book2);
		System.out.println();
		stock.print();
	}

}
