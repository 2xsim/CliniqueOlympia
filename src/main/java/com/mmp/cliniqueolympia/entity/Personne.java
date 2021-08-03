package com.mmp.cliniqueolympia.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")
    , @NamedQuery(name = "Personne.findByMatricule", query = "SELECT p FROM Personne p WHERE p.matricule = :matricule")
    , @NamedQuery(name = "Personne.findByNom", query = "SELECT p FROM Personne p WHERE p.nom = :nom")
    , @NamedQuery(name = "Personne.findByPrenoms", query = "SELECT p FROM Personne p WHERE p.prenoms = :prenoms")
    , @NamedQuery(name = "Personne.findBySexe", query = "SELECT p FROM Personne p WHERE p.sexe = :sexe")
    , @NamedQuery(name = "Personne.findByDateNaissance", query = "SELECT p FROM Personne p WHERE p.dateNaissance = :dateNaissance")
    , @NamedQuery(name = "Personne.findByGroupeSanguin", query = "SELECT p FROM Personne p WHERE p.groupeSanguin = :groupeSanguin")
    , @NamedQuery(name = "Personne.findByPhoto", query = "SELECT p FROM Personne p WHERE p.photo = :photo")
    , @NamedQuery(name = "Personne.findByNumeroTelephone", query = "SELECT p FROM Personne p WHERE p.numeroTelephone = :numeroTelephone")
    , @NamedQuery(name = "Personne.findByAdresseMail", query = "SELECT p FROM Personne p WHERE p.adresseMail = :adresseMail")
    , @NamedQuery(name = "Personne.findByAdresseDomicile", query = "SELECT p FROM Personne p WHERE p.adresseDomicile = :adresseDomicile")})
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "matricule")
    private Integer matricule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "prenoms")
    private String prenoms;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sexe")
    private Character sexe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "groupe_sanguin")
    private String groupeSanguin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "photo")
    private String photo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "numero_telephone")
    private String numeroTelephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "adresse_mail")
    private String adresseMail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "adresse_domicile")
    private String adresseDomicile;

    public Personne() {
    }

    public Personne(Integer matricule) {
        this.matricule = matricule;
    }

    public Personne(Integer matricule, String nom, String prenoms, Character sexe, Date dateNaissance, String groupeSanguin, String photo, String numeroTelephone, String adresseMail, String adresseDomicile) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenoms = prenoms;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.groupeSanguin = groupeSanguin;
        this.photo = photo;
        this.numeroTelephone = numeroTelephone;
        this.adresseMail = adresseMail;
        this.adresseDomicile = adresseDomicile;
    }

    public Integer getMatricule() {
        return matricule;
    }

    public void setMatricule(Integer matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getAdresseDomicile() {
        return adresseDomicile;
    }

    public void setAdresseDomicile(String adresseDomicile) {
        this.adresseDomicile = adresseDomicile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricule != null ? matricule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.matricule == null && other.matricule != null) || (this.matricule != null && !this.matricule.equals(other.matricule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.Personne[ matricule=" + matricule + " ]";
    }
    
}
