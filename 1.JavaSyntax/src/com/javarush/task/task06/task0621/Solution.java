package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this(name);
            this.mother = mother;
        }

        Cat(String name, Cat mother, Cat father) {
            this(name, mother);
            this.father = father;
        }

        @Override
        public String toString() {
            String s = "";
            if (mother == null) {
                s = "Cat name is " + name + ", no mother";
                if (father == null)
                    s += ", no father";
                else
                    s += ", father is " + father.name;
            } else{
                s = "Cat name is " + name + ", mother is " + mother.name;
                if (father == null)
                    s += ", no father";
                else
                    s += ", father is " + father.name;
            }
            return s;
        }
    }

}
