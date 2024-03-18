package com.nighthawk.spring_portfolio.mvc.group;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Group {

    @Id @GeneratedValue
    @Column(name = "channel_id")
    private Long Id;
    private String groupname;
    private String desc;
    private String creator;
    private String user1;
    private String user2;
    private String user3;
    private String user4;
    private String user5;
    private String user6;
    private String user7;
    private String user8;
    private String user9;
    private String user10;
    private String user11;
    private String user12;
    private String user13;
    private String user14;
    private String user15;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getGroupName() {
        return groupname;
    }

    public void setGroupName(String groupname) {
        this.groupname = groupname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreator() { 
        return creator; 
    }

    public void setCreator(String creator) { 
        this.creator = creator; 
    }

    public String getUser1() { 
        return user1; 
    }

    public void setUser1(String user1) { 
        this.user1 = user1; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group channel = (Group) o;
        return Objects.equals(Id, channel.Id) &&
                Objects.equals(groupname, channel.groupname) &&
                Objects.equals(desc, channel.desc) &&
                Objects.equals(creator, channel.creator);
    }

    public static Group[] init() {
        // basics of class construction
        Group c1 = new Group();
        c1.setGroupName("test channel");
        c1.setDesc("bruh why");
        c1.setCreator("landoooc");

        Group c2 = new Group();
        c2.setGroupName("INDICATORS");
        c2.setDesc("i luv indicators");
        c2.setCreator("Mortenses");

    Group channels[] = {c1, c2};
    return(channels);
    }
    public static void main(String[] args) {
        // obtain Person from initializer
        Group channels[] = init();

        // iterate using "enhanced for loop"
        for( Group channel : channels) {
            System.out.println(channel);  // print object
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, desc, creator);
    }
}