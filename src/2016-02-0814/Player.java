import java.util.ArrayList;

/**
 * Created by sentpim on 12.02.2016.
 */
public interface Player {
    String name = null;
    String position = null; //shooting guard,point guard, center,power forward, small forward
    Team team = null;
    String country = null;

    public String toString();
    public int countPoints(Player player); //очки
    public int countPoints(Player player,int season); //очки за сезон
    public int countAssists(Player player); //передачи
    public int countAssists(Player player,int season); //передачи за сезон
    public int countRebounds(Player player); //подборы
    public int countRebounds(Player player,int season); //подборы за сезон
    public ArrayList scoredTeamsMore20(Player player);//команды которым забросил больше 20 очков
    public ArrayList Tournaments(Player player);//турниры в которых принимал участие
}
