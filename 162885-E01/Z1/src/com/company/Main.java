package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Character[] characterRepeated = {'a','b','a','c','d','a' };
        LocalTime[] localTimesRepeated = {
                LocalTime.of(12,13),
                LocalTime.of(14,55),
                LocalTime.of(12,13),
                LocalTime.of(15,33)
        };
        System.out.println(ArrayUtil.removeRepeatedElements(characterRepeated));
        System.out.println(ArrayUtil.removeRepeatedElements(localTimesRepeated));
    }
}

class ArrayUtil{
    public static <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : array) {
            for (T value : array) {
                if (t != value && !list.contains(t)) {
                    list.add(t);
                }
            }
        }
        return list;
    }
}