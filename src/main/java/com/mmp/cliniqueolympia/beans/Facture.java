
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Facture {
    private String id_facture ;
    private String date_emission ;
    private String id_patient ;
    private String id_admission ;
    private int net_a_payer ;

    public String getId_facture() {
        return id_facture;
    }

    public void setId_facture(String id_facture) {
        this.id_facture = id_facture;
    }

    public String getDate_emission() {
        return date_emission;
    }

    public void setDate_emission(String date_emission) {
        this.date_emission = date_emission;
    }

    public String getId_patient() {
        return id_patient;
    }

    public void setId_patient(String id_patient) {
        this.id_patient = id_patient;
    }

    public String getId_admission() {
        return id_admission;
    }

    public void setId_admission(String id_admission) {
        this.id_admission = id_admission;
    }

    public int getNet_a_payer() {
        return net_a_payer;
    }

    public void setNet_a_payer(int net_a_payer) {
        this.net_a_payer = net_a_payer;
    }
    
    
}
