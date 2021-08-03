
package com.mmp.cliniqueolympia.beans;


import javax.inject.Named;

@Named
public class CompoOrdonnance {
    private String posologie;
    private Medicament medicament;
    private Ordonnance ordonnance;
    private String id_admission ;
    private String id_medicament ;
    private int dose_prescrite ;

    public String getId_admission() {
        return id_admission;
    }

    public void setId_admission(String id_admission) {
        this.id_admission = id_admission;
    }

    public String getId_medicament() {
        return id_medicament;
    }

    public void setId_medicament(String id_medicament) {
        this.id_medicament = id_medicament;
    }

    public int getDose_prescrite() {
        return dose_prescrite;
    }

    public void setDose_prescrite(int dose_prescrite) {
        this.dose_prescrite = dose_prescrite;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public CompoOrdonnance() {
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public Ordonnance getOrdonnance() {
        return ordonnance;
    }

    public void setOrdonnance(Ordonnance ordonnance) {
        this.ordonnance = ordonnance;
    }
    
    
    
}
