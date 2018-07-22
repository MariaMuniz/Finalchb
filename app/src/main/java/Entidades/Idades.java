package Entidades;

/**
 * Created by alexs on 10/01/2018.
 */

public class Idades implements EntidadePersistivel {
    private int idIdades;


    public Idades(int idIdades) {
        super();
        this.idIdades = idIdades;

    }
    public Idades() {
    }

    public int getIdIdades() {
        return idIdades;
    }

    public void setIdIdades(int idIdades) {
        this.idIdades = idIdades;
    }

    @Override
    public String toString() {
        return idIdades + " ";
    }

    @Override
    public int getId() {
        return idIdades;
    }

    @Override
    public void setId(int id) {

    }
}
