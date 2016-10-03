//import javax.smartcardio.Card;
import java.util.*



public class Deck {

	



		Private Card[] deck;
	
	
		Private int deckSize=52;
		
public deck() {
		

		cardDeck = new Card [deckSize];
			
		/*
		for (int i=0; i < deck Size; i++)
		{
			for(CardValue n: CardValue.values())

			{
			
			 cardDeck[i].CardValue= n;

				for(CardSuit s: CardSuit.values())

				{

				cardDeck[i].CardSuit =s;

			}
		
		}
  */
		

		//can probably simplify this loop, might not even need the outer loop

		int i=0;
			for (CardValue v: CardValue.values())
				for(CardSuit s: CardSuit.values())
				cardDeck[i++] = new Card(v,s);
			
	
	}




	public Card draw() {

		//start at 52 count down random draw from deck
		




	}





}
