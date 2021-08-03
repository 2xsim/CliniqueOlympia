package com.mmp.cliniqueolympia.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "patient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p")
    , @NamedQuery(name = "Patient.findByIdPatient", query = "SELECT p FROM Patient p WHERE p.idPatient = :idPatient")
    , @NamedQuery(name = "Patient.findByMatricule", query = "SELECT p FROM Patient p WHERE p.matricule = :matricule")
    , @NamedQuery(name = "Patient.findByDateInscription", query = "SELECT p FROM Patient p WHERE p.dateInscription = :dateInscription")
    , @NamedQuery(name = "Patient.findByHeureInscription", query = "SELECT p FROM Patient p WHERE p.heureInscription = :heureInscription")})
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_patient")
    private Integer idPatient;
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricule")
    private int matricule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_inscription")
    @Temporal(TemporalType.DATE)
    private Date dateInscription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_inscription")
    @Temporal(TemporalType.TIME)
    private Date heureInscription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPatient")
    private Set<Facture> factureSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPatient")
    private Set<Admission> admissionSet;

    public Patient() {
    }

    public Patient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Patient(Integer idPatient, int matricule, Date dateInscription, Date heureInscription) {
        this.idPatient = idPatient;
        this.matricule = matricule;
        this.dateInscription = dateInscription;
        this.heureInscription = heureInscription;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getHeureInscription() {
        return heureInscription;
    }

    public void setHeureInscription(Date heureInscription) {
        this.heureInscription = heureInscription;
    }

    @XmlTransient
    public Set<Facture> getFactureSet() {
        return factureSet;
    }

    public void setFactureSet(Set<Facture> factureSet) {
        this.factureSet = factureSet;
    }

    @XmlTransient
    public Set<Admission> getAdmissionSet() {
        return admissionSet;
    }

    public void setAdmissionSet(Set<Admission> admissionSet) {
        this.admissionSet = admissionSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPatient != null ? idPatient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.idPatient == null && other.idPatient != null) || (this.idPatient != null && !this.idPatient.equals(other.idPatient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Patient[ idPatient=" + idPatient + " ]";
    }
    
}
