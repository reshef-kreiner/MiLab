package com.example.group_one_app;

public class VolunteerModel {


    String name;
    String tags;
    String vurl;

    VolunteerModel()
    {

    }

    public VolunteerModel(String name, String tags, String vurl) {

        this.name = name;
        this.tags = tags;
        this.vurl = vurl;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getVurl() {
        return vurl;
    }

    public void setVurl(String vurl) {
        this.vurl = vurl;
    }
}
