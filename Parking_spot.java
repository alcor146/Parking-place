public class Parking_spot {
    private long startparkingTime;
    private boolean status;
    private String nrInmatriculare;


    public void resetSpot(){
        startparkingTime = 0;
        status = false;
        nrInmatriculare = null;
    }


    public void exitSpot(){
        long endParkingTime = System.currentTimeMillis() - this.startparkingTime;
        System.out.println("The fee for the parking spot is $" + feeToPay(endParkingTime));
        this.resetSpot();
    }

    public int feeToPay(long time){
        int fee = 10;
        int hours = (int)time/3600; //scaling milisec to seconds bcs i m not gonna wait 1 h for it to run
        int minutes = (int)(time % 3600) / 60;
        int seconds = (int)(time % 3600) % 60;
        
        for(int i=0; i<hours; i++)
            fee += 5;

        System.out.println("Timpul stationat: " + hours + ":" + minutes + ":" + seconds);

        return fee;
    }

    public void showSpot(){
        
        if(this.status == true)
            System.out.println("Spot ocupied by " + nrInmatriculare);
        else
            System.out.println("Empty spot");
    }

    public float getStartparkingTime() {
        return startparkingTime;
    }

    public void setStartparkingTime(long startparkingTime) {
        this.startparkingTime = startparkingTime;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
}

 
 
