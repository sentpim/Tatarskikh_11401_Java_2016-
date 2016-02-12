import java.util.ArrayList;

/**
 * Created by sentpim on 12.02.2016.
 */
public class BasketballTeam {
    String country = "";
    String league = "";
    String name = null;
    ArrayList<Player> players = null;
    Arena homeStadium = null;
    Manager coach = null;
    ArrayList<Team> historyCoaches = null;

    public BasketballTeam(String name,Arena stadium,Manager coach) {
        this.name = name;
        this.homeStadium = stadium;
        this.coach = coach;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(Player player){
        if (this.players.contains(player)){
            this.players.remove(player);
        }
    }

    public void changeStadium(Arena stadium){
        this.homeStadium = stadium;
    }

    public void newCoach(Manager coach){
        this.coach = coach;
    }

    @Override
    public String toString() {
        String a = "" + this.name + " (" + this.league + ", " + this.country + ")";
        return a;
    }

    public int pointsFrom(Team team) {
        return 0;
    }

    public int pointsAgainst(Team team) {
        return 0;
    }

    public int matchesInRow (Team team) {
        return 0;
    }

    public ArrayList calendar (Team team) {
        return null;
    }

    public Match bestScorer(Team team) {
        return null;
    }
}
