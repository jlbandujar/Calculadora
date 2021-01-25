/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author DAW2-PROFESOR
 */
public class Calcula {
    private double op1,op2;
    String operacion;

    public Calcula(double op1, double op2, String operacion) {
        this.op1 = op1;
        this.op2 = op2;
        this.operacion = operacion;
    }

    public double getOp1() {
        return op1;
    }

    public double getOp2() {
        return op2;
    }

    public String getOperacion() {
        return operacion;
    }
    
    public double getResultado(){
    double resultado=0;
    switch ( this.operacion) {
        case "+": {
            resultado=this.op1+this.op2;
            break;     
        }
        case "-": {
            resultado=this.op1-this.op2;
            break;     
        }
        case "*": {
            resultado=this.op1*this.op2;
            break;     
        }
        case "/": {
            resultado=this.op1/this.op2;
            break;     
        }     
    } //fin de switch
    return resultado;
    }
    
}
