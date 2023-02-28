package assignment03;
public class TestCard {
    static Card card = new Card();
    public static void main(String[] args){
        card.setCard(14);
        card.displayState();
        card.setCard(27, 'h');
        card.displayState();
    }
}