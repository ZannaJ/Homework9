package com.company;
import com.company.Student.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    List<Employee> googleEmployees = new ArrayList<>();
//	    String goog = "Google";
//	    String micro = "Microsoft";
//
//	    googleEmployees.add(new Employee("Darby", 33, "JUI", goog));
//        googleEmployees.add(new Employee("Arthur", 22, "POI", goog));
//        googleEmployees.add(new Employee("Henrietta", 32, "DED", goog));
//
//        List<Employee> microsoftEmployees = new ArrayList<>();
//        microsoftEmployees.add(new Employee("Yeshua", 31, "432", micro));
//        microsoftEmployees.add(new Employee("Josh", 28, "321", micro));
//        microsoftEmployees.add(new Employee("Linda", 24, "213", micro));
//
//        Company microsoft = new Company(microsoftEmployees, micro);
//        Company google = new Company(googleEmployees, goog);
//
//        System.out.println("The average age of employees in microsoft is: " + microsoft.getAverageAge());
//        System.out.println("The average age of employees in google is: " + google.getAverageAge());

        // Hard-coding
        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Dave", 19, 40));
//        studentList.add(new Student("Josh", 19, 43));
//        studentList.add(new Student("Barry", 19, 55));
//        studentList.add(new Student("Dave", 19, 35));
//        studentList.add(new Student("Dave", 19, 22));
//        studentList.add(new Student("Dave", 19, 49));
//        studentList.add(new Student("Dave", 19, 33));
//        studentList.add(new Student("Dave", 19, 21));
//        studentList.add(new Student("Dave", 19, 22));
//        studentList.add(new Student("Dave", 19, 56));
//        studentList.add(new Student("Dave", 19, 34));
//        studentList.add(new Student("Dave", 19, 12));
//        studentList.add(new Student("Dave", 19, 23));
//        studentList.add(new Student("Dave", 19, 22));
//        studentList.add(new Student("Dave", 19, 54));
//        studentList.add(new Student("Dave", 19, 56));
//        studentList.add(new Student("Dave", 19, 23));
//        studentList.add(new Student("Dave", 19, 34));
//        studentList.add(new Student("Dave", 19, 44));
//        studentList.add(new Student("Dave", 19, 14));

        // User-interactive
        //Initialize the Scanner
        Scanner scanner = new Scanner(System.in);

        // Promt the user to find out how many students they want to add

        System.out.print("How many students do you want to add?: ");
        int numberOfStudents = scanner.nextInt();

        // populate the studentList with user - input
        for(int i = 0; i < numberOfStudents; i++){
            // Promt the user for data
            System.out.print("Enter the name of the student: ");
            String name = scanner.next();

            System.out.print("Enter the age of the student: ");
            int age = scanner.nextInt();

            System.out.print("Enter the score of the student: ");
            int score = scanner.nextInt();

            System.out.println();

            studentList.add(new Student(name, age, score));

        }

//        System.out.println(studentList.size());
        Student bestStudent = getMaximumScore(studentList);
        System.out.println("The maximum score of the student is: "
                + bestStudent.getScore()
                + " belonging to " + bestStudent.getName());
    }

    public static Student getMaximumScore(List<Student> students) {
        // Define a max variable to hold the maximum value
        // assign the first element of the list to the max variable
        // in order to compare it subsequent values and ensure that tje value
        // from the object in question(array, list, etc) is actually obtained.

        Student bestStudent = students.get(0);

        for (Student student : students) {
            if (bestStudent.getScore() < student.getScore()){
                bestStudent = student;

            }
        } // maximum score found by the time the loop ends
        return bestStudent;

    }
    // public class Bardy extends Car

    // Assuming we had a car brand, called Bardy.
    // Create an object of this class, and make it extend another Class called Car.
    // Class Car features include: noOfTires, color.
    // Create another class called Person.
    // Features of person include: name, age, LikeBardy, hasBardy, bardiesOwned(ArrayList)
    // In the main method, create a list that will contain a number of people.
    // And if a person likes bardy and does not have bardy, then give them a Bardy.
    //
}
