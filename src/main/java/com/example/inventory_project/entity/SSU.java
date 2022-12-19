package com.example.inventory_project.entity;

import javax.persistence.*;

@Entity
public class SSU {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ssu_id")
    private long ssuId;
    @Column
    private String location;
    @Column
    private String ssu_name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
        private User user;

    /////////////////////// getter(), setter() ///////////////////////////////////////////
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSsu_name() {
        return ssu_name;
    }

    public void setSsu_name(String ssu_name) {
        this.ssu_name = ssu_name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
