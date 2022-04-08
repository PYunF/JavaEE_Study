package com.itheima.map;

import java.util.Objects;

/**
 * @author Snoopy
 * @date 2022-04-06  15:12
 */
public class Student {
    private String name;
    private int IDCard;
    private int score;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int IDCard, int score) {
        this.name = name;
        this.IDCard = IDCard;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getIDCard() == student.getIDCard() &&
                getScore() == student.getScore() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIDCard(), getScore());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDCard=" + IDCard +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIDCard() {
        return IDCard;
    }

    public void setIDCard(int IDCard) {
        this.IDCard = IDCard;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
