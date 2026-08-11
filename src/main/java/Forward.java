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

        setOneVsOneCompleted(oneVsOneCompleted);
        setOneVsOneAttempted(oneVsOneAttempted);
    }



    public void setOneVsOneCompleted(int oneVsOneCompleted)
    {
        if(oneVsOneCompleted >= 0)
            this.oneVsOneCompleted = oneVsOneCompleted;
        else
            throw new IllegalArgumentException("1v1 completed cannot be negative.");
    }

    public void setOneVsOneAttempted(int oneVsOneAttempted)
    {
        if(oneVsOneAttempted >= 0)
            this.oneVsOneAttempted = oneVsOneAttempted;
        else
            throw new IllegalArgumentException("1v1 attempted cannot be negative.");
    }

    public int getHattricks()
    {
        return getGoals() / 3;
    }

    public int getOneVsOneCompleted()
    {
        return oneVsOneCompleted;
    }

    public int getOneVsOneAttempted()
    {
        return oneVsOneAttempted;
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
