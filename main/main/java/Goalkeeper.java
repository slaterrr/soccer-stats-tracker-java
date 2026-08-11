/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author slate
 */
public class Goalkeeper extends Player 
{
    private int saves;
    private int cleanSheets;

    /**
     * Default constructor
     */
    public Goalkeeper()
    {
        super();

        saves = 0;
        cleanSheets = 0;
    }

    /**
     * Constructor with parameters
     */
    public Goalkeeper(String name, int age, int goals, int assists, int minutesPlayed,
                      int gamesPlayed, int saves,int cleanSheets)
    {
        super(name, age, goals, assists,minutesPlayed, gamesPlayed);

        setSaves(saves);
        setCleanSheets(cleanSheets);
    }

    /**
     * Sets saves
     */
    public void setSaves(int saves)
    {
        if(saves >= 0)
        {
            this.saves = saves;
        }
        else
        {
            throw new IllegalArgumentException
            ("Saves cannot be negative.");
        }
    }

    /**
     * Sets clean sheets
     */
    public void setCleanSheets(int cleanSheets)
    {
        if(cleanSheets >= 0 &&
           cleanSheets <= getGamesPlayed())
        {
            this.cleanSheets = cleanSheets;
        }
        else
        {
            throw new IllegalArgumentException
            ("Clean sheets must be between 0 and games played.");
        }
    }

    /**
     * Returns saves
     */
    public int getSaves()
    {
        return saves;
    }

    /**
     * Returns clean sheets
     */
    public int getCleanSheets()
    {
        return cleanSheets;
    }
    
    public double getCleanSheetPercentage()
{
    if(getGamesPlayed() == 0)
        return 0;

    return ((double) cleanSheets / getGamesPlayed()) * 100;
    //AI helped with getting the success rate to be evaluated through decimal
    //division
}
}
