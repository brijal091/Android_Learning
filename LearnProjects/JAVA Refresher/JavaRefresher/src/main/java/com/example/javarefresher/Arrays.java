package com.example.javarefresher;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int brijal[] = {1,2,3,4,5};
        System.out.println(brijal);
        System.out.println(brijal[0]);
//        outof range
//        System.out.println(brijal[15]);

//        array mehtods
//        We can go to the official java website

//        About Resizable arrays  -----------> Java Collection Framework --------> Using library n all
//        Aboyt Array List and accessing array list

        ArrayList p = new ArrayList();
        p.add(3);
        p.add("I Brij");
        p.add(23);

//        Note the Syntax Here and Note that we have + here insted of ,
        for (Object o : p){
            System.out.println("object is: " + o);
        }


    }
}
