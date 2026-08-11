/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author slate
 */
public class Forward extends Player 
{
    private int oneVsOneCompleted, oneVsOneAttempted;
    
    public Forward()
    {
        super(); // calls PLayer default constructor
        
        oneVsOneCompleted = 0;
        oneVsOneAttempted = 0;
    }
    
    public Forward(String name, int age, int goals, int assists,
                   int minutesPlayed, int gamesPlayed, int oneVsOneCompleted,
                   int oneVsOneAttempted)
    {
        super(name, age, goals, assists, minutesPlayed, gamesPlayed);

        setOneVsOneAttempted(oneVsOneAttempted);
        setOneVsOneCompleted(oneVsOneCompleted);
        
    }

    public void setOneVsOneAttempted(int oneVsOneAttempted)
        {
            if(oneVsOneAttempted >= 0)
                this.oneVsOneAttempted = oneVsOneAttempted;
            else
                throw new IllegalArgumentException("1v1 attempted cannot be negative.");
        }

    public void setOneVsOneCompleted(int oneVsOneCompleted)
    {
        if(oneVsOneCompleted >= 0 && oneVsOneCompleted <= oneVsOneAttempted)
            this.oneVsOneCompleted = oneVsOneCompleted;
        else
            throw new IllegalArgumentException("1v1 completed must be between 0 and 1v1 attempted.");
    }

    public int getOneVsOneAttempted()
    {
        return oneVsOneAttempted;
    }
        

    public int getOneVsOneCompleted()
    {
        return oneVsOneCompleted;
    }


    public double getOneVsOneSuccessRate()
    {
        
        if(oneVsOneAttempted == 0)
            return 0;

        return ((double) oneVsOneCompleted / oneVsOneAttempted) * 100;
        //AI helped with getting the success rate to be evaluated through decimal
        //division
    }
}
