/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devcast.palestra.git;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author pagliares
 */
public class TesteFibonacci {
    
    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.calcularFibonacci(0));
        assertEquals(1, fibonacci.calcularFibonacci(1));
    }
    
     
}
