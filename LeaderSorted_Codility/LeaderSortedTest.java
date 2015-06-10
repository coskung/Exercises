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
public class LeaderSortedTest {
    
    public LeaderSortedTest() {
    }
    
    /**
     * Test of solution method, of class LeaderSorted.
     */
    @Test
    public void testSolution() {
        System.out.println("solution");
        int[] A = {2,2,2,2,2,3,4,4,4,6};
        LeaderSorted instance = new LeaderSorted();
        int expResult = -1;
        int result = instance.solution(A);
        assertEquals(expResult, result);
        
        A=new int[]{1,1,1,1,50};
        result = instance.solution(A);
        expResult=1;
        assertEquals(expResult, result);
        
        A=new int[]{0,1};
        result = instance.solution(A);
        expResult=-1;
        assertEquals(expResult, result);
        
        A=new int[]{2};
        result = instance.solution(A);
        expResult=2;
        assertEquals(expResult, result);
        
        A=new int[]{2,5};
        result = instance.solution(A);
        expResult=-1;
        assertEquals(expResult, result);
    }
    
}
