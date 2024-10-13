import java.util.Scanner;

class Test2{
    int arr[];
    Test2(int size){
        arr = new int[size];
    }

    void setArr(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter "+i+" Element:");
            arr[i] = sc.nextInt();
        }
    }
    void getArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Test2 t2 = new Test2(6);
        t2.setArr();
        t2.getArr();
    }
}
