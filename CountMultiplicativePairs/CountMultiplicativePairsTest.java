/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codility;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hcg
 */
public class CountMultiplicativePairsTest {
    
    public CountMultiplicativePairsTest() {
    }
    
    /**
     * Test of solution method, of class CountMultiplicativePairs.
     */
    @Test
    public void testSolution() {
        
        int[] A = {0,1,2,2,3,5};
        int[] B = {500000,500000,0,0,0,2000};
        CountMultiplicativePairs instance = new CountMultiplicativePairs();
        int expResult = 8;
        int result = instance.solution(A, B);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        A=new int[]{};
        result = instance.solution(A,B);
        expResult=0;
        assertEquals(expResult, result);
        
        B=new int[]{};
        result = instance.solution(A,B);
        expResult=0;
        assertEquals(expResult, result);
        
        A = new int[]{0,1,2,2,3,5};
        B=new int[]{};
        result = instance.solution(A,B);
        expResult=0;
        assertEquals(expResult, result);
        
        //System.out.println("test");
        A = new int[]{0,0,0,1,3};
        B = new int[]{0,0,0,500000,10000};
        result = instance.solution(A,B);
        expResult=4;
        assertEquals(expResult, result);
        
        
        System.out.println("test");
        A = new int[]{1,3};
        B = new int[]{400000,500000};
        result = instance.solution(A,B);
        expResult=1;
        assertEquals(expResult, result);
        //1.4, 3.5  testi
    }
    
}
