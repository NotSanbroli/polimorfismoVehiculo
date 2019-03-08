/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Bicicleta extends Vehiculo {
    private int numeroDiscos;

    public Bicicleta(String marca, String modelo, int numeroDiscos) {
        super(marca, modelo);
        this.numeroDiscos=numeroDiscos;
    }

    public int getNumeroDiscos() {
        return numeroDiscos;
    }

    public void setNumeroDiscos(int numeroDiscos) {
        this.numeroDiscos = numeroDiscos;
    }
    
    public void numeroDisk(){
    System.out.println("nuero de discos: "+numeroDiscos);
    }
    @Override
    public void soy(){
    System.out.println("Soy vehiculo bicicleta");
    }
}
