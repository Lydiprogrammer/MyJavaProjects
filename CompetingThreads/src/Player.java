import java.util.Random;

/**
 * @author Lidia Nagy
 */

public class Player implements Runnable {

	private static final Random RANDOM = new Random();

	private final Game game;

	public Player(Game game) {
		this.game = game;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		while (!game.isGameOver()) {
			int waitTime = 1000 + RANDOM.nextInt(1001);

			try {
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				// ignored
			}

			int guess = RANDOM.nextInt(10) + 1;

			System.out.println(threadName + " guessing: " + guess);

			game.guess(guess);

		}

		System.out.println(threadName + " finished");

	}

}
