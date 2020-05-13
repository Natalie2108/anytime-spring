package com.example.anytime.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.*;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String remark;

    @ManyToOne
    User user;

    @ManyToOne
    Allevent allevent;



    public Event(int id, User user, Allevent allevent, String remark) {
        this.id = id;
        this.user = user;
        this.allevent = allevent;
        this.remark = remark;
    }

    public Event() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Allevent getAllevent() {
        return allevent;
    }

    public void setAllevent(Allevent allevent) {
        this.allevent = allevent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "[Event: " +
                "[" + "id: " + id +
                ", " + "remark: " + remark +
                ", " + "allevent: " + allevent +
                ", " + "user: " + user + "]";
    }
}
