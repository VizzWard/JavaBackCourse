package org.vzw.PickALanguage.LearnTheFundamentals.OOP.Association;

import java.util.*;

// Student class
class Student {
    String name;
    int enrol ;
    String course;

    Student(String name, int enrol, String course) {
        this.name = name;
        this.enrol = enrol;
        this.course = course;
    }
}

// Course class having a list of students.
class Course {
    String name;
    private List<Student> students;

    Course(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> studentsData() {
        return students;
    }
}

/* College class having a list of Courses*/
class College {
    String collegeName;
    private List<Course> courses;

    College(String collegeName, List<Course> courses) {
        this.collegeName = collegeName;
        this.courses = courses;
    }

    // Returning number of students available in all courses in a given college
    public int countStudents() {
        int studentsInCollege = 0;
        List<Student> students;
        for(Course course : courses)
        {
            students = course.studentsData();
            for(Student s : students)
            {
                studentsInCollege++;
            }
        }
        return studentsInCollege;
    }

}

class AggregationExample
{
    public static void main (String[] args)
    {
        Student std1 = new Student("Emma", 1801, "MCA");
        Student std2 = new Student("Adele", 1802, "BSC-CS");
        Student std3 = new Student("Aria", 1803, "Poly");
        Student std4 = new Student("Ally", 1804, "MCA");
        Student std5 = new Student("Paul", 1805, "Poly");

        // Constructing list of MCA Students.
        List <Student> mca_students = new ArrayList<Student>();
        mca_students.add(std1);
        mca_students.add(std4);

        //Constructing list of BSC-CS Students.
        List <Student> bsc_cs_students = new ArrayList<Student>();
        bsc_cs_students.add(std2);

        //Constructing list of Poly Students.
        List <Student> poly_students = new ArrayList<Student>();
        poly_students.add(std3);
        poly_students.add(std5);

        Course MCA = new Course("MCA", mca_students);
        Course BSC_CS = new Course("BSC-CS", bsc_cs_students);
        Course Poly = new Course("Poly", poly_students);

        List <Course> courses = new ArrayList<Course>();
        courses.add(MCA);
        courses.add(BSC_CS);
        courses.add(Poly);

        // creating object of College.
        College college = new College("ABES", courses);

        System.out.print("Total number of students in the college "+ college.collegeName +" is "+ college.countStudents());
    }
}