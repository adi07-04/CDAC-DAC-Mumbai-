import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");

		int num = sc.nextInt();
		int temp = num;
		int arm = 0;
		int ld = 0;
		int len = String.valueOf(num).length();
		
		while(temp > 0){
			ld = temp % 10;
			arm+=Math.pow(ld,len);
			temp = temp/10;
		}
		if(arm == num){
		    System.out.println("Number is ArmStrong");
		}else{
			 System.out.println("Number is Not ArmStrong");
		}
	}
}