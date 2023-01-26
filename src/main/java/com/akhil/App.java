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
        Long l = 87678l;
    	Student akhil = new Student(101,"Akhil");
    	System.out.println("Student Details: "+akhil.getSid()+" "+akhil.getSname());
    }
}
