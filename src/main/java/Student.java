import java.nio.file.Paths;
import java.util.ArrayList;

public class Student {

    //constructor that sets both the name and id property,&initializes the grades property as an empty ArrayList.
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // returns the student's id
    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(Integer grade : grades){
            total += grade;
        }
        return total / this.grades.size();
    }


}
