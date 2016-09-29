import javax.smartcardio.Card;

public class Deck {

	
	Card a;

		
	publCardeck() {
		
		Set<Card> deck;
		for(CardValue n: CardValue.values())
		{
			a.CardValue= n;
			for(CardSuit s: CardSuit.values())
			{
				a.CardSuit =s;
				deck.add(a);
			}
		}
		
		
	}

	public Card draw() {
		//start at 52 count down random draw from deck
		

	}


}
