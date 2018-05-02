package com.zyliu.beans;

/**
 * Created by Administrator on 2018/5/2.
 */
public class PetBean {
    private String breedType;
    private int age;
    private double price;

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PetBean() {

    }

    @Override
    public String toString() {
        return "PetBean{" +
                "breedType='" + breedType + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
