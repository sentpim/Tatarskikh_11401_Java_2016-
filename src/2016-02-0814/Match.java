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
    public ArrayList mvps(Match match); //������ ������ �����
    public ArrayList h2h(Match match); //���� �� ����
    public ArrayList formTeam1(Match match); //����� ������� 1
    public ArrayList formTeam2(Match match); //����� ������� 2
}
