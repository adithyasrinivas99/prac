package com.example.prac;

import javax.persistence.*;
import javax.print.DocFlavor;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="entity")
public class entity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column()
    @NotNull()
    private int tid;
    @Column()
    private String tname;
    @Column()
    private String mobileNumber;
    @Column()
    private String subject;
    public entity(String tname, String mobileNumber,String subject){
        this.tname=tname;
        this.mobileNumber=mobileNumber;
        this.subject=subject;
    }
    public entity(){

    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getSubject() {
        return subject;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
