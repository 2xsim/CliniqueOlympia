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
import javax.persistence.Lob;
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
@Table(name = "ordonnance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordonnance.findAll", query = "SELECT o FROM Ordonnance o")
    , @NamedQuery(name = "Ordonnance.findByIdOrdonnance", query = "SELECT o FROM Ordonnance o WHERE o.idOrdonnance = :idOrdonnance")
    , @NamedQuery(name = "Ordonnance.findByDate", query = "SELECT o FROM Ordonnance o WHERE o.date = :date")})
public class Ordonnance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ordonnance")
    private Integer idOrdonnance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Lob
    @Size(max = 65535)
    @Column(name = "note_prescription")
    private String notePrescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdonnance")
    private Set<CompoOrdonnance> compoOrdonnanceSet;
    @JoinColumn(name = "id_admission", referencedColumnName = "id_admission")
    @ManyToOne(optional = false)
    private Admission idAdmission;
    @JoinColumn(name = "id_medecin", referencedColumnName = "id_medecin")
    @ManyToOne(optional = false)
    private Medecin idMedecin;

    public Ordonnance() {
    }

    public Ordonnance(Integer idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }

    public Ordonnance(Integer idOrdonnance, Date date) {
        this.idOrdonnance = idOrdonnance;
        this.date = date;
    }

    public Integer getIdOrdonnance() {
        return idOrdonnance;
    }

    public void setIdOrdonnance(Integer idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNotePrescription() {
        return notePrescription;
    }

    public void setNotePrescription(String notePrescription) {
        this.notePrescription = notePrescription;
    }

    @XmlTransient
    public Set<CompoOrdonnance> getCompoOrdonnanceSet() {
        return compoOrdonnanceSet;
    }

    public void setCompoOrdonnanceSet(Set<CompoOrdonnance> compoOrdonnanceSet) {
        this.compoOrdonnanceSet = compoOrdonnanceSet;
    }

    public Admission getIdAdmission() {
        return idAdmission;
    }

    public void setIdAdmission(Admission idAdmission) {
        this.idAdmission = idAdmission;
    }

    public Medecin getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Medecin idMedecin) {
        this.idMedecin = idMedecin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdonnance != null ? idOrdonnance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordonnance)) {
            return false;
        }
        Ordonnance other = (Ordonnance) object;
        if ((this.idOrdonnance == null && other.idOrdonnance != null) || (this.idOrdonnance != null && !this.idOrdonnance.equals(other.idOrdonnance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Ordonnance[ idOrdonnance=" + idOrdonnance + " ]";
    }
    
}
