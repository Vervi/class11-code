
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		
		// TODO: gameplay
		
		//while counter is less than 52, draw from each deck,
		//if p1 card>p2 p1score++ else p2 score++ unless it is a tie in which case move to next draw
		//display final score
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
		
	}

}
