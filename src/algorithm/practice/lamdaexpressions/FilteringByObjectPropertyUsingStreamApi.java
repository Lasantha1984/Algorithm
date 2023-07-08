/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.practice.lamdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class FilteringByObjectPropertyUsingStreamApi {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        persons.add(new Person(10, "AAA"));
        persons.add(new Person(17, "AAB"));
        persons.add(new Person(18, "AAC"));
        persons.add(new Person(22, "AAD"));
        persons.add(new Person(26, "AAE"));
        persons.add(new Person(19, "AAF"));
        List<Person> over18 = persons.stream().filter(p->p.age>18).collect(Collectors.toList());
        System.out.println(over18);
    }
}

class Person{
 int age;
 String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }
 

   
}
