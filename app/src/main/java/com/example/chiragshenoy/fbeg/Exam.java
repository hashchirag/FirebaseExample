package com.example.chiragshenoy.fbeg;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by chiragshenoy on 22/09/16.
 */

public class Exam implements Serializable {

    private Boolean active;

    private Boolean active_for_student;

    private Boolean active_for_tutor;

    private Boolean block_topic_selection;

    private String exam_link;

    private Long id;

    private String name;

    private Double pass_percentage;

    private String placeholder_name;

    private String handle;

    private ArrayList<Long> subject_ids;


    public Exam() {
    }


    public Boolean getBlock_topic_selection() {
        return block_topic_selection;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Long> getSubject_ids() {
        return subject_ids;
    }

    public Boolean getActive() {
        return active;
    }

    public Boolean getActive_for_student() {
        return active_for_student;
    }

    public Boolean getActive_for_tutor() {
        return active_for_tutor;
    }

    public Double getPass_percentage() {
        return pass_percentage;
    }

    public Long getId() {
        return id;
    }

    public String getExam_link() {
        return exam_link;
    }

    public String getHandle() {
        return handle;
    }

    public String getPlaceholder_name() {
        return placeholder_name;
    }

    public void setBlock_topic_selection(Boolean block_topic_selection) {
        this.block_topic_selection = block_topic_selection;
    }

    public void setSubject_ids(ArrayList<Long> subject_ids) {
        this.subject_ids = subject_ids;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setActive_for_student(Boolean active_for_student) {
        this.active_for_student = active_for_student;
    }

    public void setActive_for_tutor(Boolean active_for_tutor) {
        this.active_for_tutor = active_for_tutor;
    }

    public void setExam_link(String exam_link) {
        this.exam_link = exam_link;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass_percentage(Double pass_percentage) {
        this.pass_percentage = pass_percentage;
    }

    public void setPlaceholder_name(String placeholder_name) {
        this.placeholder_name = placeholder_name;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}