package jan27.stat;

public class CountingStars {

     static int counter = 0;

    public void incrementCounter(){
        counter ++;
        System.out.println(counter);
    }

    public static void main(String[] args) {

        CountingStars countingStars1 = new CountingStars();
        CountingStars countingStars2 = new CountingStars();
        CountingStars countingStars3 = new CountingStars();
        countingStars1.incrementCounter();
        countingStars2.incrementCounter();
        countingStars3.incrementCounter();

    }
}

// use constructor to create objects not the method
