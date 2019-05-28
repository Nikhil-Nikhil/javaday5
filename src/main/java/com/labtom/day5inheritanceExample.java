package com.labtom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day5inheritanceExample {
    public static void main(String[] args){
        Students s1 = new Students();
        s1.setCoursename("Mobile application design and development");
         float marks[] ={65.0f,85.0f,92.0f,95.50f};
         s1.setMarks(marks);


         person p1= new person();
         p1.setPersonId(1);
         p1.setFirstname("Nikhil");
         p1.setLastname("Nikhil");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";

        try {
            Date s1BirthDate = sdf.parse(dateInString);
            s1.setBirthdate(s1BirthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Faculty f1 = new Faculty();

        SimpleDateFormat jdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String joiningdate = "31-08-1982 10:20:56";

        try {
            Date f1JoiningDate = jdf.parse(dateInString);
            f1.setJoiningdate(f1JoiningDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        
        }
    }
