package com.example.chiragshenoy.fbeg;

/**
 * Created by chiragshenoy on 22/09/16.
 */


public class Topic {
    private Boolean active;

    private Long id;

    private String name;

    private Integer subject_id;

    private String url;

    public Topic() {

    }

    /**
     * @return The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return The id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The subject_id
     */
    public Integer getSubject_id() {
        return subject_id;
    }

    /**
     * @param subject_id The subject_id
     */
    public void setSubject_id(Integer subject_id) {
        this.subject_id = subject_id;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}