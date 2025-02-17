package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString(exclude = {
        "name", "age"
})

public class Human {
    private int age;
    private String name;

//  эквивалентно @ToString
//    public void print() {
//        System.out.println(age + " " + name);
//    }
}
