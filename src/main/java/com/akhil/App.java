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
    	Student s = new Student(101,"Akhil");
    	System.out.println("Student Details: "+s.getSid()+" "+s.getSname());
    }
}
