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
@Table(name = "rdv")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rdv.findAll", query = "SELECT r FROM Rdv r")
    , @NamedQuery(name = "Rdv.findByIdRdv", query = "SELECT r FROM Rdv r WHERE r.idRdv = :idRdv")
    , @NamedQuery(name = "Rdv.findByDatePriseRdv", query = "SELECT r FROM Rdv r WHERE r.datePriseRdv = :datePriseRdv")
    , @NamedQuery(name = "Rdv.findByDateRdv", query = "SELECT r FROM Rdv r WHERE r.dateRdv = :dateRdv")
    , @NamedQuery(name = "Rdv.findByHeureRdv", query = "SELECT r FROM Rdv r WHERE r.heureRdv = :heureRdv")})
public class Rdv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rdv")
    private Integer idRdv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_prise_rdv")
    @Temporal(TemporalType.DATE)
    private Date datePriseRdv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_rdv")
    @Temporal(TemporalType.DATE)
    private Date dateRdv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_rdv")
    @Temporal(TemporalType.TIME)
    private Date heureRdv;
    @JoinColumn(name = "id_admission", referencedColumnName = "id_admission")
    @ManyToOne(optional = false)
    private Admission idAdmission;

    public Rdv() {
    }

    public Rdv(Integer idRdv) {
        this.idRdv = idRdv;
    }

    public Rdv(Integer idRdv, Date datePriseRdv, Date dateRdv, Date heureRdv) {
        this.idRdv = idRdv;
        this.datePriseRdv = datePriseRdv;
        this.dateRdv = dateRdv;
        this.heureRdv = heureRdv;
    }

    public Integer getIdRdv() {
        return idRdv;
    }

    public void setIdRdv(Integer idRdv) {
        this.idRdv = idRdv;
    }

    public Date getDatePriseRdv() {
        return datePriseRdv;
    }

    public void setDatePriseRdv(Date datePriseRdv) {
        this.datePriseRdv = datePriseRdv;
    }

    public Date getDateRdv() {
        return dateRdv;
    }

    public void setDateRdv(Date dateRdv) {
        this.dateRdv = dateRdv;
    }

    public Date getHeureRdv() {
        return heureRdv;
    }

    public void setHeureRdv(Date heureRdv) {
        this.heureRdv = heureRdv;
    }

    public Admission getIdAdmission() {
        return idAdmission;
    }

    public void setIdAdmission(Admission idAdmission) {
        this.idAdmission = idAdmission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRdv != null ? idRdv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rdv)) {
            return false;
        }
        Rdv other = (Rdv) object;
        if ((this.idRdv == null && other.idRdv != null) || (this.idRdv != null && !this.idRdv.equals(other.idRdv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Rdv[ idRdv=" + idRdv + " ]";
    }
    
}
