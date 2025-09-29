package module2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class JavaProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        // Create students
        RemoteStudents remoteStudent = new RemoteStudents("R001", "Alice");
        InPersonStudents inPersonStudent = new InPersonStudents("P001", "Bob");

        // Remote student input
        System.out.println("Enter scores for Remote Student (Midterm, Final, Assignments, Discussion):");
        double rMid = sc.nextDouble();
        double rFinal = sc.nextDouble();
        double rAssign = sc.nextDouble();
        double rDisc = sc.nextDouble();
        double rScore = remoteStudent.score(rMid, rFinal, rAssign, rDisc);

        System.out.println(remoteStudent.toString());
        System.out.println("Weighted Score: " + df.format(rScore));

        // In-person student input
        System.out.println("\nEnter scores for In-Person Student (Midterm, Final, Assignments):");
        double iMid = sc.nextDouble();
        double iFinal = sc.nextDouble();
        double iAssign = sc.nextDouble();
        double iScore = inPersonStudent.score(iMid, iFinal, iAssign, 0);

        System.out.println(inPersonStudent.toString());
        System.out.println("Weighted Score: " + df.format(iScore));

        sc.close();
    }
}
