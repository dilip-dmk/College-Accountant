package resources.captcha;

import java.util.Random;

/**
@author Dilip Pc
 */

public class CaptchaEngine {
    public static int randIntOne(int min, int max) 
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public static int randIntTwo(int min, int max) 
    {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
