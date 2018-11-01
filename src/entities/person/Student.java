package entities.person;

import java.util.*;

/**
 * @author Group 6
 */
public class Student extends Person{

    /**
     * Default constructor
     */
    public Student() {
    }

    private String major;
    private TreeMap<String, ScoreMark> registeredCoursesScoreMap;
    private TreeMap<String,String> registeredGroups;

    /**
     * @return
     */
    public String getStudentMajor() {
      return this.major ;
    }

    /**
     * @param major
     */
    public void setStudentMajor(String major) {
      this.major = major;
    }

    /**
     * @return
     */
    public List<Course> getRegisteredCoursesScoreMap() {
        // TODO implement here
        return null;
    }

    /**
     * @param rCourses
     */
    public void setRegisteredCoursesScoreMap(List<Course> rCourses) {
        // TODO implement here
    }

    /**
     * @return
     */
    public List<Group> getRegisteredGroups() {
        // TODO implement here
        return null;
    }

    /**
     * @param rGroups
     */
    public void setRegisteredGroups(List<Group> rGroups) {
        // TODO implement here
    }

    /**
     * @return
     */
    private static int generateID() {
        // TODO implement here
        return 0;
    }

}
