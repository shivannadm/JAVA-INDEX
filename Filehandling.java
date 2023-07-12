// File details reading
package com.mycompany.shivanna;

import java.io.*;

import java.util.*;
public class Filehandling {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file to be checked: ");
        String fname = in.next();
        File fl = new File(fname);
        System.out.println(fl.exists()?"Yes":"no");
        System.out.println(fl.canRead()?"yeah":"no");
        System.out.println("File path is: ");
        System.out.println(fl.getAbsolutePath());
        System.out.println("Size is: "+fl.length());
        fl.setWritable(false);
        System.out.println(fl.canWrite()?"S":"no");
        int index = fname.lastIndexOf(".");
        
        if(index>0)
        {
            String type = fname.substring(index+1);
            System.out.println(type);
        }
        else{
            System.out.println("no type");
        }
    }
    
}

