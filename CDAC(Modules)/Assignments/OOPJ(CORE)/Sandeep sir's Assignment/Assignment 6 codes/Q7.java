import java.util.Scanner;

class Test{
    int arr[];
    Test(int size){
        arr = new int[size];
    }

    void acceptRecord(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" Element:");
            arr[i] = sc.nextInt();
        }
    }
    void printRecord(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


public class Q7 {
    public static void main(String[] args) {
        Test t1 = new Test(5);
        t1.acceptRecord();
        t1.printRecord();
    }
}
