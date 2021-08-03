package com.mmp.cliniqueolympia.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "facture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f")
    , @NamedQuery(name = "Facture.findByIdFacture", query = "SELECT f FROM Facture f WHERE f.idFacture = :idFacture")
    , @NamedQuery(name = "Facture.findByDateEmission", query = "SELECT f FROM Facture f WHERE f.dateEmission = :dateEmission")
    , @NamedQuery(name = "Facture.findByNetAPayer", query = "SELECT f FROM Facture f WHERE f.netAPayer = :netAPayer")})
public class Facture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_facture")
    private Integer idFacture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_emission")
    @Temporal(TemporalType.DATE)
    private Date dateEmission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "net_a_payer")
    private int netAPayer;
    @JoinColumn(name = "id_admission", referencedColumnName = "id_admission")
    @ManyToOne(optional = false)
    private Admission idAdmission;
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(optional = false)
    private Patient idPatient;

    public Facture() {
    }

    public Facture(Integer idFacture) {
        this.idFacture = idFacture;
    }

    public Facture(Integer idFacture, Date dateEmission, int netAPayer) {
        this.idFacture = idFacture;
        this.dateEmission = dateEmission;
        this.netAPayer = netAPayer;
    }

    public Integer getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Integer idFacture) {
        this.idFacture = idFacture;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public int getNetAPayer() {
        return netAPayer;
    }

    public void setNetAPayer(int netAPayer) {
        this.netAPayer = netAPayer;
    }

    public Admission getIdAdmission() {
        return idAdmission;
    }

    public void setIdAdmission(Admission idAdmission) {
        this.idAdmission = idAdmission;
    }

    public Patient getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Patient idPatient) {
        this.idPatient = idPatient;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacture != null ? idFacture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.idFacture == null && other.idFacture != null) || (this.idFacture != null && !this.idFacture.equals(other.idFacture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Facture[ idFacture=" + idFacture + " ]";
    }
    
}
