public class Team
{
    // Static Variables
    // ...
    public static int totalTeams = 0;
    public static int minTeams = 6;

    public static boolean tournamentReady(){
                return (minTeams <= totalTeams);
    }
    
    // Public Methods
    public Team() 
    {
        totalTeams++;
        // Some code here...
    }
    
}