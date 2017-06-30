package com.ak.models;

public class ResultFactura {
	
	private String idFactura = "";
	private String errorCode = "";
	private String errorDesc = "";
	private String estadoRegistro = "";
	private String csv = "";
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((csv == null) ? 0 : csv.hashCode());
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result + ((errorDesc == null) ? 0 : errorDesc.hashCode());
		result = prime * result + ((estadoRegistro == null) ? 0 : estadoRegistro.hashCode());
		result = prime * result + ((idFactura == null) ? 0 : idFactura.hashCode());
		return result;
	}
	
	
	
	@Override
	public String toString() {
		return "ResultFactura [idFactura=" + idFactura + ", errorCode=" + errorCode + ", errorDesc=" + errorDesc
				+ ", estadoRegistro=" + estadoRegistro + ", csv=" + csv + "]";
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultFactura other = (ResultFactura) obj;
		if (csv == null) {
			if (other.csv != null)
				return false;
		} else if (!csv.equals(other.csv))
			return false;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		if (errorDesc == null) {
			if (other.errorDesc != null)
				return false;
		} else if (!errorDesc.equals(other.errorDesc))
			return false;
		if (estadoRegistro == null) {
			if (other.estadoRegistro != null)
				return false;
		} else if (!estadoRegistro.equals(other.estadoRegistro))
			return false;
		if (idFactura == null) {
			if (other.idFactura != null)
				return false;
		} else if (!idFactura.equals(other.idFactura))
			return false;
		return true;
	}
	
	public String getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	public String getEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(String estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	public String getCsv() {
		return csv;
	}
	public void setCsv(String csv) {
		this.csv = csv;
	}
}