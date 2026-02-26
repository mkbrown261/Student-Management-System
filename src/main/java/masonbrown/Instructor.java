package masonbrown;

import java.util.ArrayList;

public class Instructor extends Person {

     private String department;
    private ArrayList<Student> students;

     public Instructor(int id, String firstName, String lastName,
                        String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
          this.students = new ArrayList<>();
    }

    public void createAnnouncement(String message) {
        System.out.println("Announcement from "
                + getFirstName() + ": " + message);
    }

     public void addStudent(Student student) {
        students.add(student);
    }

      public void printRoster() {
        System.out.println(getFirstName() + " " + getLastName() + "'s Roster:");
        for (Student s : students) {
            System.out.println("  - "
                    + s.getFirstName() + " "
                    + s.getLastName()
                    + " | Grade Level: " + s.getSummary().split("\\|")[1].trim()
                    + " | GPA: " + s.getSummary().split("\\|")[2].trim());
        }
    }

     @Override
       public String getSummary() {
          return "[Instructor] " + getFirstName() + " " + getLastName()
                + " | Department: " + department;
    }
}