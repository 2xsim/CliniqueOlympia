package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Patient {
    private String id_patient ;
    private String matricule ;
    private String date_inscription ;
    private String heure_inscription ;

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(String date_inscription) {
        this.date_inscription = date_inscription;
    }

    public String getHeure_inscription() {
        return heure_inscription;
    }

    public void setHeure_inscription(String heure_inscription) {
        this.heure_inscription = heure_inscription;
    }
    
    
}
