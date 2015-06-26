package org.trepel.jsf2springsecurity.reproducer;

import java.io.Serializable;

public class Dragon implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -7095298055245746626L;

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
