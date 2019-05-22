package com.example.demo.models;

public class Lectures {


    private String lecture_id;
    private String lecture_java;
    private String lecture_web;
    private String lecture_frontend;

    public Lectures(String lecture_java, String lecture_web, String lecture_frontend) {
        this.lecture_java = lecture_java;
        this.lecture_web = lecture_web;
        this.lecture_frontend = lecture_frontend;
    }



    public String getLecture_id() {
        return lecture_id;
    }

    public void setLecture_id(String lecture_id) {
        this.lecture_id = lecture_id;
    }

    public String getLecture_java() {
        return lecture_java;
    }

    public void setLecture_java(String lecture_java) {
        this.lecture_java = lecture_java;
    }

    public String getLecture_web() {
        return lecture_web;
    }

    public void setLecture_web(String lecture_web) {
        this.lecture_web = lecture_web;
    }

    public String getLecture_frontend() {
        return lecture_frontend;
    }

    public void setLecture_frontend(String lecture_frontend) {
        this.lecture_frontend = lecture_frontend;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                "lecture_id='" + lecture_id + '\'' +
                ", lecture_java='" + lecture_java + '\'' +
                ", lecture_web='" + lecture_web + '\'' +
                ", lecture_frontend='" + lecture_frontend + '\'' +
                '}';
    }
}
