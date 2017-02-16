
import java.util.ArrayList;
import java.util.Scanner;

public class objectRunner3
	{
		static ArrayList<finalProject> deck = new ArrayList<finalProject>();
		static String response;

		public static void main(String[] args)
			{
				fillArray();
				printList();
				hitOrStay();
				shuffleDeck();
			}
		
		public static void fillArray()
		{
			deck.add(new finalProject("King", "Hearts", 13));
			deck.add(new finalProject("King", "Spades", 13));
			deck.add(new finalProject("King", "Clubs", 13));
			deck.add(new finalProject("King", "Diamonds", 13));
			deck.add(new finalProject("Queen", "Hearts", 12));
			deck.add(new finalProject("Queen", "Spades", 12));
			deck.add(new finalProject("Queen", "Clubs", 12));
			deck.add(new finalProject("Queen", "Diamonds", 12));
			deck.add(new finalProject("Ace", "Hearts", 11));
			deck.add(new finalProject("Jack", "Spades", 11));
			deck.add(new finalProject("Jack", "Clubs", 11));
			deck.add(new finalProject("Jack", "Diamonds", 11));
			deck.add(new finalProject("10", "Hearts", 10));
			deck.add(new finalProject("10", "Spades", 10));
			deck.add(new finalProject("10", "Clubs", 10));
			deck.add(new finalProject("10", "Diamonds", 10));
			deck.add(new finalProject("9", "Hearts", 9));
			deck.add(new finalProject("9", "Spades", 9));
			deck.add(new finalProject("9", "Clubs", 9));
			deck.add(new finalProject("9", "Diamonds", 9));
			deck.add(new finalProject("8", "Hearts", 8));
			deck.add(new finalProject("8", "Spades", 8));
			deck.add(new finalProject("8", "Clubs", 8));
			deck.add(new finalProject("8", "Diamonds", 8));
			deck.add(new finalProject("7", "Hearts", 7));
			deck.add(new finalProject("7", "Spades", 7));
			deck.add(new finalProject("7", "Clubs", 7));
			deck.add(new finalProject("7", "Diamonds", 7));
			deck.add(new finalProject("6", "Hearts", 6));
			deck.add(new finalProject("6", "Spades", 6));
			deck.add(new finalProject("6", "Clubs", 6));
			deck.add(new finalProject("6", "Diamonds", 6));
			deck.add(new finalProject("5", "Hearts", 5));
			deck.add(new finalProject("5", "Spades", 5));
			deck.add(new finalProject("5", "Clubs", 5));
			deck.add(new finalProject("5", "Dimonds", 5));
			deck.add(new finalProject("4", "Hearts", 4));
			deck.add(new finalProject("4", "Spades", 4));
			deck.add(new finalProject("4", "Clubs", 4));
			deck.add(new finalProject("4", "Diamonds", 4));
			deck.add(new finalProject("3", "Hearts", 3));
			deck.add(new finalProject("3", "Spades", 3));
			deck.add(new finalProject("3", "Clubs", 3));
			deck.add(new finalProject("3", "Spades", 3));
			deck.add(new finalProject("2", "Hearts", 2));
			deck.add(new finalProject("2", "Spades", 2));
			deck.add(new finalProject("2", "clubs", 2));
			deck.add(new finalProject("2", "Diamonds", 2));

		}
	public static void shuffleDeck()
	{
		for (int i = 0; i < deck.size(); i++)
			{
				printList();
			}
	}
		
	public static void printList()
	{
		
		for (int i = 0; i < deck.size(); i++)
			{
				System.out.println(deck.get(i).getSuit() + 
						" of " + deck.get(i).getType());
			}
	}
	public static void hitOrStay()
	{
		Scanner userInput1 = new Scanner(System.in);
		System.out.println("Would you like to hit or stay?");
		String response = userInput1.nextLine();
		
		if (response == "hit")
			System.out.println("You have choosen to hit!");
		
		if (response == "stay")
			System.out.println("You have choosen to stay!");
		
		
	}
	}
