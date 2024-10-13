class Q7{
	public static void main(String[] args){
		int num = 1234;
		int ans = 0;
		
		while(num != 0){
			int ld = num % 10;
			ans=(ans*10)+ld;
			num= (num/10);
		}
		System.out.println(ans);
	}
}