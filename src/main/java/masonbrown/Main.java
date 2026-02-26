package masonbrown;

import java.util.ArrayList;

        public class Main {

       public static void main(String[] args) {
           ArrayList<Person> people = new ArrayList<>();



        Student s1 = new Student(1, "Jordan", "Smith",
                "jordan@email.com", 2, 3.8);


            Student s2 = new Student(2, "Marcus", "Brown",
                "marcus@email.com", 1, 2.9);

            Instructor instructor = new Instructor(3, "Dr.", "Rivera",
                "rivera@email.com", "Computer Science");

          instructor.addStudent(s1);
           instructor.addStudent(s2);

         people.add(s1);
         people.add(s2);
        people.add(instructor);

        // POLYMORPHISM
            for (Person p : people) {
            System.out.println(p.getSummary());
        }

        System.out.println();
        instructor.printRoster();
    }
}