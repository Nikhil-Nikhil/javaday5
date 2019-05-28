package com.labtom;

public class Students extends person{
    private String Coursename;
    private float marks[];
    private float Totalmarks;
    private float percentage;
    private String Result;

    public String getCoursename() {
        return Coursename;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalmarks() {
        return Totalmarks;
    }


    public float getPercentage() {
        return percentage;
    }


    public String getResult() {
        return Result;
    }


}
