package com.thn;

/**
 * @author: 田浩楠
 * @create: 2018-07-19 08:55
 **/
public class Example {
    String str = new String("good");

    char[] ch = { 'a', 'b', 'c' };

    public static void main(String args[]) {

        Example ex = new Example();

        ex.change(ex.str, ex.ch) ;

        System.out.print(ex.str + " and ");

        System.out.print(ex.ch);

    }

    public void change(String str, char ch[]) {

        str = "test oksdasd";

        ch[0] = 'g';

    }
}
