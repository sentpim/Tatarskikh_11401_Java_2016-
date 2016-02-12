import java.util.ArrayList;
import java.util.Date;

/**
 * Created by sentpim on 12.02.2016.
 */
public interface Manager {
    String name = null;
    String country = null;
    Team currentTeam = null;
    Date birthday = null;

    public String toString();
    public String coachesFromCountry(Manager coach);//������ �������� � ���� ������
    public ArrayList coachesFromTeam(Manager coach); //������ �������� �� ��� ������� ����� �����
    public ArrayList coachesWithSimilarAge(Manager coach); //������ �������� ������ �� ��������
}
