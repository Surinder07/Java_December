package feb13.multiple;

public class Iphone implements Calculator, Camera, Computer, MusicPlayer, Telephone{
    @Override
    public void calculate() {
        System.out.println("Calculate in iphone ");
    }

    @Override
    public void clickPictures() {
        System.out.println("click pictures in iphone ");

    }

    @Override
    public void surfInternet() {
        System.out.println("surf internet in iphone ");

    }

    @Override
    public void playMusic() {
        System.out.println("play music in iphone ");

    }

    @Override
    public void makeCalls() {
        System.out.println("make calls  in iphone ");

    }
}
