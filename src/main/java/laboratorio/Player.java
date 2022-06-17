package laboratorio;
import java.util.ArrayList;

public class Player {
    //Atributos del player
    private String nombre;
    private String apellido;
    public int puntuacion;

    public Player() {
    }

    public Player(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //implementacion de comparadores de nombres, deberia ser un metodo el cual retorne booleanos para
    //verificar el ingreso de usuarios.

    @Override
    public boolean equals(Object O){
        //se crean los comparadores y sus respectivos returns
        if(this == O){
            return (true);
        }
        else if(O == null){
            return (false);
        }
        else if(O.getClass() != Player.class){
            return (false);
        }
        Player player = (Player) O;
        return player.getNombre().equals(this.nombre);
    }
}