package com.mmp.cliniqueolympia.entity;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author steff
 */
@Entity
@Table(name = "compo_ordonnance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompoOrdonnance.findAll", query = "SELECT c FROM CompoOrdonnance c")
    , @NamedQuery(name = "CompoOrdonnance.findByIdCompoOrdonnance", query = "SELECT c FROM CompoOrdonnance c WHERE c.idCompoOrdonnance = :idCompoOrdonnance")
    , @NamedQuery(name = "CompoOrdonnance.findByDosePrescripte", query = "SELECT c FROM CompoOrdonnance c WHERE c.dosePrescripte = :dosePrescripte")})
public class CompoOrdonnance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_compo_ordonnance")
    private Integer idCompoOrdonnance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dose_prescripte")
    private int dosePrescripte;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "posologie")
    private String posologie;
    @JoinColumn(name = "id_medicament", referencedColumnName = "id_medicament")
    @ManyToOne(optional = false)
    private Medicament idMedicament;
    @JoinColumn(name = "id_ordonnance", referencedColumnName = "id_ordonnance")
    @ManyToOne(optional = false)
    private Ordonnance idOrdonnance;

    public CompoOrdonnance() {
    }

    public CompoOrdonnance(Integer idCompoOrdonnance) {
        this.idCompoOrdonnance = idCompoOrdonnance;
    }

    public CompoOrdonnance(Integer idCompoOrdonnance, int dosePrescripte, String posologie) {
        this.idCompoOrdonnance = idCompoOrdonnance;
        this.dosePrescripte = dosePrescripte;
        this.posologie = posologie;
    }

    public Integer getIdCompoOrdonnance() {
        return idCompoOrdonnance;
    }

    public void setIdCompoOrdonnance(Integer idCompoOrdonnance) {
        this.idCompoOrdonnance = idCompoOrdonnance;
    }

    public int getDosePrescripte() {
        return dosePrescripte;
    }

    public void setDosePrescripte(int dosePrescripte) {
        this.dosePrescripte = dosePrescripte;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public Medicament getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Medicament idMedicament) {
        this.idMedicament = idMedicament;
    }

    public Ordonnance getIdOrdonnance() {
        return idOrdonnance;
    }

    public void setIdOrdonnance(Ordonnance idOrdonnance) {
        this.idOrdonnance = idOrdonnance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompoOrdonnance != null ? idCompoOrdonnance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompoOrdonnance)) {
            return false;
        }
        CompoOrdonnance other = (CompoOrdonnance) object;
        if ((this.idCompoOrdonnance == null && other.idCompoOrdonnance != null) || (this.idCompoOrdonnance != null && !this.idCompoOrdonnance.equals(other.idCompoOrdonnance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mmp.cliniqueolympia.entity.CompoOrdonnance[ idCompoOrdonnance=" + idCompoOrdonnance + " ]";
    }
    
}
