package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Ricky");
        Student student2 = new Student("Elle");
        Student student3 = new Student("Mykal");
        Student student4 = new Student("Carson");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(95);
        student2.addGrade(100);
        student2.addGrade(95);
        student2.addGrade(95);
        student3.addGrade(50);
        student3.addGrade(80);
        student3.addGrade(90);
        student4.addGrade(10);
        student4.addGrade(0);
        student4.addGrade(0);
        students.put("ricky-davis", student1);
        students.put("ElleBerry", student2);
        students.put("ClinMyk2018", student3);
        students.put("CarsonBelew", student4);


        System.out.println("Welcome!");
        boolean retry;
        do {
            System.out.println("Here are the github usernames of our students:");
            System.out.println(students.keySet());
            System.out.println("What student would you like to see more information on?");
            String studentGithub = scanner.next();
            if (!students.containsKey(studentGithub)) {
                System.out.println("Sorry, no student found with the github username of \"" + studentGithub + "\".");
            }else {
                System.out.println("Name: " + students.get(studentGithub).getName() + " - " + "Github Username: " + studentGithub);
                System.out.println("Current Average: " + students.get(studentGithub).getGradeAverage());
            }
            System.out.println("Would you like to see another student?");
            String yesNo = scanner.next();
            if (yesNo.equals("y") || yesNo.equals("ye") || yesNo.equals("yes")) {
                retry = true;
            }else{
                retry=false;
            }
        }while(retry);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
