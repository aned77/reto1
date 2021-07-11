/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author familia aguirre
 */
public class clsPerson {
    private String name;
    private int age;
    private String id;
    private int numberId;
    private long phone;
    private String adress;
    private char gender;
    private float weight;
    private float height;

    public clsPerson() {
    }

    public clsPerson(String name, int age, String id, int numberId, long phone, String adress, char gender, float weight, float height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.numberId = numberId;
        this.phone = phone;
        this.adress = adress;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
    
    
    
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the numberId
     */
    public int getNumberId() {
        return numberId;
    }

    /**
     * @param numberId the numberId to set
     */
    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    /**
     * @return the phone
     */
    public long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(long phone) {
        this.phone = phone;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }
    
}
