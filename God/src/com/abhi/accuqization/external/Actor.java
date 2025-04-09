package com.abhi.accuqization.external;

import com.abhi.accuqization.internal.Person;
import com.abhi.accuqization.internal.Human;

public class Actor extends Person {
    public void actor() {
        System.out.println("running in Actor");
        Actor actor = new Actor();
        Person person = new Actor();
        Human human = new Actor();
    }
}
