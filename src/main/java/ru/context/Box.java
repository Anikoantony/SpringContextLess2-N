package ru.context;

import org.springframework.stereotype.Component;

@Component
public class Box {

    private String color="red";

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
         }

    public Box() {
    }
}
