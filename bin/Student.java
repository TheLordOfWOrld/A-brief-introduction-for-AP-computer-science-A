public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
}
class StudentAthlete extends Student
{
    private String Level;
    private String sport;

    public StudentAthlete(String name, int id, double gpa, String sport, String Level) {
        super(name, id, gpa);
        this.sport = sport;
        this.Level = Level;
        
    }

}
/*You will create the constructors for both the Student class and the StudentAthelete class. (Remember that your subclass constructor needs to call the superclass constructor, so make sure you have the parameters to do that.)

Our superclass will be the Student class and contain the following instance variables:

String name - Student’s first and last name
int id - Student’s ID number
double gpa - Student’s GPA

Our subclass will be StudentAthlete and contain the following instance variables:

String sport - Name of sport student plays
String level - The level at which the student plays (varsity校队, junior varsity, etc)


(The classes will have getters and a toString, but no setters. You can use these to test, but do not need to alter them.)

Once completed, create two students as noted in the StudentTester class. */