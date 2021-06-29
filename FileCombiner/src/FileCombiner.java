import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * @author Lidia Nagy
 */

/**
 * Short description of the task:
 * 
 * Create a Java program that contains a solution for combining files. The user
 * can specify the names of the files, which the program will open and, in the
 * order in which the file names are given, combine them and save them in a new
 * file with the result.
 * 
 * Create an executable Java class, in which the user is asked for 2+1
 * filenames, and the program creates two FileInputStream and one
 * FileOutputStream, where the combined file is saved.
 *
 * The merge is solved with the operations of InputStream and OutputStream.
 * 
 */

public class FileCombiner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the first filename: ");
		String nameOFirstFile = scanner.nextLine();

		System.out.print("Please enter the second filename: ");
		String nameOfSecondFile = scanner.nextLine();

		System.out.print("Please enter the third filename: ");
		String nameOfThirdFile = scanner.nextLine();

		// Scan files (compress)
		try (InputStream inputStream1 = new FileInputStream(nameOFirstFile);
				InputStream inputStream2 = new FileInputStream(nameOfSecondFile);

				// I decide which file I want to write to
				OutputStream outputStream = new FileOutputStream(nameOfThirdFile)) {

			// I write all bytes in the combined_file.txt
			outputStream.write(inputStream1.readAllBytes());
			outputStream.write(inputStream2.readAllBytes());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
