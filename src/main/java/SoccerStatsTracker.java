
import java.util.ArrayList; // Suggested by AI to store all players
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 * Name: Slater Zevallos
 * Project Name: Soccer Stats Tracker
 * Project Desc: This program tracks individual soccer player statistics. The program
 *               lets you add and view goals, assists, minutes played, etc.
 *               Polymorphism, inheritance, exception handling, and input validation
 *               are all used in this program.
 * @author slate
 */
public class SoccerStatsTracker 
{
    private static Player user;
    private static ArrayList<Player> players = new ArrayList<>();
    private static int playerCount = 0;
    public static void main(String[] args) 
    {
        int choice;
        do
        {
           String[] menuOptions = {"Register new player" , "Existing player", "Exit"};
            choice = JOptionPane.showOptionDialog
        (
                null, // sets frame to null
                "Would you like to register a new player? Or check"
                        + " a player's stats?", // message
                "Soccer Player Stats Tracker", //title of window
                JOptionPane.DEFAULT_OPTION, // allows for multiple options
                JOptionPane.QUESTION_MESSAGE, // displays question mark icon
                null, // custom icon (null since we don't have one)
                menuOptions, // grabs from the array menuOptions
                null // no default highlighted button
        );
        
        if(choice == 0)
        {   
            registerPlayer();
        }
        
        else if(choice == 1)
        {
            displayPlayer();
        }
        
        
        }while(choice != 2);
        
        JOptionPane.showMessageDialog(null,"Thank you for using Soccer Stats Tracker");
        
        
    }
    
    public static void registerPlayer()
    {
        String[] options = {"Forward", "Midfielder","Defender","Goalkeeper"};

                int selection = JOptionPane.showOptionDialog(
                    null, 
                    "Choose player's current position: ", 
                    "Positions", 
                    JOptionPane.DEFAULT_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, 
                    null, 
                    options, 
                    options[0]
                );
        switch (selection) {
            case 0:
                user = new Forward();
                forwardRegistration();
                break;
            case 1:
                user = new Midfielder();
                midfielderRegistration();
                break;
            case 2:
                user = new Defender();
                defenderRegistration();
                break;
            case 3:
                user = new Goalkeeper();
                goalkeeperRegistration();
                break;
            default:
                break;
        }
                
    }
    
    public static void forwardRegistration()
    {
        boolean isValid;
        
        Forward forward = (Forward) user;
                //user  = new Player();
                //ask for player's age
                do
                {
                    //tries to have the player enter their age
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's age: ");
                    int age = Integer.parseInt(input);
                    forward.setAge(age);
                    isValid = true;
                    }
                    //runs if player inputs a number less than 17
                    catch(NumberFormatException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks for player's name
                do
                {
                    isValid = false;

                    //tries to have the player enter their name
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's name: ");
                    forward.setName(input);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's minutes played
                do
                {
                    isValid = false;

                    //tries to have the player enter their minutes played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter minutes played: ");
                    int minutes = Integer.parseInt(input); 
                    forward.setMinutesPlayed(minutes);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's games played
                do
                {
                    isValid = false;

                    //tries to have the player enter their games played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter games played: ");
                    int games = Integer.parseInt(input); 
                    forward.setGamesPlayed(games);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their goals scored
                do
                {
                    isValid = false;

                    //tries to have the player enter their goals
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter goals scored: ");
                    int goals = Integer.parseInt(input); 
                    forward.setGoals(goals);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their assists made
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter assists made: ");
                    int assists = Integer.parseInt(input); 
                    forward.setAssists(assists);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter 1v1s attempted: ");
                    int attempted1v1 = Integer.parseInt(input); 
                    forward.setOneVsOneAttempted(attempted1v1);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter 1v1s completed: ");
                    int completed1v1 = Integer.parseInt(input); 
                    forward.setOneVsOneCompleted(completed1v1);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                JOptionPane.showMessageDialog(null,
                                            "Player name: " + forward.getName()
                                          + "\nAge: " + forward.getAge() 
                                          + "\nGoals: " + forward.getGoals()
                                          + "\nAssists: " + forward.getAssists()
                                          + "\nMinutes Played: " + forward.getMinutesPlayed()
                                          + "\nGames Played: " + forward.getGamesPlayed()
                                          + "\n 1v1 success rate: " + forward.getOneVsOneSuccessRate() + "%"                                  
                                        ); 
                players.add(forward);
                playerCount++;
    }
    
    public static void midfielderRegistration()
    {
        boolean isValid;
        
        Midfielder midfielder = (Midfielder) user;
                //user  = new Player();
                //ask for player's age
                do
                {
                    //tries to have the player enter their age
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's age: ");
                    int age = Integer.parseInt(input);
                    midfielder.setAge(age);
                    isValid = true;
                    }
                    //runs if player inputs a number less than 17
                    catch(NumberFormatException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks for player's name
                do
                {
                    isValid = false;

                    //tries to have the player enter their name
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's name: ");
                    midfielder.setName(input);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's minutes played
                do
                {
                    isValid = false;

                    //tries to have the player enter their minutes played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter minutes played: ");
                    int minutes = Integer.parseInt(input); 
                    midfielder.setMinutesPlayed(minutes);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's games played
                do
                {
                    isValid = false;

                    //tries to have the player enter their games played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter games played: ");
                    int games = Integer.parseInt(input); 
                    midfielder.setGamesPlayed(games);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their goals scored
                do
                {
                    isValid = false;

                    //tries to have the player enter their goals
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter goals scored: ");
                    int goals = Integer.parseInt(input); 
                    midfielder.setGoals(goals);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their assists made
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter assists made: ");
                    int assists = Integer.parseInt(input); 
                    midfielder.setAssists(assists);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter passes attempted: ");
                    int attemptedPasses = Integer.parseInt(input); 
                    midfielder.setPassAttempted(attemptedPasses);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter passes completed: ");
                    int passesCompleted = Integer.parseInt(input); 
                    midfielder.setPassCompleted(passesCompleted);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                JOptionPane.showMessageDialog(null,
                                            "Player name: " + midfielder.getName()
                                          + "\nAge: " + midfielder.getAge() 
                                          + "\nGoals: " + midfielder.getGoals()
                                          + "\nAssists: " + midfielder.getAssists()
                                          + "\nMinutes Played: " + midfielder.getMinutesPlayed()
                                          + "\nGames Played: " + midfielder.getGamesPlayed()
                                          + "\n Pass Accuracy: " + midfielder.getPassAccuracy() + "%"                                  
                                        ); 
                players.add(midfielder);
                playerCount++;
    }
    
    public static void defenderRegistration()
    {
        boolean isValid;
        
        Defender defender = (Defender) user;
                //user  = new Player();
                //ask for player's age
                do
                {
                    //tries to have the player enter their age
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's age: ");
                    int age = Integer.parseInt(input);
                    defender.setAge(age);
                    isValid = true;
                    }
                    //runs if player inputs a number less than 17
                    catch(NumberFormatException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks for player's name
                do
                {
                    isValid = false;

                    //tries to have the player enter their name
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's name: ");
                    defender.setName(input);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's minutes played
                do
                {
                    isValid = false;

                    //tries to have the player enter their minutes played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter minutes played: ");
                    int minutes = Integer.parseInt(input); 
                    defender.setMinutesPlayed(minutes);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's games played
                do
                {
                    isValid = false;

                    //tries to have the player enter their games played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter games played: ");
                    int games = Integer.parseInt(input); 
                    defender.setGamesPlayed(games);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their goals scored
                do
                {
                    isValid = false;

                    //tries to have the player enter their goals
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter goals scored: ");
                    int goals = Integer.parseInt(input); 
                    defender.setGoals(goals);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their assists made
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter assists made: ");
                    int assists = Integer.parseInt(input); 
                    defender.setAssists(assists);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter tackles attempted: ");
                    int attempted = Integer.parseInt(input); 
                    defender.setTacklesAttempted(attempted);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter tackles completed: ");
                    int inputInt = Integer.parseInt(input); 
                    defender.setTacklesCompleted(inputInt);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                JOptionPane.showMessageDialog(null,
                                            "Player name: " + defender.getName()
                                          + "\nAge: " + defender.getAge() 
                                          + "\nGoals: " + defender.getGoals()
                                          + "\nAssists: " + defender.getAssists()
                                          + "\nMinutes Played: " + defender.getMinutesPlayed()
                                          + "\nGames Played: " + defender.getGamesPlayed()
                                          + "\n Tackle Success Rate: " + defender.getTackleSuccessRate() + "%"                                  
                                        ); 
                players.add(defender);
                playerCount++;
    }
    
    public static void goalkeeperRegistration()
    {
        boolean isValid;
        
        Goalkeeper goalkeeper = (Goalkeeper) user;
                //user  = new Player();
                //ask for player's age
                do
                {
                    //tries to have the player enter their age
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's age: ");
                    int age = Integer.parseInt(input);
                    goalkeeper.setAge(age);
                    isValid = true;
                    }
                    //runs if player inputs a number less than 17
                    catch(NumberFormatException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks for player's name
                do
                {
                    isValid = false;

                    //tries to have the player enter their name
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter the player's name: ");
                    goalkeeper.setName(input);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's minutes played
                do
                {
                    isValid = false;

                    //tries to have the player enter their minutes played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter minutes played: ");
                    int minutes = Integer.parseInt(input); 
                    goalkeeper.setMinutesPlayed(minutes);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //ask for player's games played
                do
                {
                    isValid = false;

                    //tries to have the player enter their games played
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter games played: ");
                    int games = Integer.parseInt(input); 
                    goalkeeper.setGamesPlayed(games);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their goals scored
                do
                {
                    isValid = false;

                    //tries to have the player enter their goals
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter goals scored: ");
                    int goals = Integer.parseInt(input); 
                    goalkeeper.setGoals(goals);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);

                //asks player for their assists made
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter assists made: ");
                    int assists = Integer.parseInt(input); 
                    goalkeeper.setAssists(assists);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter saves: ");
                    int attempted = Integer.parseInt(input); 
                    goalkeeper.setSaves(attempted);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                
                do
                {
                    isValid = false;

                    //tries to have the player enter their assists
                    try
                    {
                    String input = JOptionPane.showInputDialog("Enter clean sheets: ");
                    int inputInt = Integer.parseInt(input); 
                    goalkeeper.setCleanSheets(inputInt);
                    isValid = true;
                    }
                    //runs if player inputs an empty string or not greater than a character
                    catch(IllegalArgumentException e)
                    {
                       JOptionPane.showMessageDialog(null,"ERROR - " + e.getMessage());
                       isValid = false;
                    }
                }
                while(!isValid);
                JOptionPane.showMessageDialog(null,
                                            "Player name: " + goalkeeper.getName()
                                          + "\nAge: " + goalkeeper.getAge() 
                                          + "\nGoals: " + goalkeeper.getGoals()
                                          + "\nAssists: " + goalkeeper.getAssists()
                                          + "\nMinutes Played: " + goalkeeper.getMinutesPlayed()
                                          + "\nGames Played: " + goalkeeper.getGamesPlayed()
                                          + "\n Clean Sheet Rate: " + goalkeeper.getCleanSheetPercentage() + "%"                                  
                                        ); 
                players.add(goalkeeper);
                playerCount++;
    }
    
    public static void displayPlayer()
    {
        if(players.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"No players have been registered yet.");
                }
            
            else
            {
                String playerListMessage = "";
                    for(int i = 0; i < playerCount; i++)
                    {
                        playerListMessage += i + " - " + players.get(i).getName() + "\n"; 
                        // Uses a built-in method from the Array list class to grab every element from
                        //array to display
                    }
                    int playerNum;
                    String input = JOptionPane.showInputDialog(null,"Registered Players: \n" + 
                            playerListMessage + "\n\nWhich player do you want to check?");
                    playerNum = Integer.parseInt(input);
                    if(playerNum >=0 && playerNum <players.size())
                    {              
                        if(players.get(playerNum) instanceof Forward)
                        {
                            Forward forward = (Forward) players.get(playerNum);
                            JOptionPane.showMessageDialog(null,
                                            "Player name: " + forward.getName()
                                          + "\nAge: " + forward.getAge() 
                                          + "\nGoals: " + forward.getGoals()
                                          + "\nAssists: " + forward.getAssists()
                                          + "\nMinutes Played: " + forward.getMinutesPlayed()
                                          + "\nGames Played: " + forward.getGamesPlayed()
                                          + "\n 1v1 success rate: " + forward.getOneVsOneSuccessRate() + "%"                                  
                                        ); 
                        }
                        
                        if(players.get(playerNum) instanceof Midfielder)
                        {
                            Midfielder midfielder = (Midfielder) players.get(playerNum);
                            JOptionPane.showMessageDialog(null,
                                            "Player name: " + midfielder.getName()
                                          + "\nAge: " + midfielder.getAge() 
                                          + "\nGoals: " + midfielder.getGoals()
                                          + "\nAssists: " + midfielder.getAssists()
                                          + "\nMinutes Played: " + midfielder.getMinutesPlayed()
                                          + "\nGames Played: " + midfielder.getGamesPlayed()
                                          + "\n Pass Accuracy: " + midfielder.getPassAccuracy() + "%"                                  
                                        ); 
                        }
                        
                        if(players.get(playerNum) instanceof Defender)
                        {
                            Defender defender = (Defender) players.get(playerNum);
                            JOptionPane.showMessageDialog(null,
                                            "Player name: " + defender.getName()
                                          + "\nAge: " + defender.getAge() 
                                          + "\nGoals: " + defender.getGoals()
                                          + "\nAssists: " + defender.getAssists()
                                          + "\nMinutes Played: " + defender.getMinutesPlayed()
                                          + "\nGames Played: " + defender.getGamesPlayed()
                                          + "\n Tackle Success Rate: " + defender.getTackleSuccessRate() + "%"                                  
                                        ); 
                        }
                        
                        if(players.get(playerNum) instanceof Goalkeeper)
                        {
                            Goalkeeper goalkeeper = (Goalkeeper) players.get(playerNum);
                            JOptionPane.showMessageDialog(null,
                                            "Player name: " + goalkeeper.getName()
                                          + "\nAge: " + goalkeeper.getAge() 
                                          + "\nGoals: " + goalkeeper.getGoals()
                                          + "\nAssists: " + goalkeeper.getAssists()
                                          + "\nMinutes Played: " + goalkeeper.getMinutesPlayed()
                                          + "\nGames Played: " + goalkeeper.getGamesPlayed()
                                          + "\nClean Sheet Percentage: " + goalkeeper.getCleanSheetPercentage() + "%"                                  
                                        ); 
                        }
                    }
                    

            }
    }
    
}


    