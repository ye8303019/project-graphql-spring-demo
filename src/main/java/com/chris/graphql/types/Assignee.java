package com.chris.graphql.types;

/**
 * Created by ye830 on 1/4/2018.
 */
public class Assignee implements Person {

    private String name;

    private Integer age;

    private String address;

    private String nname;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }
}
