package com.akhil;

import com.akhil.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 10;
        int b = 20;
        int c = 30;
        long l = 30;
    	Student akhil = new Student(101,"Akhil");
    	System.out.println("Student Details: "+akhil.getSid()+" "+akhil.getSname());
    }
}
