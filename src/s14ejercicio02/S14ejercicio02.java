/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio02;

/**
 *
 * @author alumno
 */
public class S14ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta(1122, 20000);
        CuentaAhorro ahorro = new CuentaAhorro(1001, 20000);
        CuentaCorriente corriente = new CuentaCorriente(1004, 20000, -20);
        
        cuenta.setTasaInteresAnual(4.5);
        ahorro.setTasaInteresAnual(4.5);
        corriente.setTasaInteresAnual(4.5);
        
        // Retirar $2,500
        cuenta.retirar(2500);
        ahorro.retirar(2500);
        corriente.retirar(2500);
        
        // Depositar $3,000 
        cuenta.depositar(3000);
        ahorro.depositar(3000);
        corriente.depositar(3000);
        
        // Llamar al metodo toString()
        System.out.println(cuenta.toString());
        System.out.println(ahorro.toString());
        System.out.println(corriente.toString());
    }
    
}
