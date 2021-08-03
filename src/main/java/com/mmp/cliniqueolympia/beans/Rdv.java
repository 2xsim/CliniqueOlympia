
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Rdv {
    private String id_rdv;
    private String date_prise_rdv ;
    private String date_rdv ;
    private String heure_rdv ;
    private String id_admission ;

    public String getId_rdv() {
        return id_rdv;
    }

    public void setId_rdv(String id_rdv) {
        this.id_rdv = id_rdv;
    }

    public String getDate_prise_rdv() {
        return date_prise_rdv;
    }

    public void setDate_prise_rdv(String date_prise_rdv) {
        this.date_prise_rdv = date_prise_rdv;
    }

    public String getDate_rdv() {
        return date_rdv;
    }

    public void setDate_rdv(String date_rdv) {
        this.date_rdv = date_rdv;
    }

    public String getHeure_rdv() {
        return heure_rdv;
    }

    public void setHeure_rdv(String heure_rdv) {
        this.heure_rdv = heure_rdv;
    }

    public String getId_admission() {
        return id_admission;
    }

    public void setId_admission(String id_admission) {
        this.id_admission = id_admission;
    }
    
    
}
