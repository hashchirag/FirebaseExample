package com.example.chiragshenoy.fbeg;

import java.util.ArrayList;
import java.util.List;

public class Subject {


    private Boolean active;
    private Long exam_id;
    private Long id;
    private String name;
    private List<Long> topic_ids = new ArrayList<Long>();
    private Boolean topic_same_as_subject;
    private String url;
    private Boolean use_chapters;


    public Subject() {

    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setExam_id(Long exam_id) {
        this.exam_id = exam_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTopic_ids(List<Long> topic_ids) {
        this.topic_ids = topic_ids;
    }

    public void setTopic_same_as_subject(Boolean topic_same_as_subject) {
        this.topic_same_as_subject = topic_same_as_subject;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUse_chapters(Boolean use_chapters) {
        this.use_chapters = use_chapters;
    }

    public Boolean getActive() {

        return active;
    }

    public Long getExam_id() {
        return exam_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Long> getTopic_ids() {
        return topic_ids;
    }

    public Boolean getTopic_same_as_subject() {
        return topic_same_as_subject;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getUse_chapters() {
        return use_chapters;
    }
}