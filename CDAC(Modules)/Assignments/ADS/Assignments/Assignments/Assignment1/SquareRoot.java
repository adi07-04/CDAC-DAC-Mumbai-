import java.util.*;
class SquareRoot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<num; i++){
			if(i*i == num){
				System.out.println(i);
			}
		}
		
		System.out.println(Math.sqrt(num));
		
	}
}