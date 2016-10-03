import java.util.*;



public class Deck {

		private Card[] deck;
		private Card top;
		private int deckSize=52;
		private int topCard=0;
		
public Deck() {
		
			Card[] deck = new Card [deckSize];
			//fill deck with card objects
			topCard =0;
			int count = 0;
			for(CardValue v: CardValue.values())
			{	
				for(CardSuit s: CardSuit.values())
				{
					deck[count]= new Card(v,s);
					count++;
				}
			}
				List<Card> list = Arrays.asList(deck);
				Collections.shuffle(list);
				//https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html#shuffle
			
		}
 
public Card draw() {
	   	//if i have an array of card objects
		// i should be able to use return a card from it w/o running into null pointer expectuisb
		topCard++;
		if(topCard < deckSize)
		{
			return deck[topCard-1];
		}
		else
			System.out.println("oops, i think the deck is empty...");
			return null;

	}
	
	
}
