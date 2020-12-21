package ge.edu.ug;
import java.util.ArrayList;
import java.util.List;

public class Train {

        private String id;
        private List <Passenger> passengerList = new ArrayList<>();
        private String trainType;

    public Train(String id, List<Passenger> passengerList, String trainType) {
        this.id = id;
        this.passengerList = passengerList;
        this.trainType = trainType;
    }

    public Train(String id, String trainType) {
            this.id = id;
            this.trainType = trainType;

        }
    public List<Passenger> getPassengerList() {
        return passengerList;
    }
    public boolean addPassenger(Passenger passenger) {
        boolean result = true;
        switch (trainType) {
            case "haveTicket":
                result = passengerList.add(passenger);
                break;
            case "haveTicket":
                if (passenger.haveticket()) {
                    result = passengerList.add(passenger);
                }
                break;
            default:
                System.out.println("Unknown type");
        }
        return result;
    }






}
