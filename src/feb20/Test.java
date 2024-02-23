package feb20;

import java.io.File;

public class Test {
    public static void main(String[] args) {

        try {
            sleepForWhile();
        }
        catch(Exception e ){

        }
    }

    public static void sleepForWhile() throws InterruptedException {
        System.out.println("Hello");
        Thread.sleep(5000);
        int x = 20;
        /*if(x > 10){
            throw new RuntimeException("some exception");
        }*/

        System.out.println("Hello after sleep 5 sec ");
    }
}

// throw vs throws
