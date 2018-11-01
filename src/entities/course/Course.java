package entities.course;

import java.util.*;

/**
 * @author Group 6
 */
public class Course {

    /**
     * Default constructor
     */
    public Course() {
    }

    /**
     * 
     */
    private String courseName;

    /**
     * 
     */
    private String courseCode;

    /**
     * 
     */
    private FacultyMember coordinator;

    /**
     * 
     */
    private int courseVacancy;

    /**
     * 
     */
    private Weightage weightage;

    /**
     * 
     */
    private boolean hasLecture;

    /**
     * 
     */
    private boolean hasTutorial;

    /**
     * 
     */
    private boolean hasLab;

    /**
     * 
     */
    private List<Student> registeredStudents;

    /**
     * 
     */
    private List<Group> groups;

    /**
     * 
     */
    public void Course() {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getCourseName() {
        // TODO implement here
        return "";
    }

    /**
     * @param cName
     */
    public void setCourseName(String cName) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getCourseCode() {
        // TODO implement here
        return "";
    }

    /**
     * @param cCode
     */
    public void setCourseCode(String cCode) {
        // TODO implement here
    }

    /**
     * @return
     */
    public FacultyMember getCoordinator() {
        // TODO implement here
        return null;
    }

    /**
     * @param cordinator
     */
    public void setCoordinator(FacultyMember cordinator) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getCourseVacancy() {
        // TODO implement here
        return 0;
    }

    /**
     * @param vacancy
     */
    public void setCourseVacancy(int vacancy) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Weightage getWeightage() {
        // TODO implement here
        return null;
    }

    /**
     * @param weightage
     */
    public void setWeightage(Weightage weightage) {
        // TODO implement here
    }

    /**
     * @return
     */
    public TypeOfCourse getCourseType() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Student> getRegisteredStudents() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Student> setRegisteredStudents() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Group> getGroups() {
        // TODO implement here
        return null;
    }

    /**
     * @param groups
     */
    public void setGroups(List<Group> groups) {
        // TODO implement here
    }

}