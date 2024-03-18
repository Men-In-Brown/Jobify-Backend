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
    public String getUser2() { 
        return user2; 
    }
    public void setUser2(String user2) { 
        this.user2 = user2; 
    }
    public String getUser3() { 
        return user3; 
    }
    public void setUser3(String user3) { 
        this.user3 = user3; 
    }
    public String getUser4() { 
        return user4; 
    }
    public void setUser4(String user4) { 
        this.user4 = user4; 
    }
    public String getUser5() { 
        return user5; 
    }
    public void setUser5(String user5) { 
        this.user5 = user5; 
    }
    public String getUser6() { 
        return user6; 
    }
    public void setUser6(String user6) { 
        this.user6 = user6; 
    }
    public String getUser7() { 
        return user7; 
    }
    public void setUser7(String user7) { 
        this.user7 = user7; 
    }
    public String getUser8() { 
        return user8; 
    }
    public void setUser8(String user8) { 
        this.user8 = user8; 
    }
    public String getUser9() { 
        return user9; 
    }
    public void setUser9(String user9) { 
        this.user9 = user9; 
    }
    public String getUser10() { 
        return user10; 
    }
    public void setUser10(String user10) { 
        this.user10 = user10; 
    }
    public String getUser11() { 
        return user11; 
    }
    public void setUser11(String user11) { 
        this.user11 = user11; 
    }
    public String getUser12() { 
        return user12; 
    }
    public void setUser12(String user12) { 
        this.user12 = user12; 
    }
    public String getUser13() { 
        return user13; 
    }
    public void setUser13(String user13) { 
        this.user13 = user13; 
    }
    public String getUser14() { 
        return user14; 
    }
    public void setUser14(String user14) { 
        this.user14 = user14; 
    }
    public String getUser15() { 
        return user15; 
    }
    public void setUser15(String user15) { 
        this.user15 = user15; 
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
        // obtain Group from initializer
        Group channels[] = init();

        // iterate using "enhanced for loop"
        for( Group channel : channels) {
            System.out.println(channel);  // print object
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, groupname, desc, creator, user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15);
    }
}