/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
class Cuenta {

    private int id;
    private double saldo; 
    private static double tasaInteresAnual;
    private Date fechaCreacion;

    Cuenta() {
        this(0, 0);
    }        
    
    Cuenta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
        tasaInteresAnual = 0;
        fechaCreacion = new Date();                
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;        
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public String getFechaCreacion() {
        return fechaCreacion.toString();
    }
    
    public double getTasaInteresMensual() {
        return tasaInteresAnual / 12;
    }
    
    // Metodos
    public double getInteresesMensuales() {
        return saldo * (getTasaInteresMensual() / 100 );
    }
    
    public void retirar(double monto) {
        saldo -= monto;
    }
    
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public String toString() {
        
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTime(fechaCreacion);
                
        return "\nId Cuenta: " + id + 
               "\nFecha Creacion: " +  calendario.get(GregorianCalendar.DAY_OF_MONTH) +
                "/" + (calendario.get(GregorianCalendar.MONTH) < 10 ? 
                        "0" + calendario.get(GregorianCalendar.MONTH) :
                        calendario.get(GregorianCalendar.MONTH)) +
                "/" + calendario.get(GregorianCalendar.YEAR) +
               "\nSaldo: " + String.format("%.2f", saldo) + 
               "\nIntereses Mensuales: " + String.format("%.2f", getInteresesMensuales());
               
    }
    
    
    
    
}
