package laboratorio;
import java.util.ArrayList;
public class Dobble {

    //metodos
    //verifica si el numero ingresado es primo o no
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
    //creacion del set de cartas en base a la pagina entregada en el laboratorio
    public ArrayList<Card> setConstructor(ArrayList<Object> elements, Integer numE, Integer maxC){
        int n = numE - 1;
        Card Carta1 = new Card();
        ArrayList<Card> Cartas = new ArrayList<>();
        for(int i = 1; i <=n + 1; i++) {
            Carta1.add(elements.get(i-1));
        }
        Cartas.add(Carta1);
        for(int j = 1; j<=n; j++){
            Card Carta2 = new Card();
            Carta2.add(elements.get(0));
            for (int k = 1; k <=n; k++){
                int valor = n * j + (k + 1);
                int newvalor = valor - 1;
                Carta2.add(elements.get(newvalor));
            }
            Cartas.add(Carta2);
        }
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                Card Carta3 = new Card();
                Carta3.add(i + 1);
                for (int k = 1; k <= n; k++) {
                    int valor = n + 2 + n * (k - 1) + (((i - 1) * (k - 1) + j - 1) % n);
                    int newvalor2 = valor - 1;
                    Carta3.add(elements.get(newvalor2));
                }
                Cartas.add(Carta3);
            }
        }
        if(maxC <= 0 || maxC > Carta1.findTotalCards()){
            return Cartas;
        }
        else{
            ArrayList<Card> NuevasCartas = new ArrayList<>();
            for(int i = 1; i <= maxC; i++){
                NuevasCartas.add(Cartas.get(i));
            }
            return NuevasCartas;
        }
    }

}
