/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Carro extends TipoDeCombustible {
    private int tamanoMotor;

    public Carro(String marca, String modelo, String tipoCombustible, int tamanoMotor) {
        super(marca, modelo, tipoCombustible);
        this.tamanoMotor=tamanoMotor;
    }

    public int getTamanoMotor() {
        return tamanoMotor;
    }

    public void setTamanoMotor(int tamanoMotor) {
        this.tamanoMotor = tamanoMotor;
    }
    
    public void tamanoDeMotor(){
    System.out.println("mi motor mide: "+tamanoMotor+"pulgadas");
    }
    @Override
    public void soy(){
    System.out.println("Soy vehiculo carro");
    }
}
