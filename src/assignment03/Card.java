package assignment03;

public class Card {
	int value;
	String name;
	String file_name;
	static String cards[][] = {
			 { "Ace of clubs", "Ace_of_clubs.png" },
			 { "2 of clubs", "2_of_clubs.png" },
			 { "3 of clubs", "3_of_clubs.png" },
			 { "4 of clubs", "4_of_clubs.png" },
			 { "5 of clubs", "5_of_clubs.png" },
			 { "6 of clubs", "6_of_clubs.png" },
			 { "7 of clubs", "7_of_clubs.png" },
			 { "8 of clubs", "8_of_clubs.png" },
			 { "9 of clubs", "9_of_clubs.png" },
			 { "10 of clubs", "10_of_clubs.png" },
			 { "Jack of clubs", "Jack_of_clubs.png" },
			 { "Queen of clubs", "Queen_of_clubs.png" },
			 { "King of clubs", "King_of_clubs.png" },
			 { "Ace of diamonds", "Ace_of_diamonds.png" },
			 { "2 of diamonds", "2_of_diamonds.png" },
			 { "3 of diamonds", "3_of_diamonds.png" },
			 { "4 of diamonds", "4_of_diamonds.png" },
			 { "5 of diamonds", "5_of_diamonds.png" },
			 { "6 of diamonds", "6_of_diamonds.png" },
			 { "7 of diamonds", "7_of_diamonds.png" },
			 { "8 of diamonds", "8_of_diamonds.png" },
			 { "9 of diamonds", "9_of_diamonds.png" },
			 { "10 of diamonds", "10_of_diamonds.png" },
			 { "Jack of diamonds", "Jack_of_diamonds.png" },
			 { "Queen of diamonds", "Queen_of_diamonds.png" },
			 { "King of diamonds", "King_of_diamonds.png" },
			 { "Ace of hearts", "Ace_of_hearts.png" },
			 { "2 of hearts", "2_of_hearts.png" },
			 { "3 of hearts", "3_of_hearts.png" },
			 { "4 of hearts", "4_of_hearts.png" },
			 { "5 of hearts", "5_of_hearts.png" },
			 { "6 of hearts", "6_of_hearts.png" },
			 { "7 of hearts", "7_of_hearts.png" },
			 { "8 of hearts", "8_of_hearts.png" },
			 { "9 of hearts", "9_of_hearts.png" },
			 { "10 of hearts", "10_of_hearts.png" },
			 { "Jack of hearts", "Jack_of_hearts.png" },
			 { "Queen of hearts", "Queen_of_hearts.png" },
			 { "King of hearts", "King_of_hearts.png" },
			 { "Ace of spades", "Ace_of_spades.png" },
			 { "2 of spades", "2_of_spades.png" },
			 { "3 of spades", "3_of_spades.png" },
			 { "4 of spades", "4_of_spades.png" },
			 { "5 of spades", "5_of_spades.png" },
			 { "6 of spades", "6_of_spades.png" },
			 { "7 of spades", "7_of_spades.png" },
			 { "8 of spades", "8_of_spades.png" },
			 { "9 of spades", "9_of_spades.png" },
			 { "10 of spades", "10_of_spades.png" },
			 { "Jack of spades", "Jack_of_spades.png" },
			 { "Queen of spades", "Queen_of_spades.png" },
			 { "King of spades", "King_of_spade.png" }
	};
	
	public int getValue() {
		return value+1;
	}
	public void setValue(int value) {
		this.value = value-1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
	public void setCard(int number) {
		this.value = number;
		this.name = cards[number][0];
		this.file_name = cards[number][1];
	}

	public void setCard(int number, char ace_value) {
		if (number < 1 || number > 52) throw new RuntimeException("Not a valid card number!");
		if (ace_value == 'h') this.value = 11;
		else this.value = number-1;
		this.name = cards[number-1][0];
		this.file_name = cards[number-1][1];
	}

	public void displayState(){
		System.out.println(this.getName());
		System.out.println(this.getValue());
		System.out.println("Filename: " + this.getFile_name());
	}
}





















































