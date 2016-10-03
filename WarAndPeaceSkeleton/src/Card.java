import java.lang.Enum.*;


public class Card {
	
	CardValue value;
	CardSuit suit;
	
	
	public String toString() {
				
		return value + " of " + suit;
		}
	

	public boolean winner(Card c) {
			// this assumes that the game is running up town
		if ((this.value).compareTo(c.value)== 0)	// in case of a tie in numeric value
		{
			if ((this.suit).compareTo(c.suit)== 0) //nobody wins
			{
				return null;
			}
			if ((this.suit).compareTo(c.suit)> 0)
			{
				return true;
			}
			if ((this.suit).compareTo(c.suit) < 0)
			{
				return false;
			}
			
		}
		if ((this.value).compareTo(c.value) > 0)
		{
			return true;
		}
	
		if ((this.value).compareTo(c.value) < 0)
		{
			return false;
		}
	
		
		
	}
	
	
	
}
