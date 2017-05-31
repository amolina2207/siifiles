package com.ak.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by amolina on 19/05/17.
 */

@Entity(name = "Trasii")
@Table(name="TRASII")
//@IdClass(TrasiiKey.class)
public class TrasiiBean implements Serializable {

    @EmbeddedId
    private TrasiiKey id;

    /*
    @Column(name = "COMPAAK")
    @Id private String compaak;

    @Column(name = "EMPRESA")
    @Id private String empresa;

    @Column(name = "EJERCIO")
    @Id private BigDecimal ejercio;

    @Column(name = "PERIODO")
    @Id private String periodo;

    @Column(name = "EMINIF")
    @Id private String eminif;

    @Column(name = "FACNUM")
    @Id private String facnum;

    @Column(name = "FACFEC")
    @Id private String facfec;

    @Column(name = "FACTER")
    @Id private String facter;
    */

    @Column(name = "EMPCIF")
    private String empcif;

    @Column(name = "EMPNOM")
    private String empnom;

    @Column(name = "REPCIF")
    private String repcif;

    @Column(name = "TIPOCOM")
    private String tipocom;

    @Column(name = "FACTIP")
    private String factip;

    @Column(name = "FACRTI")
    private String facrti;

    @Column(name = "FACRNU")
    private String facrnu;

    @Column(name = "FACRFE")
    private String facrfe;

    @Column(name = "FACRBA")
    private BigDecimal facrba;

    @Column(name = "FACRCU")
    private BigDecimal facrcu;

    @Column(name = "FACLAR")
    private String faclar;

    @Column(name = "FACTOT")
    private BigDecimal factot;

    @Column(name = "FACDES")
    private String facdes;

    @Column(name = "FACSITI")
    private BigDecimal facsiti;

    @Column(name = "FACREFI")
    private String facrefi;

    @Column(name = "FACNOM")
    private String facnom;

    @Column(name = "FACPAI")
    private String facpai;

    @Column(name = "FACNIF")
    private String facnif;

    @Column(name = "FACIDP")
    private String facidp;

    @Column(name = "FACIDC")
    private String facidc;

    @Column(name = "FACOPE")
    private String facope;

    @Column(name = "FACSUG")
    private String facsug;

    @Column(name = "FACEXE")
    private String facexe;

    @Column(name = "FACBAE")
    private BigDecimal facbae;

    @Column(name = "FACBA1")
    private BigDecimal facba1;

    @Column(name = "FACPI1")
    private BigDecimal facpi1;

    @Column(name = "FACIM1")
    private BigDecimal facim1;

    @Column(name = "FACPR1")
    private BigDecimal facpr1;

    @Column(name = "FACIR1")
    private BigDecimal facir1;

    @Column(name = "FACBA2")
    private BigDecimal facba2;

    @Column(name = "FACPI2")
    private BigDecimal facpi2;

    @Column(name = "FACIM2")
    private BigDecimal facim2;

    @Column(name = "FACPR2")
    private BigDecimal facpr2;

    @Column(name = "FACIR2")
    private BigDecimal facir2;

    @Column(name = "FACBA3")
    private BigDecimal facba3;

    @Column(name = "FACPI3")
    private BigDecimal facpi3;

    @Column(name = "FACIM3")
    private BigDecimal facim3;

    @Column(name = "FACPR3")
    private BigDecimal facpr3;

    @Column(name = "FACIR3")
    private BigDecimal facir3;

    @Column(name = "FACBA4")
    private BigDecimal facba4;

    @Column(name = "FACPI4")
    private BigDecimal facpi4;

    @Column(name = "FACIM4")
    private BigDecimal facim4;

    @Column(name = "FACPR4")
    private BigDecimal facpr4;

    @Column(name = "FACIR4")
    private BigDecimal facir4;

    @Column(name = "FACBA5")
    private BigDecimal facba5;

    @Column(name = "FACPI5")
    private BigDecimal facpi5;

    @Column(name = "FACIM5")
    private BigDecimal facim5;

    @Column(name = "FACPR5")
    private BigDecimal facpr5;

    @Column(name = "FACIR5")
    private BigDecimal facir5;

    @Column(name = "FACTNO")
    private String factno;

    @Column(name = "FACINO")
    private BigDecimal facino;

    @Column(name = "FACFRE")
    private String facfre;

    @Column(name = "FACDEC")
    private BigDecimal facdec;

    @Column(name = "FACOPA")
    private String facopa;

    @Column(name = "FACICP")
    private BigDecimal facicp;

    @Column(name = "FACFCP")
    private String facfcp;

    @Column(name = "FACMCP")
    private String facmcp;

    @Column(name = "EMIUSE")
    private String emiuse;

    @Column(name = "EMIFCR")
    private java.sql.Date emifcr;

    @Column(name = "EMIHCR")
    private java.sql.Time emihcr;

    @Column(name = "EMIPRO")
    private BigDecimal emipro;

    @Column(name = "EMIFTR")
    private java.sql.Date emiftr;

    @Column(name = "EMIHTR")
    private java.sql.Time emihtr;

    @Column(name = "RESFER")
    private java.sql.Date resfer;

    @Column(name = "reshor")
    private java.sql.Time reshor;

    @Column(name = "RESCSV")
    private String rescsv;

    @Column(name = "RESEMI")
    private String resemi;

    @Column(name = "RESFAC")
    private String resfac;

    @Column(name = "RESERR")
    private String reserr;

    @Column(name = "RESDES")
    private String resdes;


    public String getEmpcif() {
        return empcif;
    }

    public void setEmpcif(String empcif) {
        this.empcif = empcif;
    }

    public String getEmpnom() {
        return empnom;
    }

    public void setEmpnom(String empnom) {
        this.empnom = empnom;
    }

    public String getRepcif() {
        return repcif;
    }

    public void setRepcif(String repcif) {
        this.repcif = repcif;
    }

    public String getTipocom() {
        return tipocom;
    }

    public void setTipocom(String tipocom) {
        this.tipocom = tipocom;
    }


    public String getFactip() {
        return factip;
    }

    public void setFactip(String factip) {
        this.factip = factip;
    }


    public String getFacrti() {
        return facrti;
    }

    public void setFacrti(String facrti) {
        this.facrti = facrti;
    }

    public String getFacrnu() {
        return facrnu;
    }

    public void setFacrnu(String facrnu) {
        this.facrnu = facrnu;
    }

    public String getFacrfe() {
        return facrfe;
    }

    public void setFacrfe(String facrfe) {
        this.facrfe = facrfe;
    }

    public BigDecimal getFacrba() {
        return facrba;
    }

    public void setFacrba(BigDecimal facrba) {
        this.facrba = facrba;
    }

    public BigDecimal getFacrcu() {
        return facrcu;
    }

    public void setFacrcu(BigDecimal facrcu) {
        this.facrcu = facrcu;
    }

    public String getFaclar() {
        return faclar;
    }

    public void setFaclar(String faclar) {
        this.faclar = faclar;
    }

    public BigDecimal getFactot() {
        return factot;
    }

    public void setFactot(BigDecimal factot) {
        this.factot = factot;
    }

    public String getFacdes() {
        return facdes;
    }

    public void setFacdes(String facdes) {
        this.facdes = facdes;
    }

    public BigDecimal getFacsiti() {
        return facsiti;
    }

    public void setFacsiti(BigDecimal facsiti) {
        this.facsiti = facsiti;
    }

    public String getFacrefi() {
        return facrefi;
    }

    public void setFacrefi(String facrefi) {
        this.facrefi = facrefi;
    }

    public String getFacnom() {
        return facnom;
    }

    public void setFacnom(String facnom) {
        this.facnom = facnom;
    }

    public String getFacpai() {
        return facpai;
    }

    public void setFacpai(String facpai) {
        this.facpai = facpai;
    }

    public String getFacnif() {
        return facnif;
    }

    public void setFacnif(String facnif) {
        this.facnif = facnif;
    }

    public String getFacidp() {
        return facidp;
    }

    public void setFacidp(String facidp) {
        this.facidp = facidp;
    }

    public String getFacidc() {
        return facidc;
    }

    public void setFacidc(String facidc) {
        this.facidc = facidc;
    }

    public String getFacope() {
        return facope;
    }

    public void setFacope(String facope) {
        this.facope = facope;
    }

    public String getFacsug() {
        return facsug;
    }

    public void setFacsug(String facsug) {
        this.facsug = facsug;
    }

    public String getFacexe() {
        return facexe;
    }

    public void setFacexe(String facexe) {
        this.facexe = facexe;
    }

    public BigDecimal getFacbae() {
        return facbae;
    }

    public void setFacbae(BigDecimal facbae) {
        this.facbae = facbae;
    }

    public BigDecimal getFacba1() {
        return facba1;
    }

    public void setFacba1(BigDecimal facba1) {
        this.facba1 = facba1;
    }

    public BigDecimal getFacpi1() {
        return facpi1;
    }

    public void setFacpi1(BigDecimal facpi1) {
        this.facpi1 = facpi1;
    }

    public BigDecimal getFacim1() {
        return facim1;
    }

    public void setFacim1(BigDecimal facim1) {
        this.facim1 = facim1;
    }

    public BigDecimal getFacpr1() {
        return facpr1;
    }

    public void setFacpr1(BigDecimal facpr1) {
        this.facpr1 = facpr1;
    }

    public BigDecimal getFacir1() {
        return facir1;
    }

    public void setFacir1(BigDecimal facir1) {
        this.facir1 = facir1;
    }

    public BigDecimal getFacba2() {
        return facba2;
    }

    public void setFacba2(BigDecimal facba2) {
        this.facba2 = facba2;
    }

    public BigDecimal getFacpi2() {
        return facpi2;
    }

    public void setFacpi2(BigDecimal facpi2) {
        this.facpi2 = facpi2;
    }

    public BigDecimal getFacim2() {
        return facim2;
    }

    public void setFacim2(BigDecimal facim2) {
        this.facim2 = facim2;
    }

    public BigDecimal getFacpr2() {
        return facpr2;
    }

    public void setFacpr2(BigDecimal facpr2) {
        this.facpr2 = facpr2;
    }

    public BigDecimal getFacir2() {
        return facir2;
    }

    public void setFacir2(BigDecimal facir2) {
        this.facir2 = facir2;
    }

    public BigDecimal getFacba3() {
        return facba3;
    }

    public void setFacba3(BigDecimal facba3) {
        this.facba3 = facba3;
    }

    public BigDecimal getFacpi3() {
        return facpi3;
    }

    public void setFacpi3(BigDecimal facpi3) {
        this.facpi3 = facpi3;
    }

    public BigDecimal getFacim3() {
        return facim3;
    }

    public void setFacim3(BigDecimal facim3) {
        this.facim3 = facim3;
    }

    public BigDecimal getFacpr3() {
        return facpr3;
    }

    public void setFacpr3(BigDecimal facpr3) {
        this.facpr3 = facpr3;
    }

    public BigDecimal getFacir3() {
        return facir3;
    }

    public void setFacir3(BigDecimal facir3) {
        this.facir3 = facir3;
    }

    public BigDecimal getFacba4() {
        return facba4;
    }

    public void setFacba4(BigDecimal facba4) {
        this.facba4 = facba4;
    }

    public BigDecimal getFacpi4() {
        return facpi4;
    }

    public void setFacpi4(BigDecimal facpi4) {
        this.facpi4 = facpi4;
    }

    public BigDecimal getFacim4() {
        return facim4;
    }

    public void setFacim4(BigDecimal facim4) {
        this.facim4 = facim4;
    }

    public BigDecimal getFacpr4() {
        return facpr4;
    }

    public void setFacpr4(BigDecimal facpr4) {
        this.facpr4 = facpr4;
    }

    public BigDecimal getFacir4() {
        return facir4;
    }

    public void setFacir4(BigDecimal facir4) {
        this.facir4 = facir4;
    }

    public BigDecimal getFacba5() {
        return facba5;
    }

    public void setFacba5(BigDecimal facba5) {
        this.facba5 = facba5;
    }

    public BigDecimal getFacpi5() {
        return facpi5;
    }

    public void setFacpi5(BigDecimal facpi5) {
        this.facpi5 = facpi5;
    }

    public BigDecimal getFacim5() {
        return facim5;
    }

    public void setFacim5(BigDecimal facim5) {
        this.facim5 = facim5;
    }

    public BigDecimal getFacpr5() {
        return facpr5;
    }

    public void setFacpr5(BigDecimal facpr5) {
        this.facpr5 = facpr5;
    }

    public BigDecimal getFacir5() {
        return facir5;
    }

    public void setFacir5(BigDecimal facir5) {
        this.facir5 = facir5;
    }

    public String getFactno() {
        return factno;
    }

    public void setFactno(String factno) {
        this.factno = factno;
    }

    public BigDecimal getFacino() {
        return facino;
    }

    public void setFacino(BigDecimal facino) {
        this.facino = facino;
    }

    public String getFacfre() {
        return facfre;
    }

    public void setFacfre(String facfre) {
        this.facfre = facfre;
    }

    public BigDecimal getFacdec() {
        return facdec;
    }

    public void setFacdec(BigDecimal facdec) {
        this.facdec = facdec;
    }

    public String getFacopa() {
        return facopa;
    }

    public void setFacopa(String facopa) {
        this.facopa = facopa;
    }

    public BigDecimal getFacicp() {
        return facicp;
    }

    public void setFacicp(BigDecimal facicp) {
        this.facicp = facicp;
    }

    public String getFacfcp() {
        return facfcp;
    }

    public void setFacfcp(String facfcp) {
        this.facfcp = facfcp;
    }

    public String getFacmcp() {
        return facmcp;
    }

    public void setFacmcp(String facmcp) {
        this.facmcp = facmcp;
    }

    public String getEmiuse() {
        return emiuse;
    }

    public void setEmiuse(String emiuse) {
        this.emiuse = emiuse;
    }

    public Date getEmifcr() {
        return emifcr;
    }

    public void setEmifcr(Date emifcr) {
        this.emifcr = emifcr;
    }

    public Time getEmihcr() {
        return emihcr;
    }

    public void setEmihcr(Time emihcr) {
        this.emihcr = emihcr;
    }

    public BigDecimal getEmipro() {
        return emipro;
    }

    public void setEmipro(BigDecimal emipro) {
        this.emipro = emipro;
    }

    public Date getEmiftr() {
        return emiftr;
    }

    public void setEmiftr(Date emiftr) {
        this.emiftr = emiftr;
    }

    public Time getEmihtr() {
        return emihtr;
    }

    public void setEmihtr(Time emihtr) {
        this.emihtr = emihtr;
    }

    public Date getResfer() {
        return resfer;
    }

    public void setResfer(Date resfer) {
        this.resfer = resfer;
    }

    public Time getReshor() {
        return reshor;
    }

    public void setReshor(Time reshor) {
        this.reshor = reshor;
    }

    public String getRescsv() {
        return rescsv;
    }

    public void setRescsv(String rescsv) {
        this.rescsv = rescsv;
    }

    public String getResemi() {
        return resemi;
    }

    public void setResemi(String resemi) {
        this.resemi = resemi;
    }

    public String getResfac() {
        return resfac;
    }

    public void setResfac(String resfac) {
        this.resfac = resfac;
    }

    public String getReserr() {
        return reserr;
    }

    public void setReserr(String reserr) {
        this.reserr = reserr;
    }

    public String getResdes() {
        return resdes;
    }

    public void setResdes(String resdes) {
        this.resdes = resdes;
    }

    public TrasiiKey getId() {
        return id;
    }

    public void setId(TrasiiKey id) {
        this.id = id;
    }
}