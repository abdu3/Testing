import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Created by Abdurzaq on 30/03/2022.
 */
public class AccountTest {


    Account account=new Account();

    /// boundry testing


    @Test(expected = IllegalArgumentException.class)
    public void TestBoundryLessThanZero(){
        double result =account.calcIntreset(-0.01);
        assertEquals(00,result,0.000000);
    }

    @Test
    public void TestBoundryWithZeroValue(){
        double result =account.calcIntreset(0.00);
        assertEquals(0,result,0.000000);
    }

    @Test
    public void TestBoundryWith100Value(){
        double result =account.calcIntreset(100.00);
        assertEquals(3,result,0.000000);
    }
    @Test
    public void TestBoundryGreaterThan100Value(){
        double result =account.calcIntreset(100.01);
        assertEquals(5.0005,result,0.000500000000000);
    }
    @Test
    public void TestBoundrylessThan1000Value(){
        double result =account.calcIntreset(999.99);
        assertEquals(49.9995,result,0.00000000000005);
    }
    @Test
    public void TestBoundrywith1000Value(){
        double result =account.calcIntreset(1000.00);
        assertEquals(70,result,0.0000);
    }



    //this is the equavelant e partition
    @Test(expected = IllegalArgumentException.class)
    public void balanceLessThanZeroInvalid(){
        double result =account.calcIntreset(-20);
        assertEquals(00,result,0.00000);
    }

    @Test
    public void balancebetweenZeroAnd100Increase3percent(){
        double result =account.calcIntreset(50);
        assertEquals(1.5,result,0.00000);
    }
    @Test
    public void balanceover$100andupto$1000Increase5percent(){
        double result =account.calcIntreset(300);
        assertEquals(15 ,result,0.00000);
    }


    @Test
    public void balance$1000andOverIncrease5percent(){
        double result =account.calcIntreset(1200);
        assertEquals(84,result,00000000000001);
    }

}