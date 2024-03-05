/*
 * Created on 2024-03-04
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

// NO NEED TO TOUCH THIS FILE
public class Owner {
    private String name;
    private Cat cat;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
