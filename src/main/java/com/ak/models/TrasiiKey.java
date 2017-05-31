package com.ak.models;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by amolina on 22/05/17.
 */
public class TrasiiKey implements Serializable{

    @Column(name = "COMPAAK")
    private String compaak;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "EJERCIO")
    private BigDecimal ejercio;
    @Column(name = "PERIODO")
    private String periodo;
    @Column(name = "EMINIF")
    private String eminif;
    @Column(name = "FACNUM")
    private String facnum;
    @Column(name = "FACFEC")
    private String facfec;
    @Column(name = "FACTER")
    private String facter;

    public String getCompaak() {
        return compaak;
    }

    public void setCompaak(String compaak) {
        this.compaak = compaak;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public BigDecimal getEjercio() {
        return ejercio;
    }

    public void setEjercio(BigDecimal ejercio) {
        this.ejercio = ejercio;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEminif() {
        return eminif;
    }

    public void setEminif(String eminif) {
        this.eminif = eminif;
    }

    public String getFacnum() {
        return facnum;
    }

    public void setFacnum(String facnum) {
        this.facnum = facnum;
    }

    public String getFacfec() {
        return facfec;
    }

    public void setFacfec(String facfec) {
        this.facfec = facfec;
    }

    public String getFacter() {
        return facter;
    }

    public void setFacter(String facter) {
        this.facter = facter;
    }
}
