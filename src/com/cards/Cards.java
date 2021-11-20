package com.cards;

public class Cards {

	String [][] deck = new String[4][13];
	String [] distributed_cards = new String[36];
	int count = 0;
	
	public Cards() {
		// TODO Auto-generated constructor stub
		String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack"
				, "Queen", "King", "Ace"};
		
		String [] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				deck[i][j] = "(" + suit[i] + " " + rank[j] + ")";
			}
		}
	}
	
	public void assortRandom(String[][] players) {
		
		int rank;
		int suit;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				rank = (int)( Math.random() * 13 );
				suit = (int)( Math.random() * 4 );
				
				if ( !check(deck[suit][rank]) ) {
					j--;
					continue;
				}
				players[i][j] = deck[suit][rank];
				distribute(deck[suit][rank]);
			}
		}
		
	}
	
	public void display(String [][] players) {
		for (int i = 0; i < 4; i++) {
			System.out.print("\n Player " + (i + 1) + " has: ");
			for (int j = 0; j < 4; j++) {
				System.out.print(" " + players[i][j]);
			}
		}
	}
	
	public void displayDeck() {
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				System.out.print(" " + deck[i][j]);
			}
			System.out.println();
		}
	}
	
	public void distribute(String card) {
		System.out.println(" assorting " + card);
		distributed_cards[count++] = card;
	}
	
	public boolean check(String pickedCard) {
		for (int i = 0; i < count; i++) {
			if(distributed_cards[i].equals(pickedCard)) {
				System.out.println(" repeated found " + pickedCard);
				return false;
			}
		}
		return true;
	}
}