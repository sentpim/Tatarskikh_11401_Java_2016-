import java.util.ArrayList;

/**
 * Created by sentpim on 12.02.2016.
 */
public interface Arena {
        String name = null;
        String city = null;
        String country = null; //Usa, Canada
        Team team = null;
        int capacity = -1;

        public String toString();
        public ArrayList lastFiveMatches(Arena stadium); //последние 5 матчей
        public ArrayList allStadiumsInCountry(Arena stadium);//все стадионы в стране
}
