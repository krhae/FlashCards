
public class FlashCard {
	
	private String term;
	private String definition;

	public FlashCard() {
		this.term = "";
		this.definition = "";
	}
	
	public FlashCard(String term, String definition) {
		this.term = term;
		this.definition = definition;
	}
	
	public void setTerm(String newTerm) {
		this.term = newTerm;
	}
	
	public String getTerm() {
		return this.term;
	}
	
	public void setDefinition(String newDefinition) {
		this.definition = newDefinition;
	}
	
	public String getDefinitino() {
		return this.definition;
	}

}
