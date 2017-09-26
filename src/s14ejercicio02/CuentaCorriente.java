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
public class CuentaCorriente 
                    extends Cuenta {
    
    private double limiteSobregiro;

    public CuentaCorriente() {
        super();
        limiteSobregiro = -20;            
    }

    public CuentaCorriente(int id, double saldo, double limiteCredito) {
        super(id, saldo);
        this.limiteSobregiro = limiteCredito;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto > limiteSobregiro) {
            setSaldo(getSaldo() - monto);            
        }
        else {
            System.out.println("Error! Monto sobregiro excedido!!! :(");            
        }
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nLimite Sobregiro: $" + String.format("%.2f", limiteSobregiro);
    }
    
    
    
    
    
    

    
        
    
    
}
