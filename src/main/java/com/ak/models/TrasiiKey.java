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

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compaak == null) ? 0 : compaak.hashCode());
		result = prime * result + ((ejercio == null) ? 0 : ejercio.hashCode());
		result = prime * result + ((eminif == null) ? 0 : eminif.hashCode());
		result = prime * result + ((empresa == null) ? 0 : empresa.hashCode());
		result = prime * result + ((facfec == null) ? 0 : facfec.hashCode());
		result = prime * result + ((facnum == null) ? 0 : facnum.hashCode());
		result = prime * result + ((facter == null) ? 0 : facter.hashCode());
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrasiiKey other = (TrasiiKey) obj;
		if (compaak == null) {
			if (other.compaak != null)
				return false;
		} else if (!compaak.equals(other.compaak))
			return false;
		if (ejercio == null) {
			if (other.ejercio != null)
				return false;
		} else if (!ejercio.equals(other.ejercio))
			return false;
		if (eminif == null) {
			if (other.eminif != null)
				return false;
		} else if (!eminif.equals(other.eminif))
			return false;
		if (empresa == null) {
			if (other.empresa != null)
				return false;
		} else if (!empresa.equals(other.empresa))
			return false;
		if (facfec == null) {
			if (other.facfec != null)
				return false;
		} else if (!facfec.equals(other.facfec))
			return false;
		if (facnum == null) {
			if (other.facnum != null)
				return false;
		} else if (!facnum.equals(other.facnum))
			return false;
		if (facter == null) {
			if (other.facter != null)
				return false;
		} else if (!facter.equals(other.facter))
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		return true;
	}

	
	
	@Override
	public String toString() {
		return "TrasiiKey [compaak=" + compaak + ", empresa=" + empresa + ", ejercio=" + ejercio + ", periodo="
				+ periodo + ", eminif=" + eminif + ", facnum=" + facnum + ", facfec=" + facfec + ", facter=" + facter
				+ "]";
	}

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
