package ge.edu.ug;

public class StationSquare {
    public StationSquare() {
    }

    public static void main(String[] args) {
        Train havenotticket=new Train("1","havenotticket");
        Train haveticket=new Train("2","haveticket");


        Passenger gio= new Passenger("gio",true);
        Passenger nika= new Passenger("Nika",false);
        Passenger ana= new Passenger("ana",false);

        Train train = new Train()

        Train.addPassenger(gio);
        Train.addPassenger(nika);
        Train.addPassenger(ana);


        for (passenger passenger:train.getPassengerList()){
            System.out.println(passenger.getName());
        }


    }
}
