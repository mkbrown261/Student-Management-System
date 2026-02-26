package masonbrown;

public class Student extends Person {

    private int gradeLevel;
        private double gpa;

        public Student(int id, String firstName, String lastName, String email,
                   int gradeLevel, double gpa) {
        super(id, firstName, lastName, email);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

         public boolean isOnHonorRoll() {
        return gpa >= 3.5;
    }

    @Override
    public String getSummary() {
        return "[Student] " + getFirstName() + " " + getLastName()
                + " | Grade Level: " + gradeLevel
                + " | GPA: " + gpa
                + " | Honor Roll: " + (isOnHonorRoll() ? "Yes" : "No");
    }
}