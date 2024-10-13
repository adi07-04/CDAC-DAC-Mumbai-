class InstanceCounter{
     static int count;

     void increment_counter(){
         InstanceCounter.count++;
     }
    InstanceCounter(){
        this.increment_counter();
    }
}

public class Q1 {
    public static void main(String[] args) {
        InstanceCounter c = new InstanceCounter();
        InstanceCounter c2 = new InstanceCounter();
        InstanceCounter c3= new InstanceCounter();
        InstanceCounter c4 = new InstanceCounter();

        int instanceCreated = InstanceCounter.count;
        System.out.println(instanceCreated + " instances created.");

    }
}
