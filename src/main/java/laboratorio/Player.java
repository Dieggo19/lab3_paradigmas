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

}