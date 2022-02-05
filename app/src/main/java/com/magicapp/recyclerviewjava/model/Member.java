package com.magicapp.recyclerviewjava.model;

public class Member {
    int profile;
    String fullname;

    public Member(int profile, String fullname) {
        this.profile = profile;
        this.fullname = fullname;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    @Override
    public String toString() {
        return "Member{" +
                "profile=" + profile +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
