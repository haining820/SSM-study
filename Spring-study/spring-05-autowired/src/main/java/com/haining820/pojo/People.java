package com.haining820.pojo;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.Resource;


public class People {
//    @Autowired
//    @Qualifier(value = "cat1")
//    @Resource
    private Cat cat;
    //    @Qualifier(value = "dog1")
//    @Resource
//    @Autowired
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }


    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

//    @Value("yuhiayang")
    public void setName(String name) {
        this.name = name;
    }
}
