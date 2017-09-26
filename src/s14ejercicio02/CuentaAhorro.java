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
public class CuentaAhorro 
                extends Cuenta {

    public CuentaAhorro() {
        super();
    }    

    public CuentaAhorro(int id, double saldo) {
        super(id, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto < getSaldo()) {
            setSaldo(getSaldo() - monto);
            
        }
        else
        {
            System.out.println("Error: Saldo insuficiente... Transaccion rechazada... :(");
        }
    }
    
    
}
