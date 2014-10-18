import java.util.ArrayList;
import java.util.List;


public class CardDeck {

	private String cardDeckTitle;
	private List<FlashCard> flashCards;
	
	public CardDeck() {
		this.cardDeckTitle = "";
		this.flashCards = new ArrayList<FlashCard>();
	}
	
	public CardDeck(String deckTitle, FlashCard card) {
		this.cardDeckTitle = deckTitle;
		this.flashCards = new ArrayList<FlashCard>();
		this.flashCards.add(card);
	}
	
	public void addNewFlashCard(FlashCard newCard) {
		this.flashCards.add(newCard);
	}
	
	public void addNewFlashCard(String term, String definition) {
		this.flashCards.add(new FlashCard(term, definition));
	}
	
	public void removeFlashCard(FlashCard irrelevantCard) {
		this.flashCards.remove(irrelevantCard);
	}

}
