package feb10.encap;

public class MainLogin {
    public static void main(String[] args) {
        LoginUser loginUser = new LoginUser("Pragra", "pragra123");

        loginUser.loginUser("Pragra","pragra123");

      /*  //hacker
        loginUser.userName = "hacker";
        loginUser.password = "hacker";
*/


        String userName = loginUser.getUserName();
        System.out.println("This is your username : " + userName);

        loginUser.setPassword("MyPassword");

        loginUser.loginUser("Pragra", "MyPassword");




    }
}
