package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a==b)
            System.out.println(3);
        else
        {
            if (a==c)
                System.out.println(2);
            else
                System.out.println(1);
        }

        //напишите тут ваш код
    }
}
