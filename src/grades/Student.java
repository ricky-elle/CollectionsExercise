package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student student = new Student("Ricky");
        student.addGrade(100);
        student.addGrade(0);
        System.out.println(student.getGradeAverage());
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    };
    public double getGradeAverage(){
        double sum=0;
        for(int grade:this.grades){
            sum+=grade;
        }
        return Double.parseDouble(String.format("%.2f",sum/this.grades.size()));
    };
}
