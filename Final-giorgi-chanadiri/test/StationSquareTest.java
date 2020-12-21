import ge.edu.ug.Passenger;
import ge.edu.ug.Train;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StationSquareTest {
    @Test
    public void StationSquareTest{

        Train havenotticket=new Train("1","havenotticket");
        Train haveticket=new Train("2","haveticket");


        Passenger gio= new Passenger("gio",true);
        Passenger nika= new Passenger("Nika",false);
        Passenger ana= new Passenger("ana",false);

        assertEquals(true,haveticket.addPassenger(gio));
        assertEquals(false,havenotticket.addPassenger(ana));
        assertEquals(true,haveticket.addPassenger(nika));

    }



}
