package com.cards;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String players[][] = new String[4][9];
		Cards obj = new Cards();
		
		obj.displayDeck();
		obj.assortRandom(players);
		obj.display(players);
		
	}

}