/*
 * 
 * Luke Kraus
 * CS 0445
 * John Ramerirez
 * Tues/Thurs. 9:30-10:45
 * Recitation- Thurs: 11-11:50
 * 
 * 
 * The purpose of this file is to create the entire game of war. It beings by taking in a number from the command line and using this argument as the number of rounds the game
 * of war is supposed to go until. Next the cards are created and added to the multiDS. They are all implimented from the MultiDs and Card class. They are then shuffled and delt
 * out to the two different players. The two players then play the game of war by placing one card down and comparing the cards to one another. Whoever wins the hand gets the cards
 * and adds them to their discard pile. These cards are then shuffled and added to the regular hand whenever the regular hand runs out of cards. If there is a war than the 
 * regualar procedure for a war takes place. Both players place one card down to risk and then compare the second card. They continue to play until all cards are gone from one player
 * or they reach the round limit. If the round limit is reached the cards are counted and compared. The player with more cards wins or a tie happens if both are the same.
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class War {
	
	 //creates the storage places for the cards
			//the first is the deck of cards and the next two are the two players hands after the cards are delt out
			static MultiDS<Card> myCards = new MultiDS<Card>(52);
			static MultiDS<Card> player1 = new MultiDS<Card>(52);
			static MultiDS<Card> player2 = new MultiDS<Card>(52);
			static MultiDS<Card> player1Discard = new MultiDS<Card>(52);
			static MultiDS<Card> player2Discard = new MultiDS<Card>(52);
			static MultiDS<Card> warPile = new MultiDS<Card>(52);		


	public static void main(String [] args){
	
		
		
		
		int rounds = 0;
		//takes the command line and turns it into an int
		int total = Integer.parseInt(args[0]);
		
		System.out.println("Welcome to the game of War");
		System.out.println("Now dealing the cards to the players...");
		//creates all of the cards individually assigning them their suit and card value
		Card c1 = new Card(Card.Suits.Diamonds, Card.Ranks.Two);
		Card c2 = new Card(Card.Suits.Hearts, Card.Ranks.Two);
		Card c3 = new Card(Card.Suits.Clubs, Card.Ranks.Two);
		Card c4 = new Card(Card.Suits.Spades, Card.Ranks.Two);
		Card c5 = new Card(Card.Suits.Diamonds, Card.Ranks.Three);
		Card c6 = new Card(Card.Suits.Hearts, Card.Ranks.Three);
		Card c7 = new Card(Card.Suits.Clubs, Card.Ranks.Three);
		Card c8 = new Card(Card.Suits.Spades, Card.Ranks.Three);
		Card c9 = new Card(Card.Suits.Diamonds, Card.Ranks.Four);
		Card c10 = new Card(Card.Suits.Hearts, Card.Ranks.Four);
		Card c11 = new Card(Card.Suits.Clubs, Card.Ranks.Four);
		Card c12 = new Card(Card.Suits.Spades, Card.Ranks.Four);
		Card c13 = new Card(Card.Suits.Diamonds, Card.Ranks.Five);
		Card c14 = new Card(Card.Suits.Hearts, Card.Ranks.Five);
		Card c15 = new Card(Card.Suits.Clubs, Card.Ranks.Five);
		Card c16 = new Card(Card.Suits.Spades, Card.Ranks.Five);
		Card c17 = new Card(Card.Suits.Diamonds, Card.Ranks.Six);
		Card c18 = new Card(Card.Suits.Hearts, Card.Ranks.Six);
		Card c19 = new Card(Card.Suits.Clubs, Card.Ranks.Six);
		Card c20 = new Card(Card.Suits.Spades, Card.Ranks.Six);
		Card c21 = new Card(Card.Suits.Diamonds, Card.Ranks.Seven);
		Card c22 = new Card(Card.Suits.Hearts, Card.Ranks.Seven);
		Card c23 = new Card(Card.Suits.Clubs, Card.Ranks.Seven);
		Card c24 = new Card(Card.Suits.Spades, Card.Ranks.Seven);
		Card c25 = new Card(Card.Suits.Diamonds, Card.Ranks.Eight);
		Card c26 = new Card(Card.Suits.Hearts, Card.Ranks.Eight);
		Card c27 = new Card(Card.Suits.Clubs, Card.Ranks.Eight);
		Card c28 = new Card(Card.Suits.Spades, Card.Ranks.Eight);
		Card c29 = new Card(Card.Suits.Diamonds, Card.Ranks.Nine);
		Card c30 = new Card(Card.Suits.Hearts, Card.Ranks.Nine);
		Card c31 = new Card(Card.Suits.Clubs, Card.Ranks.Nine);
		Card c32 = new Card(Card.Suits.Spades, Card.Ranks.Nine);
		Card c33 = new Card(Card.Suits.Diamonds, Card.Ranks.Ten);
		Card c34 = new Card(Card.Suits.Hearts, Card.Ranks.Ten);
		Card c35 = new Card(Card.Suits.Clubs, Card.Ranks.Ten);
		Card c36 = new Card(Card.Suits.Spades, Card.Ranks.Ten);
		Card c37 = new Card(Card.Suits.Diamonds, Card.Ranks.Jack);
		Card c38 = new Card(Card.Suits.Hearts, Card.Ranks.Jack);
		Card c39 = new Card(Card.Suits.Clubs, Card.Ranks.Jack);
		Card c40 = new Card(Card.Suits.Spades, Card.Ranks.Jack);
		Card c41 = new Card(Card.Suits.Diamonds, Card.Ranks.Queen);
		Card c42 = new Card(Card.Suits.Hearts, Card.Ranks.Queen);
		Card c43 = new Card(Card.Suits.Clubs, Card.Ranks.Queen);
		Card c44 = new Card(Card.Suits.Spades, Card.Ranks.Queen);
		Card c45 = new Card(Card.Suits.Diamonds, Card.Ranks.King);
		Card c46 = new Card(Card.Suits.Hearts, Card.Ranks.King);
		Card c47 = new Card(Card.Suits.Clubs, Card.Ranks.King);
		Card c48 = new Card(Card.Suits.Spades, Card.Ranks.King);
		Card c49 = new Card(Card.Suits.Diamonds, Card.Ranks.Ace);
		Card c50 = new Card(Card.Suits.Hearts, Card.Ranks.Ace);
		Card c51 = new Card(Card.Suits.Clubs, Card.Ranks.Ace);
		Card c52 = new Card(Card.Suits.Spades, Card.Ranks.Ace);
		
		
		
		//adds all of the cards into the deck
		myCards.addItem(c1);
		myCards.addItem(c2);
		myCards.addItem(c3);
		myCards.addItem(c4);
		myCards.addItem(c5);
		myCards.addItem(c6);
		myCards.addItem(c7);
		myCards.addItem(c8);
		myCards.addItem(c9);
		myCards.addItem(c10);
		myCards.addItem(c11);
		myCards.addItem(c12);
		myCards.addItem(c13);
		myCards.addItem(c14);
		myCards.addItem(c15);
		myCards.addItem(c16);
		myCards.addItem(c17);
		myCards.addItem(c18);
		myCards.addItem(c19);
		myCards.addItem(c20);
		myCards.addItem(c21);
		myCards.addItem(c22);
		myCards.addItem(c23);
		myCards.addItem(c24);
		myCards.addItem(c25);
		myCards.addItem(c26);
		myCards.addItem(c27);
		myCards.addItem(c28);
		myCards.addItem(c29);
		myCards.addItem(c30);
		myCards.addItem(c31);
		myCards.addItem(c32);
		myCards.addItem(c33);
		myCards.addItem(c34);
		myCards.addItem(c35);
		myCards.addItem(c36);
		myCards.addItem(c37);
		myCards.addItem(c38);
		myCards.addItem(c39);
		myCards.addItem(c40);
		myCards.addItem(c41);
		myCards.addItem(c42);
		myCards.addItem(c43);
		myCards.addItem(c44);
		myCards.addItem(c45);
		myCards.addItem(c46);
		myCards.addItem(c47);
		myCards.addItem(c48);
		myCards.addItem(c49);
		myCards.addItem(c50);
		myCards.addItem(c51);
		myCards.addItem(c52);
		
		//shuffles the deck of cards
		myCards.shuffle();
				
		//deals out the deck of cards until the deck of 52 cards is finished. 
		int count2 = 0;
		while(count2 < 26){
		
		player1.addItem(myCards.removeItem());	
		player2.addItem(myCards.removeItem());
		count2++;
			
		}
		//prints out the hands that each player has
		System.out.println(" ");
		System.out.println("Player 1 cards\n" + player1.toString());
		System.out.println(" ");
		System.out.println("Player 2 cards\n" +player2.toString());
		System.out.println(" ");
		
		
		while(rounds < total){
			//begins the regualr exectution of the program. As long as the players hand is not empty they will remove a card from their hand and compare it to the 
			//opponents hand. If the player does not have enough cards they will shuffle their discard pile and add them to their regular hand. If both are empty than the player
			//loses.
			if(player1.empty()){
				
				if(player1Discard.empty()){
				System.out.println("Player 2 Wins because Player 1 ran out of cards!");

				break;
				}
				System.out.println("Shuffling deck and adding discard piles");
				player1Discard.shuffle();
				while(!player1Discard.empty()){
					player1.addItem(player1Discard.removeItem());
				}


			}
			
			if(player2.empty()){
				if(player2Discard.empty()){
				System.out.println("Player 1 Wins becuase Player 2 ran out of cards!");
				break;
				}
				System.out.println("Shuffling deck and adding discard piles");
				player2Discard.shuffle();
				while(!player2Discard.empty()){
					player2.addItem(player2Discard.removeItem());
				}
				
			
			}
			Card p1 = player1.removeItem();
			Card p2 = player2.removeItem();
			if(p1 != null & p2 != null){
				compareCards(p1, p2);	
			}
			
			//if the founds limit is reached than the cards are counted and compared
			rounds++;
			if(rounds == total){
				
				int totalP1 = (player1.count)+(player1Discard.count);
				int totalP2 = (player2.count) + (player2Discard.count);
				System.out.println("The round limit has been reached. Counting cards... ");
				if(totalP1 > totalP2){
					System.out.println("Player 1 Card Total: "+ totalP1);
					System.out.println("Player 2 Card Total: "+ totalP2);
					System.out.println("Player 1 Wins");
				}
				else if(totalP1 < totalP2){
					System.out.println("Player 1 Card Total: "+ totalP1);
					System.out.println("Player 2 Card Total: "+ totalP2);
					System.out.println("Player 2 Wins");
				}
				else{
					System.out.println("Player 1 Card Total: "+ totalP1);
					System.out.println("Player 2 Card Total: "+ totalP2);
					System.out.println("The two players have the same number of cards. The game ends in a tie.");
				}
				
			}
		}
		
		
	}
	
	
	
	
//method to handle the comparing of cards	
	public static void compareCards(Card x, Card y)
	{
		
		if(x != null || (y != null)){
			
		int result = x.compareTo(y);
		//if player1 wins the hand
		if (result > 0){
			System.out.println("Player 1 wins: "+x + " beats " + y);
			player1Discard.addItem(x);
			player1Discard.addItem(y);}
		//if player 2 wins the hand
		else if (result < 0){
			System.out.println("Player 2 wins: "+x + " loses to " + y);
			player2Discard.addItem(x);
			player2Discard.addItem(y);
			
		}
		//if a war happens
		else
		{
			System.out.println(x + " ties " + y);
			warPile.addItem(x);
			warPile.addItem(y);
			if(player1.empty()){
				System.out.println("Shuffling deck and adding discard piles");
				player1Discard.shuffle();
				while(!player1Discard.empty()){
					player1.addItem(player1Discard.removeItem());
				}
			}
			else if(player2.empty()){
				System.out.println("Shuffling deck and adding discard piles");
				player2Discard.shuffle();
				while(!player2Discard.empty()){
					
					player2.addItem(player2Discard.removeItem());
				}
			}
			if(!player1.empty() && (!player2.empty())){
			Card war1 = player1.removeItem();
			Card war2 = player2.removeItem();
			System.out.println("Player 1 is risking " + war1);
			System.out.println("Player 2 is risking " + war2);
			warPile.addItem(war1);
			warPile.addItem(war2);
			}
			if(player1.empty()){
				
				if(player1Discard.empty()){
				System.out.println("Player 2 Wins because Player 1 ran out of cards!");
				System.exit(0);
				
				}
				System.out.println("Shuffling deck and adding discard piles");
				player1Discard.shuffle();
				while(!player1Discard.empty()){
					player1.addItem(player1Discard.removeItem());
				}


			}
			if(player2.empty()){
				if(player2Discard.empty()){
				System.out.println("Player 1 Wins becuase Player 2 ran out of cards!");
				System.exit(0);
				
				}
				System.out.println("Shuffling deck and adding discard piles");
				player2Discard.shuffle();
				while(!player2Discard.empty()){
					player2.addItem(player2Discard.removeItem());
				}
			}
			if(!player1.empty() && (!player2.empty())){
				Card w1 = player1.removeItem();
				Card w2 = player2.removeItem();
				if(w1 != null & w2 != null){
				int warResult = w1.compareTo(w2);
				
				warPile.addItem(w1);
				warPile.addItem(w2);
				if(warResult > 0){
					System.out.println("Player 1 wins " + w1 + " beats " + w2);
					while(!warPile.empty()){
						player1Discard.addItem(warPile.removeItem());
					}
				}else if(warResult < 0){
					System.out.println("Player 2 wins " + w2 + " beats " + w1);
					while(!warPile.empty()){
						player2Discard.addItem(warPile.removeItem());
					}
				}
				}
				
			}
			
				
		}	
	}
	}
}
