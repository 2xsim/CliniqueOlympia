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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "admission")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admission.findAll", query = "SELECT a FROM Admission a")
    , @NamedQuery(name = "Admission.findByIdAdmission", query = "SELECT a FROM Admission a WHERE a.idAdmission = :idAdmission")
    , @NamedQuery(name = "Admission.findByDateDebut", query = "SELECT a FROM Admission a WHERE a.dateDebut = :dateDebut")
    , @NamedQuery(name = "Admission.findByHeureDebut", query = "SELECT a FROM Admission a WHERE a.heureDebut = :heureDebut")
    , @NamedQuery(name = "Admission.findByDateFin", query = "SELECT a FROM Admission a WHERE a.dateFin = :dateFin")
    , @NamedQuery(name = "Admission.findByHeureFin", query = "SELECT a FROM Admission a WHERE a.heureFin = :heureFin")})
public class Admission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_admission")
    private Integer idAdmission;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_debut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "heure_debut")
    private String heureDebut;
    @Column(name = "date_fin")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Column(name = "heure_fin")
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdmission")
    private Set<Rdv> rdvSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdmission")
    private Set<Ordonnance> ordonnanceSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAdmission")
    private Set<Facture> factureSet;
    @JoinColumn(name = "id_departement", referencedColumnName = "id_departement")
    @ManyToOne(optional = false)
    private Departement idDepartement;
    @JoinColumn(name = "id_patient", referencedColumnName = "id_patient")
    @ManyToOne(optional = false)
    private Patient idPatient;

    public Admission() {
    }

    public Admission(Integer idAdmission) {
        this.idAdmission = idAdmission;
    }

    public Admission(Integer idAdmission, Date dateDebut, String heureDebut) {
        this.idAdmission = idAdmission;
        this.dateDebut = dateDebut;
        this.heureDebut = heureDebut;
    }

    public Integer getIdAdmission() {
        return idAdmission;
    }

    public void setIdAdmission(Integer idAdmission) {
        this.idAdmission = idAdmission;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    @XmlTransient
    public Set<Rdv> getRdvSet() {
        return rdvSet;
    }

    public void setRdvSet(Set<Rdv> rdvSet) {
        this.rdvSet = rdvSet;
    }

    @XmlTransient
    public Set<Ordonnance> getOrdonnanceSet() {
        return ordonnanceSet;
    }

    public void setOrdonnanceSet(Set<Ordonnance> ordonnanceSet) {
        this.ordonnanceSet = ordonnanceSet;
    }

    @XmlTransient
    public Set<Facture> getFactureSet() {
        return factureSet;
    }

    public void setFactureSet(Set<Facture> factureSet) {
        this.factureSet = factureSet;
    }

    public Departement getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Departement idDepartement) {
        this.idDepartement = idDepartement;
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
        hash += (idAdmission != null ? idAdmission.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admission)) {
            return false;
        }
        Admission other = (Admission) object;
        if ((this.idAdmission == null && other.idAdmission != null) || (this.idAdmission != null && !this.idAdmission.equals(other.idAdmission))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Admission[ idAdmission=" + idAdmission + " ]";
    }
    
}
