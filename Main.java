
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Parking parking = new Parking();

        start(parking);

        
        
    }

    public static void start(Parking parking){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        String nrInmatriculare;

        printMenu();

        while(!quit){

            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("program terminat");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Nr de inmatriculare al masinii care intra in parcare: ");
                    nrInmatriculare = scanner.nextLine();
                    parking.ocupySpot(nrInmatriculare);
                    System.out.println("press 4 to print meniu");
                    break;
                case 2:
                    System.out.println("NR de inamtriculare al masinii care paraseste parcarea: ");
                    nrInmatriculare = scanner.nextLine();
                    parking.freeSpot(nrInmatriculare);
                    System.out.println("press 4 to print meniu");
                    break;
                case 3:
                    parking.listOfSpots();
                    System.out.println("press 4 to print meniu");
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }

        scanner.close();
    }


    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to ocupy a spot\n" +
                "2 - to free a spot\n" +
                "3 - to see the list of spots\n" +
                "4 - to see the current available actions");
    }
}