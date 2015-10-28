//lab 5, High Random Number Parameter

public class RandomOne{
    
    
    High myRandomNumberHigh = new High();
    int compNum;
    
    public int GetANumberHigh(int high)
    
    {
        compNum = myRandomNumberHigh.GetAHighNumber();
        System.out.print("The high number you enter is: "+high+" and the number the high computer number is: "+compNum+" !");
        return high;
        
    }
}
