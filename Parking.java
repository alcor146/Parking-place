import java.util.ArrayList;

public class Parking extends Parking_spot {
    private ArrayList <Parking_spot> spots;
    private int capacitate = 10;

    public Parking(){
        this.spots = new ArrayList<Parking_spot>();
        for(int i = 0; i < this.capacitate; i++)
            this.spots.add(new Parking_spot());
    }


    public void ocupySpot(String nrInmatriculare){
        
        Parking_spot spot = findSpotAvailable();

        if(spot == null){
            System.out.println("No spots available");
            return;
        }
        
        long timeOfArrival = System.currentTimeMillis();

        spot.setNrInmatriculare(nrInmatriculare);
        spot.setStartparkingTime(timeOfArrival);
        spot.setStatus(true);
        
    }

    public void freeSpot(String nrInmatriculare){
        for(int i=0; i<this.capacitate; i++){
            if(this.spots.get(i).getNrInmatriculare().equals(nrInmatriculare) && this.spots.get(i).getStatus() == true ){
                System.out.println("1 car left the parking spot");
                this.spots.get(i).exitSpot();
                
            }
        }
        System.out.println("This specific car was not found");
    }
    


    public Parking_spot findSpotAvailable(){
        for(int i=0; i<this.spots.size(); i++)
            if(this.spots.get(i).getStatus() == false)
                return this.spots.get(i);
        return null;
    }

    public void listOfSpots(){

        System.out.println("List of spots:");

        for(int i=0; i<this.capacitate; i++)
            this.spots.get(i).showSpot();
            
        System.out.println("\n");
    }

    public ArrayList<Parking_spot> getSpots() {
        return spots;
    }

    public void setSpots(ArrayList<Parking_spot> spots) {
        this.spots = spots;
    }



}