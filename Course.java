/* *****************************************
 *  File : Course.java
 *  Author : Celia Ho	 
 *  Last Modified : Thu 18 April 2024
 *  Description : Using the attached Student and Course class, modify the Course class so that it 
 *  throws exceptions in the appropriate places (read the comments to determine where).
 *  Then create a TestCourse class that attempts to instantiate several courses, some good and some
 *  bad. Handle the errors for the bad courses.
 * ****************************************/

package courses;

public class Course {

    private String courseName;
    private int credits;
    private String instructorName;
    private String days;
    private String times;
    private Student[] students;
    private int numStudents = 0;
    private int maxStudents = 30;
    
    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[maxStudents];
    }

    public Course(String courseName, int credits, String instructorName,
            String days, String times) throws Exception { // credits must be 0 <= credits <= 6
        students = new Student[maxStudents];
        if (credits < 0 || credits > 6)
            throw new Exception("Invalid number of credits");
        if (credits >= 0 && credits <= 6) {     // my code
            this.credits = credits;             // my code
        }                                       // my code
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    }
    
    public Course(String courseName, int credits, String instructorName,
        String days, String times, int maxStudents) throws Exception { // maxStudents must be 8 <= maxStudents <= 30
            if (maxStudents < 8 || maxStudents > 30) 
                throw new Exception("Invalid number of students");
            if (maxStudents >= 8 && maxStudents <= 30) {    // my code
                students = new Student[this.maxStudents];   // my code
            }                                             // my code
        this.credits = credits;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.days = days;
        this.times = times;
    }

    // TODO: create addStudents that adds an ARRAY of students
    // ERROR if student already in list of students
    // already in our list of students...
    public void addStudents(Student[] students) throws Exception {
        if (numStudents == 0) {
           
            this.students = students;
            numStudents = students.length;
        } else {
            for (int i = 0; i < students.length; i++) {
                addStudent(students[i]);
            }
        }
    }
    public void addStudent(Student s) throws Exception { // ERROR If student already in list of students
        for (int i = 0; i < students.length; i++) {
            if (s == students[i])   // ***IS THIS CORRECT?
                throw new Exception("Student " + s + "is already in the list of students."); // ***IS THIS CORRECT?
        }
        if (numStudents < maxStudents) {
            
            students[numStudents++] = s;    // Increment numStudents and make that number the index of the added student in Student List
        }
    }

    public Student[] getStudents() {
        Student[] s = new Student[numStudents];
        for (int i = 0; i < numStudents; i++)
        s[i] = students[i];
        return s;
    }

    // TODO public Student getStudent(String name)
    public Student getStudentByName(String name) throws Exception {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentName().equals(name)) {
                return students[i];
            }
        }
        throw new Exception("Student " + name + " not found");
    }  

    // TODO public Student getStudent(String id)
    public Student getStudentByID(String id) throws Exception {
        for (int i = 0; i < numStudents; i++) {
            if (students[i].getStudentID().equals(id)) {
                return students[i];
            }
        }
        throw new Exception("Student " + id + " not found");
        }

    public int getNumStudents() {
        return numStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getDays() {
        return days;
    }

    public String getTimes() {
        return times;
    }

 // TODO
    public void dropStudent(Student s) {
        int studentIndex = -1;   // Declare variable to hold index of student to drop

       // Find index of student to drop in Student List
        for (int i = 0; i < students.length; i++) {
            if (s == students[i]) {
                studentIndex = i;
            }
        }
        // Shift students to overwrite dropped student
        for (int i = studentIndex; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }

        // Set the last Student List element to null
        students[students.length - 1] = null;

        // Decrement the numStudents
        numStudents -= numStudents--;  
    }

    @Override
    public String toString() {
        String frontEnd = courseName + "\n" + instructorName + "\nCredits: " 
                + credits + "\nHas " + maxStudents + " max"
                + "\nMeets: " + days + ", " + times;
        // TODO: add list of students to toString
        // don't have all maxStudents (likely) so can't use
        // foreach loop like this
        // for (Student s : students) {
        for (int i = 0; i < numStudents; i++) {
            frontEnd += "\n" + students[i].toString();
        }
        return frontEnd;
    }
}
