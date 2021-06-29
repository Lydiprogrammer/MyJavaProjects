import java.util.Random;

/**
 * @author Lidia Nagy
 */

/**
 * Short description of the task:
 * 
 * Let's create a Java program that simulates a number guessing game with 2
 * players, each with a thread. When the game starts, a initialize a random
 * number between 1 and 10 (inclusive) and then the two threads that are started
 * when the game starts are randomly will try to hit the number with randomly
 * generated numbers. If a thread hits the number, the game ends immediately and
 * prints program will display the name of the winning thread.
 * 
 * 
 * Tasks:
 * 
 * The numbers generated in the exercise should always be in the range 1-10.
 * Create a Game class, initialize a number in its constructor and save it in an
 * instance variable. Make a method for the Game class that players will call to
 * give their guess. If a player has sent the correct number and the game is not
 * over, then record the winner in an instance variable.
 * 
 * The Game class should provide a way to query the game state in a boolean
 * method. This operation defines, whether the players can continue guessing or
 * the game is over. Before starting the game, create a Game instance and a
 * Thread for each player.
 * 
 * Players should wait 1-2 seconds (random time) before each attempt. Players
 * should stop as soon as the game is over. The main thread, in the main method
 * is to wait for players to enter and then announce a result and then stop.
 * 
 */

public class Game {
	private static final Random RANDOM = new Random();

	private final int number;
	private Thread winner;

	public Game() {
		this.number = 1 + RANDOM.nextInt(10);
		System.out.println("The secret number: " + number);
	}

	public synchronized void guess(int guess) {
		if (winner == null && guess == number) {
			winner = Thread.currentThread();
		}
	}

	public synchronized boolean isGameOver() {
		return winner != null;
	}

	public Thread getWinner() {
		return winner;
	}

}
