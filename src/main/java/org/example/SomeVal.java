package org.example;

import org.springframework.stereotype.Component;

@Component
public class SomeVal {
    Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @Override
    public String toString(){
        return ""+a;
    }
}
