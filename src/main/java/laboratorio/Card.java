package laboratorio;
import java.util.ArrayList;
public class Card extends ArrayList<Object>{
    // Declaracion
    public ArrayList<Object> carta;
    // Métodos
    // Constructor
    public Card() {
        this.carta = new ArrayList<>();
    }
    public ArrayList<Object> getCarta() {

        return carta;
    }

    public void setCarta(ArrayList<Object> carta) {

        this.carta = carta;
    }
    public boolean equals(Card C1){
        Card cardaux = new Card();
        cardaux.addAll(C1);
        cardaux.removeAll(carta);
        if(cardaux.size() == 0){
            return true;
        }
        return false;
    }
}
