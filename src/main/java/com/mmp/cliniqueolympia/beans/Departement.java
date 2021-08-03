
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Departement {
    private String id_departement ;
    private String libelle ;
    private int prix ;

    public String getId_departement() {
        return id_departement;
    }

    public void setId_departement(String id_departement) {
        this.id_departement = id_departement;
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
    
    
}
