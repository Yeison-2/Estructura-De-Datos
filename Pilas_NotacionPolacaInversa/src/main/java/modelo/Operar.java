/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Yeison Romero
 */
public class Operar {
    
    private Pila pila;

    public Operar() {
        pila = new Pila();
    }
    
    public int evaluarExpresion(String esprecion) {
        String[] elementosExpresion = esprecion.split(" ");

        for (String elemento : elementosExpresion) {
            if (esOperador(elemento)) {
                int operando2 = pila.desapilar();
                int operando1 = pila.desapilar();
                int resultado = operar(operando1, operando2, elemento);
                pila.apilar(resultado);

            } else {
                pila.apilar((Integer.parseInt(elemento)));
            }
        }
        return pila.desapilar();
    }
    
    
    
    

    private boolean esOperador(String elemento){
        return elemento.equals("+") || elemento.equals("-") || elemento.equals("*") || elemento.equals("/");
    }

    private int operar(int a, int b, String operador){
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no soportado: " + operador);
        }
    }
}
