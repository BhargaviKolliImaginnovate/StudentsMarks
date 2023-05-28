package Taskcom.example.StudentsMarks.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="marks")
public class Marks {
    @Id
    @Column(name="id")
    private  int id;

    @Column
    private String student_fname;


    @Column
    private String student_lname;
    @Column
    private int telugu;
    @Column
    private int hindi;
    @Column
    private int english;
    @Column
    private int maths;
    @Column
    private int science;
    @Column
    private int social;


    @Override
    public String toString() {
        return "Marks{" +
                "id=" + id +
                ", student_fname='" + student_fname + '\'' +
                ", student_lname='" + student_lname + '\'' +
                ", telugu='" + telugu + '\'' +
                ", hindi='" + hindi + '\'' +
                ", english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", science='" + science + '\'' +
                ", social='" + social + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Marks marks = (Marks) o;
        return id == marks.id && Objects.equals(student_fname, marks.student_fname) && Objects.equals(student_lname, marks.student_lname) && Objects.equals(telugu, marks.telugu) && Objects.equals(hindi, marks.hindi) && Objects.equals(english, marks.english) && Objects.equals(maths, marks.maths) && Objects.equals(science, marks.science) && Objects.equals(social, marks.social);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student_fname, student_lname, telugu, hindi, english, maths, science, social);
    }

    public int getSocial() {
        return social;
    }

    public void setSocial(int social) {
        this.social = social;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getTelugu() {
        return telugu;
    }

    public void setTelugu(int telugu) {
        this.telugu = telugu;
    }

    public String getStudent_lname() {
        return student_lname;
    }

    public void setStudent_lname(String student_lname) {
        this.student_lname = student_lname;
    }

    public String getStudent_fname() {
        return student_fname;
    }

    public void setStudent_fname(String student_fname) {
        this.student_fname = student_fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
