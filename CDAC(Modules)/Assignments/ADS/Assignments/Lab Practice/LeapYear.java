import java.util.*;
class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year: ");
		int num = sc.nextInt();
		
		if((num % 4 == 0 && num % 100 != 0)|| num % 400 == 0 ){
			System.out.println("Leap year");
		}else{
			System.out.println("Not a Leap year");
		}
		
	}
}