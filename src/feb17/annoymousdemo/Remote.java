package feb17.annoymousdemo;

public interface Remote {

    void click11();

}

class Main{
    public static void main(String[] args) {

        // Annoymous Inner class
      Remote remote = new Remote() {
          @Override
          public void click11() {

          }
      };
      remote.click11();

     // Lambdas - Java 8

    }
}
