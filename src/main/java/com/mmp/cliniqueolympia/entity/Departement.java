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
@Table(name = "departement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departement.findAll", query = "SELECT d FROM Departement d")
    , @NamedQuery(name = "Departement.findByIdDepartement", query = "SELECT d FROM Departement d WHERE d.idDepartement = :idDepartement")
    , @NamedQuery(name = "Departement.findByLibelle", query = "SELECT d FROM Departement d WHERE d.libelle = :libelle")
    , @NamedQuery(name = "Departement.findByPrix", query = "SELECT d FROM Departement d WHERE d.prix = :prix")})
public class Departement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departement")
    private Integer idDepartement;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix")
    private int prix;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartement")
    private Set<Admission> admissionSet;
    @OneToMany(mappedBy = "idDepartement")
    private Set<Medecin> medecinSet;

    public Departement() {
    }

    public Departement(Integer idDepartement) {
        this.idDepartement = idDepartement;
    }

    public Departement(Integer idDepartement, String libelle, int prix) {
        this.idDepartement = idDepartement;
        this.libelle = libelle;
        this.prix = prix;
    }

    public Integer getIdDepartement() {
        return idDepartement;
    }

    public void setIdDepartement(Integer idDepartement) {
        this.idDepartement = idDepartement;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @XmlTransient
    public Set<Admission> getAdmissionSet() {
        return admissionSet;
    }

    public void setAdmissionSet(Set<Admission> admissionSet) {
        this.admissionSet = admissionSet;
    }

    @XmlTransient
    public Set<Medecin> getMedecinSet() {
        return medecinSet;
    }

    public void setMedecinSet(Set<Medecin> medecinSet) {
        this.medecinSet = medecinSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartement != null ? idDepartement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.idDepartement == null && other.idDepartement != null) || (this.idDepartement != null && !this.idDepartement.equals(other.idDepartement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Departement[ idDepartement=" + idDepartement + " ]";
    }
    
}
