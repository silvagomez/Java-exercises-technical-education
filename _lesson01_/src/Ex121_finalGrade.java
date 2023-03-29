import java.util.Scanner;

public class Ex121_finalGrade {
    // EXERCISE 21
    /*------------------------------------------------
     * A student wants to know the final grade in a subject.
     * This grade is obtained as follows:
     * 55% of the average of his 3 partial grades.
     * 30% of the grade of the final exam.
     * 15% of the grade of a final paper.
     *------------------------------------------------*/
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        float grade1, grade2, grade3, gradesAverages, gradeExam, gradePaper, gradeFinal;

        System.out.println("Grades in %");
        System.out.println("Enter grade 1:");
        grade1 = keyboard.nextFloat();
        System.out.println("Enter grade 2:");
        grade2 = keyboard.nextFloat();
        System.out.println("Enter grade 3:");
        grade3 = keyboard.nextFloat();

        gradesAverages = (grade1 + grade2 + grade3) / 3;
        gradesAverages = (float) (gradesAverages*0.55);

        System.out.println("Enter grade of final exam:");
        gradeExam=keyboard.nextFloat();
        gradeExam=(float) (gradeExam*0.3);

        System.out.println("Enter grade of paper");
        gradePaper=keyboard.nextFloat();
        gradePaper=(float) (gradePaper*0.15);
        gradeFinal=gradesAverages+gradeExam+gradePaper;

        System.out.print("The final grade is "+gradeFinal);
    }
}
