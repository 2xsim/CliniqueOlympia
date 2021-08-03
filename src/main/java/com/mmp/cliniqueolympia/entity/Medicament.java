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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "medicament")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicament.findAll", query = "SELECT m FROM Medicament m")
    , @NamedQuery(name = "Medicament.findByIdMedicament", query = "SELECT m FROM Medicament m WHERE m.idMedicament = :idMedicament")
    , @NamedQuery(name = "Medicament.findByIntitule", query = "SELECT m FROM Medicament m WHERE m.intitule = :intitule")
    , @NamedQuery(name = "Medicament.findByTypeMedicament", query = "SELECT m FROM Medicament m WHERE m.typeMedicament = :typeMedicament")})
public class Medicament implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medicament")
    private Integer idMedicament;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "intitule")
    private String intitule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "type_medicament")
    private String typeMedicament;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedicament")
    private Set<CompoOrdonnance> compoOrdonnanceSet;

    public Medicament() {
    }

    public Medicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public Medicament(Integer idMedicament, String intitule, String typeMedicament) {
        this.idMedicament = idMedicament;
        this.intitule = intitule;
        this.typeMedicament = typeMedicament;
    }

    public Integer getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getTypeMedicament() {
        return typeMedicament;
    }

    public void setTypeMedicament(String typeMedicament) {
        this.typeMedicament = typeMedicament;
    }

    @XmlTransient
    public Set<CompoOrdonnance> getCompoOrdonnanceSet() {
        return compoOrdonnanceSet;
    }

    public void setCompoOrdonnanceSet(Set<CompoOrdonnance> compoOrdonnanceSet) {
        this.compoOrdonnanceSet = compoOrdonnanceSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicament != null ? idMedicament.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicament)) {
            return false;
        }
        Medicament other = (Medicament) object;
        if ((this.idMedicament == null && other.idMedicament != null) || (this.idMedicament != null && !this.idMedicament.equals(other.idMedicament))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Medicament[ idMedicament=" + idMedicament + " ]";
    }
    
}
