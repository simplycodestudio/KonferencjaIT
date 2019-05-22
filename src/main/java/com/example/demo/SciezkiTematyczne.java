package com.example.demo;

public class SciezkiTematyczne {

    private String id;
   private String java;
   private String web;
    private String frontend;


    public SciezkiTematyczne(String id, String java, String web, String frontend) {
        this.id = id;
        this.java = java;
        this.web = web;
        this.frontend = frontend;

    }

    public String getJava() {
        return java;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFrontend() {
        return frontend;
    }

    public void setFrontend(String frontend) {
        this.frontend = frontend;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }
}
