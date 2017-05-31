package com.ak.models;

import javax.persistence.Column;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by amolina on 22/05/17.
 */
public class CtlsiiKey implements Serializable{

    @Column(name = "COMPAAK")
    private String compaak;
    @Column(name = "EMPRESA")
    private String empresa;
    @Column(name = "CTLPRO")
    private BigDecimal ctlpro;

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

    public BigDecimal getCtlpro() {
        return ctlpro;
    }

    public void setCtlpro(BigDecimal ctlpro) {
        this.ctlpro = ctlpro;
    }
}
