/**
 *
 * @author slate
 */

public class Player 
{
    private String name;
    private int age, goals, assists, minutesPlayed, gamesPlayed; 
    
    /**
     * Default constructor
     */
    public Player()
    {
        name = "null";
        age = 18;
        goals = 0;
        assists = 0;
        minutesPlayed = 0;
        gamesPlayed = 0;
    }
    
    /**
     * 
     * @param name - name of player
     * @param age - age of player
     * @param goals - goals scored by player
     * @param assists - assists made by player
     * @param minutesPlayed - minutes played by player
     * @param gamesPlayed - games played by player
     */
    public Player(String name, int age, int goals, int assists,
                  int minutesPlayed, int gamesPlayed)
    {
      setName(name);
      setAge(age);
      setMinutesPlayed(minutesPlayed);
      setGoals(goals);
      setAssists(assists);
      
      setGamesPlayed(gamesPlayed);
    }
   
    /**
     * 
     * @param name - the name of the player 
     */
    public void setName(String name)
    {
        //Checks if name is not null and not blank. If true, assigns name to variable
        if(name != null && !name.isBlank() ) 
        {
            this.name = name;
        }
        //if true, throw a runtimeException to console
        else
            throw new IllegalArgumentException("Name cannot be blank or null");
    }
    
    /**
     * 
     * @param age - the age of the player
     */
    public void setAge(int age)
    {
        if(age > 17)
        {
         this.age = age;   
        }
        else
            throw new NumberFormatException("Must be 18 and older to"
                    + " participate!");
    }

    /**
     * 
     * @param goals - the goals scored by player
     */
    public void setGoals(int goals) 
    {
        if(goals >= 0)
        {
            this.goals = goals;
                
        }
        else
            throw new IllegalArgumentException("Goals must be equal to or greater"
                    + "than 0");
    }

    /**
     * 
     * @param assists - assists made by player 
     */
    public void setAssists(int assists)
    {
        if(assists >= 0)
        {
            this.assists = assists;
                
        }
        else
            throw new IllegalArgumentException("Assists must be equal to or greater"
                    + "than 0");
    }

    /**
     * 
     * @param minutesPlayed - minutes played by player
     */
    public void setMinutesPlayed(int minutesPlayed)
    {
        if(minutesPlayed >= 0)
        {
            this.minutesPlayed =  minutesPlayed;
        }
        else 
            throw new IllegalArgumentException("Minutes played cannot be"
                                                + " negative");
    }

    /**
     * 
     * @param gamesPlayed - games played by player
     */
    public void setGamesPlayed(int gamesPlayed)
    {
        if(gamesPlayed >= 0)
        {
            this.gamesPlayed = gamesPlayed;
        }
        else
            throw new IllegalArgumentException("Games played cannot be"
                                                + " negative");
           
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public int getGoals()
    {
        return goals;
    }
    
    public int getAssists()
    {
        return assists;
    }
    
    public int getMinutesPlayed()
    {
        return minutesPlayed;
    }
    
    public int getGamesPlayed()
    {
        return gamesPlayed;   
    }
    
    
}
