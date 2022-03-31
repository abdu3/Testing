/**
 * Created by Abdurzaq on 31/03/2022.
 */
public class Train {

    public String TrainTicketFare(float time){
        String ticketPrice="null";
        if(time<=0 || time>24.99)
            throw  new IllegalArgumentException("invalid");
        if ((time>=1 && time<=9.50) || (time>=16 && time<=19.50) )
            ticketPrice="Full";
        if ((time>9.50 && time<16) || (time>19.50 && time<=24.99) )
            ticketPrice="Saver";

        return ticketPrice;

    }
}
