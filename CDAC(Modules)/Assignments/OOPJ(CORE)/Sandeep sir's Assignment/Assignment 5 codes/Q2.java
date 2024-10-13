class Logger{
    private String log;
    private static  Logger logRef;
    private Logger(String log){
        this.log = log;
    }
     static Logger getInstance(String log){
        if (logRef == null){
            logRef = new Logger(log);
        }else{
            System.out.println("Already Exists");
        }
        return Logger.logRef;
    }

    String getLog(){
       return this.log;
    }
    void clearLog(){
        this.log = "";
    }
}

public class Q2 {
    public static void main(String[] args) {

        Logger l = Logger.getInstance("Hello");
        System.out.println(l.getLog());

        l.clearLog();
        Logger l2 = Logger.getInstance("Hello world");
        System.out.println(l2.getLog());

    }
}
