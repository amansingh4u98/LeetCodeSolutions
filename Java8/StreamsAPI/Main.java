package Java8.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static List<Student> list = Arrays.asList(
    new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
    public static void main(String[] args) {
        // Find list of students whose first name starts with alphabet A
            List<Student> liStudents = list.stream().filter(s -> s.getFirstName().startsWith("A")).collect(Collectors.toList()); 
            //System.out.println("List of students whose name starts with letter A : "+liStudents);

        // Group The Student By Department Names
            Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
            //System.out.println("Students grouped by the department names : "+mapData); 
        
        // Find the total count of student using stream
            long studentCnt = list.stream().count();
            //System.out.println("Total count of students: "+studentCnt);
        
        // Find the max age of student
            int maxAge = list.stream().mapToInt(dt -> dt.getAge()).max().getAsInt();
            //System.out.println("Max Age among Students: "+maxAge);

        // Find all departments names
            List<String> deptNames = list.stream().map(s->s.getDepartmantName()).distinct().collect(Collectors.toList());
            //System.out.println("All distinct department names : "+deptNames);
        
        // Find the count of student in each department
            Map<String, Long> countStudentInEachdept = list.stream()
            .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
            System.out.println("Student count in each department : "+countStudentInEachdept);
    }
}