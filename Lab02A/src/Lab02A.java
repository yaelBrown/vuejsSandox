import java.util.Arrays;
import java.util.Scanner;
public class Lab02A
{
    public static void main (String[]args)
    {
        // Create student objects.
        Student s1 = new Student();
        /*System.out.println("New student created.");
        s1.setLastName();
        s1.setFirstName();
        s1.setID();*/
        s1.setScores();
        String [][] scoresAndGrades = s1.setGrade(s1.grades);
        System.out.println(s1.toString() +"\n" + "with a final GPA of " + s1.getGPA(s1.grades));
        System.out.println("Scores and letter grades are: ");
        for (int i = 0 ; i < scoresAndGrades.length; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.println(scoresAndGrades[i][j] + "\t");
            }
        }

        Student s2 = new Student();
        System.out.println("New student created.");
        s2.setLastName();
        s2.setFirstName();
        s2.setID();
        s2.setScores();
        scoresAndGrades = s2.setGrade(s2.grades);
        System.out.println(s2.toString() +"\n" + "with a final GPA of " + s2.getGPA(s2.grades));
        System.out.println("Scores and letter grades are: " + Arrays.toString(scoresAndGrades));


    }

}

class Student
{
    // Class Data Field
    Scanner input = new Scanner(System.in);
    String lastName;
    String firstName;
    int iD;
    double [] grades = new double [4];

    // no-arg Constructor Method
    Student()
    {
    }


    // Mutator Method for lastName
    public String setLastName()
    {
        System.out.println("Enter the last name of the new student:");
        lastName = input.nextLine();
        return lastName;
    }

    // Mutator Method for firstName
    public String setFirstName()
    {
        System.out.println("Enter the first name of the new student:");
        firstName = input.nextLine();
        return firstName;
    }

    // Mutator Method for iD
    public int setID()
    {
        System.out.println("Enter the ID number of the new student:");
        iD = input.nextInt();
        return iD;
    }


    // Mutator Method for scores
    public double [] setScores ()
    {
        for (int i = 0; i < grades.length; i++)
        {
            System.out.println("Enter this students score for class " + (i+1) + ": ");
            grades [i] = input.nextDouble();
        }

        return grades;
    }

    // Mutator method for grade values.
    public String [][] setGrade (double [] grades)
    {
        String [][] gradesAndValues = new String[4][2];
        // For loop transfers values from original array to new array.
        for (int i = 0 ; i < grades.length; i++)
        {
            gradesAndValues[i][0] = Double.toString(grades[i]);
        }


        // Nested For loops add grade values to the 2nd column of the new array with J starting at 1.
        for (int j = 0 ; j < gradesAndValues.length; j++)
        {
            System.out.println("Enter the letter grade for a score of " + gradesAndValues[j][0] + ": ");
            if (j == 0) {
                gradesAndValues[j][1] = input.nextLine();
            }

            for (int k = 1; k < 2; k++) {
                gradesAndValues[j][k] = input.nextLine();
            }
        }



        return gradesAndValues;
    }

    // Accessor Method for Grades
    private double [] getGrades (double[] studentGrades)
    {
        for (int i = 0 ; i < studentGrades.length; i++)
        {
            System.out.print(studentGrades[i] + "\t");
        }
        return studentGrades;
    }

    // Accessor Method for GPA
    public float getGPA (double [] grades)
    {
        float gpa = 0 , sum = 0;
        for (int i=0; i<grades.length; i++){
            sum += grades[i];
        }
        gpa = sum / grades.length;
        return gpa;
    }

    // toString Method
    public String toString()
    {
        return "Entered information for student " + lastName + ", " + firstName + ", ID#:" + iD +
                " , with the following grades " + Arrays.toString(grades);

    }


}
