package com.example.kazgidro.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "db")
public class DbEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "station")
    private String station;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Integer time;

    @Column(name = "lvl")
    private byte[] lvl;

    @Column(name = "high")
    private byte[] high;

    @Column(name = "dirper")
    private String dirper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public byte[] getLvl() {
        return lvl;
    }

    public void setLvl(byte[] lvl) {
        this.lvl = lvl;
    }

    public byte[] getHigh() {
        return high;
    }

    public void setHigh(byte[] high) {
        this.high = high;
    }

    public String getDirper() {
        return dirper;
    }

    public void setDirper(String dirper) {
        this.dirper = dirper;
    }

    @Override
    public String toString() {
        return "DbEntity{" +
                "id=" + id +
                ", station='" + station + '\'' +
                ", date=" + date +
                ", lvl='" + lvl + '\'' +
                ", high='" + high + '\'' +
                ", dirper='" + dirper + '\'' +
                '}';
    }
}
