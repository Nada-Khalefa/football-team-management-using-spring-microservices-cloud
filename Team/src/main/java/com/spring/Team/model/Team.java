package com.spring.Team.model;

public class Team {

     private long id;
     private String from;
     private String to;
     private int moneyTeam;

     private String note;
     private String numberTeam;

     private String port;

    public Team() {
    }

    public Team(long id, String from, String to, int moneyTeam, String note, String numberTeam) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.moneyTeam = moneyTeam;
        this.note = note;
        this.numberTeam = numberTeam;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getMoneyTeam() {
        return moneyTeam;
    }

    public void setMoneyTeam(int moneyTeam) {
        this.moneyTeam = moneyTeam;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNumberTeam() {
        return numberTeam;
    }

    public void setNumberTeam(String numberTeam) {
        this.numberTeam = numberTeam;
    }
}
