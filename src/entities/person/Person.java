package entities.person; 

import java.util.*;

/**
 * @author Group 6
 */
public abstract class Person {

    /**
     * Default constructor
     */
    public Person() {
    }

    private String fullName;
    private int ID;

    /**
     * Constrcutor
     * @param fullName
     * @param ID
     */

    public Person(String fullName, int ID) {
      this.fullName = fullName ;
      this.ID = ID ;
    }

    /**
     * @return
     */
    public String getFullName() {
        return this.fullName ;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
      this.fullName = fullName ;
    }

    /**
     * @return
     */
    public int getID() {
      return this.ID;
    }

    /**
     * @param id
     */
    public void setID(int id) {
      this.ID = id ;
    }

    /**
     * @return
     */
    public abstract int generateID();

}
