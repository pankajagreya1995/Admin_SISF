package com.agreyasoft.admin_sisf.POJO;

import java.util.ArrayList;

public class Course_Info {
    private String name;
    private ArrayList<Subject_Info> list = new ArrayList<Subject_Info>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Subject_Info> getList() {
        return list;
    }

    public void setList(ArrayList<Subject_Info> list) {
        this.list = list;
    }
}
