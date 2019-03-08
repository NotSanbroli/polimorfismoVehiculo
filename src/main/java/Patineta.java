/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Patineta extends Vehiculo {
    private int longitud;

    public Patineta(String marca, String modelo, int longitud) {
        super(marca, modelo);
        this.longitud=longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void longitudPatineta(){
    System.out.println("mi longitud es: "+longitud+"cm");
    }
    @Override
    public void soy(){
    System.out.println("Soy vehiculo patineta");
    }
}
