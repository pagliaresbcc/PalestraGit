/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devcast.palestra.git;

/**
 *
 * @author pagliares
 */
public class Fibonacci {
    public int calcularFibonacci(int numero){
        if (numero == 0) return 0;
        if (numero <= 2) return 1;
        return calcularFibonacci(numero-1) + calcularFibonacci(numero-2);
    }
    
}
