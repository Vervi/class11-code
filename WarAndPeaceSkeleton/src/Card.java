import javax.smartcardio.Card;


public class Card {
	
	CardValue value;
	CardSuit suit;
	
	
	public String toString() {
		//TODO: complete this method definition
		
		/*String str="";
		str+=(a.Value).toString();
		str+= " of ;"
		str+=(a.Suit).toString();*/
		
		return value + " of " suit;
		
	}
	

	public boolean winner(Card c) {
			// TODO: complete this method definition
	}
	
	public card() {
	
	}
	
}
