import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CardBox extends JFrame {
	
	// Panel Title
	private final String PROGRAM_NAME = "Flash Card Box";
	
	// Flashcards
	private static CardDeck cards;
	
	// Panel Bounds
	private final int x = 100;
	private final int y = 100;
	private final int right = 500;
	private final int bottom = 350;

	// GUI constants
	private JLabel label = new JLabel("");
	private JPanel panel = new JPanel();
	private JButton reveal = new JButton("Reveal Definition");
	
	public CardBox() {
		// Set program Title Name
		super("Flash Card Box"); 
		
		this.cards = new CardDeck();
		
		_initialiseUI();
	}	
	
	private void _initialiseUI() {
	    setBounds( x, y, right, bottom);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    Container container = this.getContentPane(); // inherit main frame
	    container.add(panel);    // JPanel containers default to FlowLayout
	    reveal.setMnemonic('\r'); // associate hotkey to button
	    
	    panel.add(label);
	    panel.add(reveal); 
	    
	    reveal.requestFocus();
	    setVisible(true); // make frame visible
	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		
		if(source == reveal) {
			
		}
	}
	
	public static void main(String[] args) {
		FlashCard card = new FlashCard("Dog", "An animal with four legs.");
		cards = new CardDeck("Animals 101", card);
		
		new CardBox();
		
		while(true) {
			
		}
	} 

}
