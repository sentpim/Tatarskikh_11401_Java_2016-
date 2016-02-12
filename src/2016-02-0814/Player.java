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
    public int countPoints(Player player); //����
    public int countPoints(Player player,int season); //���� �� �����
    public int countAssists(Player player); //��������
    public int countAssists(Player player,int season); //�������� �� �����
    public int countRebounds(Player player); //�������
    public int countRebounds(Player player,int season); //������� �� �����
    public ArrayList scoredTeamsMore20(Player player);//������� ������� �������� ������ 20 �����
    public ArrayList Tournaments(Player player);//������� � ������� �������� �������
}
