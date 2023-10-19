package com.ue.insw.proyecto.exercises.ej7json;

/**
 * Class employee for the exercise 7
 */
public class Employee {

    /**
     * Name of the employee
     */
    protected String name;
    /**
     * email of the employee
     */
    protected String email;
    /**
     * phone of the employee
     */
    protected long phone;
    /**
     * If the employee is subscribed
     */
    protected boolean subscribed;
    /**
     * Date of birth of the employee
     */
    protected String birth;

    /**
     * Constructor of the class
     * @param name name of the employee
     * @param email email of the employee
     * @param phone phone of the employee
     * @param subscribed if the employee is subscribed
     * @param birth date of birth of the employee
     */
    public Employee(String name, String email, long phone, boolean subscribed, String birth) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subscribed = subscribed;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public boolean isSubscribed() {
        return subscribed;
    }

    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
