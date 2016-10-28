
public class Deck {
	
	// properties / member variables
	private Card[] cards = new Card[52];
	
	//get & set methods
	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	//constructors
	public Deck(){
		//create an instance of each card
		int n = 0;
		for (int s=1; s<=4; s++){
			for (int v=1; v<=13; v++){
				Card c = new Card(v, s);
				cards[n++] = c;
			}
		}		
	}
	
	//other methods
	public void display(){
		for (int i =0; i<cards.length; i++){
			cards[i].display();
			
			if (i == 12 || i == 25 || i == 38 || i == 51) {
				System.out.println();
			}
		} System.out.println();
	}
	
	public void shuffle(int n){
		for (int i =0; i < n; i++){
			int r1 = (int)(Math.random() * 52);
			int r2 = (int)(Math.random() * 52);
			
			//Swap the card
			Card t = cards[r1];
			cards[r1] = cards[r2];
			cards[r2] = t;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		
		deck.display();
		deck.shuffle(1);
		
		deck.display();
		deck.shuffle(10);
		
		deck.display();
		deck.shuffle(100);
		
		
	}
}

