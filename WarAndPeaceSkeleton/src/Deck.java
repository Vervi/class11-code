//import javax.smartcardio.Card;
import java.util.*;



public class Deck {

		private Card[] deck;
		private int deckSize=52;
		private int topCard;
		
public Deck() {
		

			deck = new Card [deckSize];
			//fill deck with card objects
		for (int i=0; i < deckSize; i++)
		{
			for(CardValue n: CardValue.values())

			{
			
				deck[i].value= n;

				for(CardSuit s: CardSuit.values())

				{

					deck[i].suit =s;

				}
			}	
				topCard=0; //index of card to dealt in deck array
								
				//shuffle deck
				List<Card> list = Arrays.asList(deck);
				Collections.shuffle(list);
				//https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html#shuffle
		}
 
}




	public Card draw() {

		//start at 52 count down random draw from deck
		if (topCard < deckSize)
		{
			return deck[topCard++];//deal top card then move index over 1
		}
		else
			System.out.println("I'd really like to help you but I can't deal what's not there...");
			return null;

	}// if we use an array and keep track of the index of cards to be returned and there ar eno duplicates
	 //shouldn't have to worry about actually deck objects from the array
		// if this doesnt work properly go back, return topcard then set that index to null 





}
