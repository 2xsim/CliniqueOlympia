package com.mmp.cliniqueolympia.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "medecin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecin.findAll", query = "SELECT m FROM Medecin m")
    , @NamedQuery(name = "Medecin.findByIdMedecin", query = "SELECT m FROM Medecin m WHERE m.idMedecin = :idMedecin")
    , @NamedQuery(name = "Medecin.findByMatricule", query = "SELECT m FROM Medecin m WHERE m.matricule = :matricule")})
public class Medecin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medecin")
    private Integer idMedecin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "matricule")
    private int matricule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedecin")
    private Set<Ordonnance> ordonnanceSet;
    @JoinColumn(name = "id_departement", referencedColumnName = "id_departement")
    @ManyToOne
    private Departement idDepartement;

    public Medecin() {
    }

    public Medecin(Integer idMedecin) {
        this.idMedecin = idMedecin;
    }

    public Medecin(Integer idMedecin, int matricule) {
        this.idMedecin = idMedecin;
        this.matricule = matricule;
    }

    public Integer getIdMedecin() {
        return idMedecin;
    }

    public void setIdMedecin(Integer idMedecin) {
        this.idMedecin = idMedecin;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    @XmlTransient
    public Set<Ordonnance> getOrdonnanceSet() {
        return ordonnanceSet;
    }

    public void setOrdonnanceSet(Set<Ordonnance> ordonnanceSet) {
        this.ordonnanceSet = ordonnanceSet;
    }

    public Departement getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Departement idDepartement) {
        this.idDepartement = idDepartement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedecin != null ? idMedecin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecin)) {
            return false;
        }
        Medecin other = (Medecin) object;
        if ((this.idMedecin == null && other.idMedecin != null) || (this.idMedecin != null && !this.idMedecin.equals(other.idMedecin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Medecin[ idMedecin=" + idMedecin + " ]";
    }
    
}
