package com.example.chiragshenoy.fbeg;

import java.util.HashMap;

/**
 * Created by chiragshenoy on 24/09/16.
 */

public class StudyLevel {

    public StudyLevel() {

    }


    public boolean active;
    public int default_exam_id;
    public String handle;
    public int id;
    public String name;
    private HashMap<String, Object> exam_ids;


    public int getId() {
        return id;
    }

    public HashMap<String, Object> getExam_ids() {
        return exam_ids;
    }

    public void setExam_ids(HashMap<String, Object> exam_ids) {
        this.exam_ids = exam_ids;
    }

    public int getDefault_exam_id() {
        return default_exam_id;
    }

    public String getHandle() {
        return handle;
    }

    public String getName() {
        return name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setDefault_exam_id(int default_exam_id) {
        this.default_exam_id = default_exam_id;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
