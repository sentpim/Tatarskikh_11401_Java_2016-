import java.util.ArrayList;

/**
 * Created by sentpim on 12.02.2016.
 */
public interface Team {
    String name = null;
    String Conference = null; //East, West
    ArrayList<Player> players = null;
    Arena homeStadium = null;
    Manager coach = null;
    String country = null; // Canada, USA

    public String toString();
    public int pointsFrom(Team team); //набранные очки
    public int pointsAgainst(Team team);//пропущенные
    public int matchesInRow(Team team); //текущее ко-во побед подряд
    public ArrayList calendar(Team team);//календарь команды
    public Player bestScorer(Player player);//самый результативный игрок

}

