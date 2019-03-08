
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class Codigo {
    List<Vehiculo> vehiculos; 
    public Codigo(){
    Vehiculo vehiculo1 = new Vehiculo("BMW","2015") {};
    Vehiculo tipo1 = new TipoDeCombustible("Suzuki","1998","Gasolina") {};
    Vehiculo bicicleta1 = new Bicicleta("Gw","2011",3);
    Vehiculo patineta1 = new Patineta("BirdHouse","2008",1003);
    Vehiculo carro1 = new Carro("Jaguar","2019","Gasolina",50);
    Vehiculo jet1 = new Jet("Avianca","Boing 737","Gasolina",7);
    vehiculos = new ArrayList();
    vehiculos.add(vehiculo1);
    vehiculos.add(jet1);
    vehiculos.add(patineta1);
    vehiculos.add(tipo1);
    vehiculos.add(carro1);
    vehiculos.add(bicicleta1);
    for(int i=0;i<vehiculos.size();i++){
        if(vehiculos.get(i) instanceof Vehiculo){
            vehiculos.get(i).soy();
            vehiculos.get(i).soyVehiculo();
            }
        if(vehiculos.get(i)instanceof TipoDeCombustible){
            TipoDeCombustible tipo=(TipoDeCombustible) vehiculos.get(i);
            tipo.tipoCombus();
            }
        if(vehiculos.get(i)instanceof Bicicleta){
            Bicicleta bici=(Bicicleta) vehiculos.get(i);
            bici.numeroDisk();
            }
        if(vehiculos.get(i)instanceof Patineta){
            Patineta pat=(Patineta) vehiculos.get(i);
            pat.longitudPatineta();
            }
        if(vehiculos.get(i)instanceof Carro){
            Carro car=(Carro) vehiculos.get(i);
            car.tamanoDeMotor();
            }
        if(vehiculos.get(i)instanceof Jet){
            Jet jet=(Jet) vehiculos.get(i);
            jet.cantidadDeMotores();
            }
        }
    }
}
