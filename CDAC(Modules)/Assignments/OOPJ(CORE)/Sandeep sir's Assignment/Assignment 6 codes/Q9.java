import java.util.Arrays;
import java.util.Scanner;

class seat{

    public static void availability(int seatno,String seats[][] ){
        int c = 1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (c == seatno){

                    if (seats[i][j].equals( "S:"+c +" NA")){
                        System.out.println("Seat not Available");
                    }else{
                        System.out.println("Seat Available");
                    }
                }
                c++;
            }
        }
    }

    public static void cancelBooking(int seatno,String seats[][] ){
        int c = 1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (c == seatno){

                    if (seats[i][j].equals( "S:"+c +" NA")){
                        seats[i][j] = "S:"+c +" A";
                        System.out.println("Booking cancled");
                        System.out.println();
                    }else{
                        System.out.println("Not a booked seat");
                        System.out.println();
                    }
                }
                c++;
            }
        }
    }


    public static String[][] bookSeat(int seatNo,String seats[][]){
        int c = 1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (c == seatNo){

                    if (seats[i][j].equals( "S:"+c +" NA")){
                        System.out.println("Seat not Available");
                        System.out.println();
                    }else{
                        System.out.println("Seat Booked");
                        System.out.println();
                    }
                    seats[i][j] = "S:"+c +" NA";
                }
                c++;
            }
        }

        return seats;
    }



}


public class Q9 {
    public static void print(String seats[][]){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                System.out.print(seats[i][j]+"   ");
            }
            System.out.println();
        }
    }
    public  static  void initialize(String seatchart[][]){
        int seatno = 1;
        for (int i = 0; i < seatchart.length; i++) {
            for (int j = 0; j < seatchart[0].length; j++) {
                if (seatno < 10){
                    seatchart[i][j] = " S:"+seatno++ +" A";
                }else{
                    seatchart[i][j] = "S:"+seatno++ +" A";
                }

            }
        }

    }

    public static void main(String[] args) {

        int row = 10;
        int col = 3;
        String seatchart[][] = new String[row][col];
        initialize(seatchart);

        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("0.Exit");
            System.out.println("1.Book seat");
            System.out.println("2.Cancel booking");
            System.out.println("3.Seat Availability");
            System.out.println("4.Show chart");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            System.out.println();
            if (choice == 0) break;

            switch (choice) {
                case 1:
                    System.out.println("Enter Seat No:");
                    int seatNo = sc.nextInt();
                    seat.bookSeat(seatNo, seatchart);
                    break;
                case 2:
                    System.out.println("Enter Seat No:");
                    int cancelseatNo = sc.nextInt();
                    seat.cancelBooking(cancelseatNo, seatchart);

                    break;
                case 3:
                    System.out.println("Enter Seat No:");
                    int AvailableseatNo = sc.nextInt();
                    seat.availability(AvailableseatNo, seatchart);
                    break;

                case 4:
                    print(seatchart);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
