import java.util.List;

/**
 * Created by sentpim on 26.02.2016.
 */
public class Student {
    private String name;
    private Institute institute;
    private List<Lesson> lessons;
    Student(String name, Institute institute) {
        this.institute = institute;
        this.name = name;
    }

    public Institute getInstitute() {
        return institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "institute=" + institute +
                ", name='" + name + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
