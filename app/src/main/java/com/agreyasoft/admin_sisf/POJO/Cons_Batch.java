package com.agreyasoft.admin_sisf.POJO;

public class Cons_Batch {
    boolean batch_status;
    String batch_name;
    String batch_total_student;
    String batch_time;
    String batch_subject_name;
    String batch_tutor_name;

    public Cons_Batch(boolean batch_status, String batch_name, String batch_total_student, String batch_time, String batch_subject_name, String batch_tutor_name) {
        this.batch_status = batch_status;
        this.batch_name = batch_name;
        this.batch_total_student = batch_total_student;
        this.batch_time = batch_time;
        this.batch_subject_name = batch_subject_name;
        this.batch_tutor_name = batch_tutor_name;
    }


    public boolean isBatch_status() {
        return batch_status;
    }

    public void setBatch_status(boolean batch_status) {
        this.batch_status = batch_status;
    }

    public String getBatch_name() {
        return batch_name;
    }

    public void setBatch_name(String batch_name) {
        this.batch_name = batch_name;
    }

    public String getBatch_total_student() {
        return batch_total_student;
    }

    public void setBatch_total_student(String batch_total_student) {
        this.batch_total_student = batch_total_student;
    }

    public String getBatch_time() {
        return batch_time;
    }

    public void setBatch_time(String batch_time) {
        this.batch_time = batch_time;
    }

    public String getBatch_subject_name() {
        return batch_subject_name;
    }

    public void setBatch_subject_name(String batch_subject_name) {
        this.batch_subject_name = batch_subject_name;
    }

    public String getBatch_tutor_name() {
        return batch_tutor_name;
    }

    public void setBatch_tutor_name(String batch_tutor_name) {
        this.batch_tutor_name = batch_tutor_name;
    }
}
