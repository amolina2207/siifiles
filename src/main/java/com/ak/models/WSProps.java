package com.ak.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "wsprops")
public class WSProps {

	private String pathCert; 
	private String typeCert;
	private String passCert;
	private String endpointEmitidas;
	private String endpointRecibidas;
	
	public String getPathCert() {
		return pathCert;
	}
	public void setPathCert(String pathCert) {
		this.pathCert = pathCert;
	}
	public String getTypeCert() {
		return typeCert;
	}
	public void setTypeCert(String typeCert) {
		this.typeCert = typeCert;
	}
	public String getPassCert() {
		return passCert;
	}
	public void setPassCert(String passCert) {
		this.passCert = passCert;
	}
	public String getEndpointEmitidas() {
		return endpointEmitidas;
	}
	public void setEndpointEmitidas(String endpointEmitidas) {
		this.endpointEmitidas = endpointEmitidas;
	}
	public String getEndpointRecibidas() {
		return endpointRecibidas;
	}
	public void setEndpointRecibidas(String endpointRecibidas) {
		this.endpointRecibidas = endpointRecibidas;
	}
}