
/**
 * @author Lidia Nagy
 */

public class GameMain {

	public static void main(String[] args) throws InterruptedException {

		Game game = new Game();

		Thread player1 = new Thread(new Player(game), "Player 1 ");
		Thread player2 = new Thread(new Player(game), " Player 2 ");

		System.out.println("--- GAME STARTED --- ");

		player1.start();
		player2.start();

		player1.join();
		player2.join();

		System.out.println(" --- Game Over --- ");
		Thread winner = game.getWinner();
		System.out.println("The winner: " + winner.getName());
	}

}
