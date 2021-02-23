package practice;
public class DeckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int deck[] = new int[52];
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
		String ranks[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		// Initialize card
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// Shuffle Card
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Display all the cards
		for (int i = 0; i < deck.length; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
	}
}
