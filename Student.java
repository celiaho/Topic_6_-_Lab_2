/* *****************************************
 *  File : Student.java
 *  Author : Celia Ho	 
 *  Last Modified : Thu 18 April 2024
 *  Description : Using the attached Student and Course class, modify the Course class so that it 
 *  throws exceptions in the appropriate places (read the comments to determine where).
 *  Then create a TestCourse class that attempts to instantiate several courses, some good and some
 *  bad. Handle the errors for the bad courses.
 * ****************************************/

package courses;


public class Student {

    private String studentName;
    private String studentID;
    
    /**
     * number of students constructed so far
     */
    private static int numStudents;

    /**
     * default constructor
     */
    public Student() {
        numStudents++;
    }

    /**
     * construct a student with name and id
     *
     * @param studentName the full name
     * @param studentID the id
     */
    public Student(String studentName, String studentID) {
        this.studentID = studentID;
        this.studentName = studentName;
        numStudents++;
    }

    /**
     * return the number of students created so far
     *
     * @return number of students
     */
    public static int getNumStudents() {
        return numStudents;
    }

    /**
     * get the full student name
     *
     * @return full student name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * get the student id
     *
     * @return the student ID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * set the student name
     *
     * @param studentName a string representing the full student name (first
     * thru last)
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * set studentID
     *
     * @param studentID a string representing the student ID
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return studentName + ": " + studentID;
    }

}
