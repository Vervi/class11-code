
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		int round = 0;
	
		//create 2 deck objects
		//call winner on p1 deck
		//adjsut score accordingly=
	
		
		Card p1;
		Card p2;
		Boolean result = null;
		
		do{
			
			p1 = player1.draw();
			p2 = player2.draw();
				
			result = p1.winner(p2);
				if(result == Boolean.TRUE)
				{
					player1Score++;
					System.out.println("Player 1 wins round: " + round);
				}
				else if(result == Boolean.FALSE)
				{
					player2Score++;
					System.out.println("Player 1 wins round: " + round);
				}
				else if(result == null)
				{
					System.out.println("Round: " + round + " has resulted in a tie");
				}
			
			
			round++;
		}
		
		while(round < HANDS);
		//while counter is less than 52, draw from each deck,
		//if p1 card>p2 p1score++ else p2 score++ unless it is a tie in which case move to next draw
		//display final score
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
			}

}
