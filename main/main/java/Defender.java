/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author slate
 */
public class Defender extends Player 
{
    private int tacklesCompleted;
    private int tacklesAttempted;

    /**
     * 
     */
    public Defender()
    {
        super();
        tacklesCompleted = 0;
        tacklesAttempted = 0;
    }

    /**
     * 
     */
    public Defender(String name, int age, int goals,int assists, 
                    int minutesPlayed,int gamesPlayed,int tacklesCompleted,
                    int tacklesAttempted)
    {
        super(name, age, goals, assists,
              minutesPlayed, gamesPlayed);

        setTacklesAttempted(tacklesAttempted);
        setTacklesCompleted(tacklesCompleted);
    }

    /**
     * 
     */
    public void setTacklesCompleted(int tacklesCompleted)
    {
        if(tacklesCompleted >= 0 &&
           tacklesCompleted <= tacklesAttempted)
        {
            this.tacklesCompleted = tacklesCompleted;
        }
        else
        {
            throw new IllegalArgumentException
            ("Completed tackles must be greater than 0 and less than or equal to"
                    + " tackles attempted.");
        }
    }

    /**
     * 
     */
    public void setTacklesAttempted(int tacklesAttempted)
    {
        if(tacklesAttempted >= 0)
        {
            this.tacklesAttempted = tacklesAttempted;
        }
        else
        {
            throw new IllegalArgumentException
            ("Tackles attempted cannot be negative.");
        }
    }

    /**
     * 
     */
    public int getTacklesCompleted()
    {
        return tacklesCompleted;
    }

    /**
     * 
     */
    public int getTacklesAttempted()
    {
        return tacklesAttempted;
    }
    
    public double getTackleSuccessRate()
    {
        if(tacklesAttempted == 0)
            return 0;

        return ((double) tacklesCompleted / tacklesAttempted) * 100;
        //AI helped with getting the success rate to be evaluated through decimal
        //division
    }
}
