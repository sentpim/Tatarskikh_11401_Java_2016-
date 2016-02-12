import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sentpim on 12.02.2016.
 */
public interface Match {
    Date matchDate = null;
    Team team1 = null;
    Team team2 = null;
    Arena arena = null;

    public String toString();
    public ArrayList mvps(Match match); //лучшие игроки матча
    public ArrayList h2h(Match match); //бокс ту бокс
    public ArrayList formTeam1(Match match); //форма команды 1
    public ArrayList formTeam2(Match match); //форма команды 2
}
