package com.mytest;

import com.dot.C;

public class Test1 {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Dog();

//        for (int i = 0; i < animals.length; i++)
//            }
//        }

        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
