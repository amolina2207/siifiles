package com.ak.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by amolina on 19/05/17.
 */

@Entity(name = "Ctlsii")
@Table(name="CTLSII")
public class CtlsiiBean implements Serializable {

    @EmbeddedId
    private CtlsiiKey id;

    @Column(name = "CTLRUT")
    private String ctlrut;

    @Column(name = "CTLUSE")
    private String ctluse;

    @Column(name = "CTLFCR")
    private java.sql.Date ctlfcr;

    @Column(name = "CTLHCR")
    private java.sql.Time ctlhcr;

    public CtlsiiKey getId() {
        return id;
    }

    public void setId(CtlsiiKey id) {
        this.id = id;
    }

    public String getCtlrut() {
        return ctlrut;
    }

    public void setCtlrut(String ctlrut) {
        this.ctlrut = ctlrut;
    }

    public String getCtluse() {
        return ctluse;
    }

    public void setCtluse(String ctluse) {
        this.ctluse = ctluse;
    }

    public Date getCtlfcr() {
        return ctlfcr;
    }

    public void setCtlfcr(Date ctlfcr) {
        this.ctlfcr = ctlfcr;
    }

    public void setCtlfcr() {
        setCtlfcr(new java.sql.Date(new java.util.Date().getTime()));
    }

    public Time getCtlhcr() {
        return ctlhcr;
    }

    public void setCtlhcr(Time ctlhcr) {
        this.ctlhcr = ctlhcr;
    }

    public void setCtlhcr() {
        setCtlhcr(new java.sql.Time(new java.util.Date().getTime()));
    }
}