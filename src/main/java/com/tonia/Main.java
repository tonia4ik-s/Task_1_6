package com.tonia;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfTheWeek = scanner.nextLine();
        int hourOfTheDay = scanner.nextInt();
        boolean isLessonNow =((dayOfTheWeek.equals("Monday") || dayOfTheWeek.equals("Friday")) && (hourOfTheDay >= 18 && hourOfTheDay < 20));
        if(isLessonNow){
            System.out.println("Lesson is running");
        } else{
            System.out.println("Lesson isn't running");
        }

    }
}
