/* *****************************************
 *  File : TestCourse.java
 *  Author : Celia Ho	 
 *  Last Modified : Thu 18 April 2024
 *  Description : Create a TestCourse class that attempts to instantiate several courses, some good
 *  and some bad. Handle the errors for the bad courses.
 * ****************************************/

package courses;


public class TestCourse {
    public static void main(String[] args) {
        
        // Instantiate several courses, some good and some bad. Handle the errors for the bad courses.
        
        try {
            Course Transfiguration = new Course("Transfiguration", 6, "Minerva McGonagall", "Mondays", "10:00 AM", 20);
            System.out.println("Transfiguration: Class successfully created");
        }
        catch (Exception ex) {
            System.out.println("Transfiguration: " + ex);
        }


        try {
            Course DefenseATDA = new Course("Defense Against the Dark Arts", 19, "Severus Snape", "Tuesdays", "10:00 AM");
            System.out.println("Defense Against the Dark Arts: Class successfully created");
        }
        catch (Exception ex) {
            System.out.println("Defense Against the Dark Arts: " + ex);
        }

        
        try {
            Course Herbology = new Course("Herbology", 6, "Pomona Sprout", "Wednesdays", "10:00 AM", 200);
            System.out.println("Herbology: Class successfully created");
        }
        catch (Exception ex) {
            System.out.println("Herbology: " + ex);
        }


        try {
            Course CareOMC = new Course("Care of Magical Creatures", 4, "Rubeus Hagrid", "Thursdays", "10:00 AM", 15);
            System.out.println("Care of Magical Creatures: Class successfully created");
        }
        catch (Exception ex) {
            System.out.println("Care of Magical Creatures: " + ex);
        }

    }
}
