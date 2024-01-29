package collections1;

import java.util.HashMap;

public class StudentHashMap {

    private HashMap<String, Student> studentMap;

    public StudentHashMap() {
        studentMap = new HashMap<>();
        initializeStudents();
    }

    private void initializeStudents() {
        studentMap.put("John", new Student("John", "Doe", 3.5));
        studentMap.put("Jane", new Student("Jane", "Smith", 3.2));
        studentMap.put("Alice", new Student("Alice", "Johnson", 3.8));
        studentMap.put("Bob", new Student("Bob", "Brown", 3.6));
        studentMap.put("Emily", new Student("Emily", "Davis", 3.9));
        studentMap.put("Michael", new Student("Michael", "Wilson", 3.3));
        studentMap.put("Samantha", new Student("Samantha", "Martinez", 3.7));
        studentMap.put("David", new Student("David", "Anderson", 3.4));
    }

    public Student getStudentByName(String firstName) {
        return studentMap.get(firstName);
    }
}
