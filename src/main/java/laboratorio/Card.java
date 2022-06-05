package laboratorio;
import java.util.ArrayList;
public class Card extends ArrayList<Object>{
    // Declaracion
    public ArrayList<Object> carta;
    // Métodos
    public int numCards(){
        return carta.size();
    }
    public int findTotalCards(){
        int tamanio = carta.size()-1;
        return tamanio * tamanio + tamanio + 1;
    }
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
