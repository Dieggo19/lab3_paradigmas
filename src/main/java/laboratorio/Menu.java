package laboratorio;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        //agrego elementos al ejemplo de la lista
        ArrayList ejemploLista = new ArrayList<>();
        ejemploLista.add("1");
        ejemploLista.add("2");
        ejemploLista.add("3");
        ejemploLista.add("4");
        ejemploLista.add("5");
        ejemploLista.add("6");
        ejemploLista.add("7");

        Dobble constructor = new Dobble(ejemploLista, 3,3);
        System.out.println("el constructor y las cartas son:");
        System.out.println(constructor);
    }
}