package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Admission {
    private String id_admission ;
    private String date_debut ;
    private String heure_debut;
    private String id_patient ;
    private String id_departement ;
    private String date_fin ;
    private String heure_fin ;

    public String getId_admission() {
        return id_admission;
    }

    public void setId_admission(String id_admission) {
        this.id_admission = id_admission;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getId_departement() {
        return id_departement;
    }

    public void setId_departement(String id_departement) {
        this.id_departement = id_departement;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public String getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }
    
    
}
