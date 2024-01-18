package web_devlopment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseSelection {
    private static Map<String, Integer> courseCountMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your name (type 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the course name: ");
            String courseName = scanner.nextLine();
            String courseID = generateCourseID(courseName);

    
            System.out.println("\nCourse ID for " + name + ": " + courseID);
        }

        scanner.close();
    }
    private static String generateCourseID(String courseName) {
        if (courseCountMap.containsKey(courseName)) {
            
            int count = courseCountMap.get(courseName);
            count++;
            courseCountMap.put(courseName, count);
            return courseName.substring(0, 1) + count;
        } else {
            courseCountMap.put(courseName, 1);
            return courseName.substring(0, 1) + 1;
        }
    }
}