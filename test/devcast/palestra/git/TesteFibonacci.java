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
        
        int [][] casosTeste = {{0,0}, {1,1}, {2,1}};
        for (int i = 0; i < casosTeste.length; i++)
          assertEquals(casosTeste[i][1], fibonacci.calcularFibonacci(casosTeste[i][0]));
    }
    
     
}
