import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Abdurzaq on 31/03/2022.
 */

public class TrainTest {


    Train t= new Train();


    /// boundary test
    /// I use 24 system for horses and float to represent them
    // 1.50 equal to 1:30

    // the boundary values are:
    // 24.99,1.00,1.01
    // 3.99,4.00, 4.01
    // 7.49,7.50,7.51

    // because the requirements ambiguous I choose to the time
    // before 9:30  from 1 am to 9:29 am
    // and time after 7:30 pm from 7:31 pm to 12:00 am

    @Test
    public void ticktPricebefor1amIsSaver(){
        String result =t.TrainTicketFare((float) 24.99);
        assertEquals("Saver",result);
    }
    @Test
    public void ticktPricein1amIsFull(){
        String result =t.TrainTicketFare((float) 1.00);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPriceafter1amIsFull(){
        String result =t.TrainTicketFare((float) 1.01);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPricebefor9and30amIsFull(){
        String result =t.TrainTicketFare((float) 9.49);
        assertEquals("Full",result);
    }
    @Test
    public void ticktPriceIn9and30AmIsSaver(){
        String result =t.TrainTicketFare((float) 9.50);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPriceafter9and30AmIsSaver(){
        String result =t.TrainTicketFare((float) 9.51);
        assertEquals("Saver",result);
    }


    @Test
    public void ticktPricebefor4PmIsSaver(){
        String result =t.TrainTicketFare((float) 15.99);
        assertEquals("Saver",result);
    }
    @Test
    public void ticktPriceIn4PmIsFull(){
        String result =t.TrainTicketFare((float) 16.00);
        assertEquals("Full",result);
    }
    @Test
    public void ticktPriceAfter4PmIsFull(){
        String result =t.TrainTicketFare((float) 16.01);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPriceBefor7And30PmIsFull(){
        // 7 pm equal 19 in 24 system
        String result =t.TrainTicketFare((float) 19.49);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPricein7And30PmIsFull(){
        String result =t.TrainTicketFare((float) 19.50);
        assertEquals("Full",result);
    }
    @Test
    public void ticktPriceAfter7And30PmIsSaver(){
        String result =t.TrainTicketFare((float) 19.51);
        assertEquals("Saver",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidtimePosative(){
        String result =t.TrainTicketFare((float) 25.00);
        assertEquals("invalid",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidtimenegative(){
        String result =t.TrainTicketFare((float) -1.00);
        assertEquals("invalid",result);
    }


@Test
    public void ticktPriceAt5pmIsFull(){
        String result =t.TrainTicketFare((float) 17.00);
        assertEquals("Full",result);
    }

    @Test
    public void ticktPriceAt10AmIsSaver(){
        String result =t.TrainTicketFare((float) 10.00);
        assertEquals("Saver",result);
    }



}