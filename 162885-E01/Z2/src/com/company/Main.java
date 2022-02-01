package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        printMarginal(list);

        List<String> listInt = new LinkedList<String>();
        listInt.add("zzzzzzzzzzz");
        listInt.add("aaaaaaasd");

        printMarginal(listInt);
    }
    public static <E> void printMarginal(Iterable<E> object){
        for(E e: object){
        System.out.println(e);
        }
    }
}
