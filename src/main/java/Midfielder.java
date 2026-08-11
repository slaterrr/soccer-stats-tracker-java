/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author slate
 */
public class Midfielder extends Player 

{
    private int passCompleted;
    private int passAttempted;
    
    public Midfielder()
    {
        super();

        passCompleted = 0;
        passAttempted = 0;
    }

    public Midfielder(String name, int age, int goals,int assists, int minutesPlayed,
                      int gamesPlayed,int passCompleted,int passAttempted)
    {
        super(name, age, goals, assists,
              minutesPlayed, gamesPlayed);

        setPassAttempted(passAttempted);
        setPassCompleted(passCompleted);
    }

    public void setPassCompleted(int passCompleted)
    {
        if(passCompleted >= 0 &&
           passCompleted <= passAttempted)
        {
           this.passCompleted = passCompleted; 
        }
        else
        {
            throw new IllegalArgumentException
            ("Completed passes must be greater than 0 and less than or equal to"
                    + " passes attempted.");
        }
    }

    public void setPassAttempted(int passAttempted)
    {
        if(passAttempted >= 0)
        {
            this.passAttempted = passAttempted;
        }
        else
        {
            throw new IllegalArgumentException
            ("Passes attempted cannot be negative.");
        }
    }

    public int getPassCompleted()
    {
        return passCompleted;
    }

    public int getPassAttempted()
    {
        return passAttempted;
    }
    
    public double getPassAccuracy()
{
    if(passAttempted == 0)
        return 0;

    return ((double) passCompleted / passAttempted) * 100;
    //AI helped with getting the success rate to be evaluated through decimal
    //division
}
    
}
