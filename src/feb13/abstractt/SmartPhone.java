package feb13.abstractt;


public abstract class SmartPhone {

    public abstract void call();

    public void surfInternet(){
        System.out.println("Surf internet .. ");
    }
}

class Samsung extends SmartPhone{

    @Override
    public void call() {
        System.out.println("making call.");
    }
}

class Main{
    public static void main(String[] args) {
        Samsung samsung = new Samsung();
        samsung.call();
        samsung.surfInternet();
    }


}
/*


5 - 10


   abstract class Phone,               - call()
  abstract Mobile extend phone        - cordless feature
  abstract Smartphone extend Mobile,  - internet feature
  AIPhone extend smartphone           - generate images

 AIPhone - concrete class



 */