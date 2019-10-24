package example.model.response;

import java.util.ArrayList;

public class Sample {
    private String name;
    private Integer age;
    private ArrayList<String> list;

    public Sample(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.list = new ArrayList<String>();
        for(int i = 1; i < 11; i++) {
            this.list.add(i + "-" + this.name + " " + this.age);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public ArrayList<String> getList() {
        return this.list;
    }
}