package com.example.demo.prelekcje;

import com.example.demo.models.Lectures;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class LectureReader {
    @Value("${lecture_java_1}")
    private String lecture_java_1;

    @Value("${lecture_web_1}")
    private String lecture_web_1;

    @Value("${lecture_frontend_1}")
    private String lecture_frontend_1;

    @Value("${lecture_java_2}")
    private String lecture_java_2;

    @Value("${lecture_web_2}")
    private String lecture_web_2;

    @Value("${lecture_frontend_2}")
    private String lecture_frontend_2;

    @Value("${lecture_java_3}")
    private String lecture_java_3;

    @Value("${lecture_web_3}")
    private String lecture_web_3;

    @Value("${lecture_frontend_3}")
    private String lecture_frontend_3;

    @Value("${lecture_java_4}")
    private String lecture_java_4;

    @Value("${lecture_web_4}")
    private String lecture_web_4;

    @Value("${lecture_frontend_4}")
    private String lecture_frontend_4;


    @EventListener(ApplicationReadyEvent.class)
    public void addPrelections() {

        Lectures lectures1 = new Lectures(lecture_java_1,lecture_web_1, lecture_frontend_1);
        Lectures lectures2 = new Lectures(lecture_java_2, lecture_web_2, lecture_frontend_2);
        Lectures lectures3 = new Lectures(lecture_java_3, lecture_web_3, lecture_frontend_3);
        Lectures lectures4 = new Lectures(lecture_java_4, lecture_web_4, lecture_frontend_4);



    }
}
