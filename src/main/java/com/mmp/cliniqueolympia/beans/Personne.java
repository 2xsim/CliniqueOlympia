package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Personne {
    private String nom;
    private String prenoms ;
    private char sexe ;
    private String date_naissance;
    private String groupe_sanguin ;
    private String photo;
    private String numero_telephone ;
    private String adresse_mail;
    private String adresse_domicile;
    
    private String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
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

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getGroupe_sanguin() {
        return groupe_sanguin;
    }

    public void setGroupe_sanguin(String groupe_sanguin) {
        this.groupe_sanguin = groupe_sanguin;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNumero_telephone() {
        return numero_telephone;
    }

    public void setNumero_telephone(String numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public String getAdresse_mail() {
        return adresse_mail;
    }

    public void setAdresse_mail(String adresse_mail) {
        this.adresse_mail = adresse_mail;
    }

    public String getAdresse_domicile() {
        return adresse_domicile;
    }

    public void setAdresse_domicile(String adresse_domicile) {
        this.adresse_domicile = adresse_domicile;
    }
}
