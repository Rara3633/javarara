package controller;

import java.util.Scanner;

public class Management {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Student[] students = new Student[5]; 
    
            
            for (int i = 0; i < students.length; i++) {
                System.out.print("Enter the student name" + (i + 1) + ": ");
                String name = scanner.nextLine();
    

                System.out.print("Enter scores for Math, Science, and English : ");
                String[] scoreStrings = scanner.nextLine().split(name, i);
                int[] scores = new int[scoreStrings.length];
    

                for (int j = 0; j < scoreStrings.length; j++) {
                    scores[j] = Integer.parseInt(scoreStrings[j]); 
                }
    
                students[i] = new Student(name, scores, i); 
            }
    

            System.out.println("\nStudent Summary:");
            for (Student student : students) {
                System.out.println("Name: " + student.getName());
                System.out.println("Average Score: " + student.calculateAverage());
                System.out.println("Grade: " + student.assignGrade());
                
            }
    
            scanner.close();
        }
    }