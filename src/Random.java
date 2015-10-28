//lab 5, Low Random Number Class
public class Random
{

    public int GetANumber_Between_1_and_10()
    {
        int gameNum = 0 + (int)(Math.random()*5);
        return gameNum;
    }
}