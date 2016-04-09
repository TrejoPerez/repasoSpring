/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yo;

/**
 *
 * @author T-101
 */
public class Operaciones {
    Float primero;
    Float segundo;

    public Operaciones(Float primero, Float segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    
    public String suma(){
        float valor=primero+segundo;
        return "La suma es: "+valor;
    }
    
    public String resta(){
        float valor=segundo-primero;
        return "La resta es: "+valor;
    }
    
        public String producto(){
        float valor=primero*segundo;
        return "El producto es: "+valor;
    }
    
        public String division(){
        float valor=primero/segundo;
        return "La division es: "+valor;
    }
}
