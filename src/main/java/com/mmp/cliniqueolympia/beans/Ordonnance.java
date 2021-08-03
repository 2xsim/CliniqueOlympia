
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Ordonnance {
    private String id_ordonnance;
    private String id_medecin;
    private String id_admission;
    private String date;
    private String note_prescription ;

    public String getId_ordonnance() {
        return id_ordonnance;
    }

    public void setId_ordonnance(String id_ordonnance) {
        this.id_ordonnance = id_ordonnance;
    }

    public String getId_medecin() {
        return id_medecin;
    }

    public void setId_medecin(String id_medecin) {
        this.id_medecin = id_medecin;
    }

    public String getId_admission() {
        return id_admission;
    }

    public void setId_admission(String id_admission) {
        this.id_admission = id_admission;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote_prescription() {
        return note_prescription;
    }

    public void setNote_prescription(String note_prescription) {
        this.note_prescription = note_prescription;
    }
    
    
}
