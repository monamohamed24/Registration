package Pages;

import java.util.Random;

public class Data {
    public static String FirstName = "mona";
    public static String SecondName = "mohamed";

    static Random random = new Random();
    static int randomInt  = random.nextInt(800)+100;
    public static String Email = "user"+randomInt +"@gmail.com";

    public static String Password = "12345678";


    static int answer = random.nextInt(9999) + 1000;
    public static String phoneNumber = "+966"+"54"+ answer + "758";


    static int idformat = random.nextInt(9999) + 1000;
    public static String nationalID = "103"+idformat+"562";


}
