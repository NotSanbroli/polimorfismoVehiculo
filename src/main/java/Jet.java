/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Jet extends TipoDeCombustible {
    private int cantidadMotores;

    public Jet(String marca, String modelo, String tipoCombustible, int cantidadMotores) {
        super(marca, modelo, tipoCombustible);
        this.cantidadMotores=cantidadMotores;
    }

    public int getCantiadMotores() {
        return cantidadMotores;
    }

    public void setCantiadMotores(int cantiadMotores) {
        this.cantidadMotores = cantiadMotores;
    }
 
    public void cantidadDeMotores(){
    System.out.println("Cantidad de motores: "+cantidadMotores);
    }
    @Override
    public void soy(){
    System.out.println("Soy vehiculo avion");
    }
}
