package com.hexaware.practice;

public class Practice {

    public static void main(String[] args) {

        //appending
        StringBuilder sb= new StringBuilder("tejas");
        sb.append(" rai ");
        System.out.println(sb);

        //insert at index
        StringBuilder sb2=new StringBuilder("IShan");
        sb2.insert(1,"hello");
        System.out.println(sb2);

        //delete
        StringBuilder sb3=new StringBuilder("Hello");
        sb3.delete(1,3);
        System.out.println(sb3);
    }
}
