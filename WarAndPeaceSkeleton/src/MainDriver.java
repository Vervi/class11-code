
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {

		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
					
		int player1Score = 0, player2Score = 0;
		int round = 0;
	
		Card p1;
		Card p2;
		Boolean result = null;
		
		do
		{	
			p1 = player1.draw();
			p2 = player2.draw();
				
			result = p1.winner(p2);
				if(result == Boolean.TRUE)
				{
					player1Score++;
					System.out.println(p1.toString() + " beats " + p2.toString());
					System.out.println("Player 1 wins round: " + round);
				}
				else if(result == Boolean.FALSE)
				{
					player2Score++;
					System.out.println(p2.toString() + " beats " + p1.toString());
					System.out.println("Player 2 wins round: " + round);
				}
				else if(result == null)
				{
					System.out.println("Round: " + round + " has resulted in a tie");
				}
			
			round++;
			
		}while(round < HANDS);
	
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		
			}
}