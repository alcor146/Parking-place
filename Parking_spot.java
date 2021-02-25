public class Parking_spot {
    private long startparkingTime;
    private boolean status;
    private String nrInmatriculare;


    public Parking_spot(){ 
        startparkingTime = 0;
        status = false;
        nrInmatriculare = "";
    }


    public void exitSpot(){
        long endParkingTime = System.currentTimeMillis() - this.startparkingTime;
        System.out.println("The fee for the parking spot is $" + feeToPay(endParkingTime));
        status = false;
    }

    public int feeToPay(long time){
        int fee = 10;
        int hours = (int)time/3600; //scalam milisecunde la secunde
        int minutes = (int)(time % 3600) / 60;
        int seconds = (int)(time % 3600) % 60;
        
        for(int i=1; i<hours; i++)
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

 