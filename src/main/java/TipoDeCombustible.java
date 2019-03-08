/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public abstract class TipoDeCombustible extends Vehiculo {
    private String tipoCombustible;

    public TipoDeCombustible(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo);
        this.tipoCombustible=tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
    public void tipoCombus(){
    System.out.println("me impulso a: "+tipoCombustible);
    }
    @Override
    public void soy(){
    System.out.println("Soy vehiculo motorizado");
    }
}
