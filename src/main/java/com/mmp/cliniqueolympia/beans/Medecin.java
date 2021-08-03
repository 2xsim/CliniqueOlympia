
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Medecin {
    private String id_medecin ;
    private String matricule ;
    private String id_departement ;

    public String getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(String id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getId_departement() {
        return id_departement;
    }

    public void setId_departement(String id_departement) {
        this.id_departement = id_departement;
    }
    
    
}
