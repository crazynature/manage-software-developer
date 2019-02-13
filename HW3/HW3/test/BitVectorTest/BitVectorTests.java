/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitVectorTest;

import hw3q1.Iterator;
import hw3q1.BitVector;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cjrjh
 */
public class BitVectorTests {

    public BitVectorTests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
        BitVector x = new BitVector();
        BitVector y = new BitVector();
    @Test
    public void test1() {
        // TODO code application logic here

        x.set(0);
        assertEquals(x.get(0), true);
        y.copy(x);


        //     System.out.println(x.size()); 
        x.set(31);
        x.set(43);
        assertEquals(x.get(31), true);
        assertEquals(x.get(0), true);
        //      System.out.println(x.size()); 
        x.clear(43);
        //   System.out.println(x.size()); 
        assertEquals(x.get(43), false);
        x.set(320000);
        assertEquals(x.size(), 3);
        assertEquals(x.get(320000), true);
        assertEquals(x.get(31), true);
        assertEquals(x.get(0), true);

//     while(temp.hasAnotherElement()){
//         System.out.println(temp.nextElement()+" ");
//          assertEquals((int)temp.nextElement(),0);
//       }
test3();
    }

    public void test3() {
                Iterator<Integer> temp = x.iterator();
          System.out.println("sda");
          assertEquals(y.get(0), true);
        assertEquals(temp.hasAnotherElement(), true);
        assertEquals((int) temp.nextElement(), 0);
        assertEquals((int) temp.nextElement(), 31);
        assertEquals((int) temp.nextElement(), 320000);
    }
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
