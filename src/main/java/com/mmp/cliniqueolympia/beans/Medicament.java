
package com.mmp.cliniqueolympia.beans;

import javax.inject.Named;

@Named
public class Medicament {
    private String id_medicament ;
    private String intitule ;
    private String type_medicament ;

    public String getId_medicament() {
        return id_medicament;
    }

    public void setId_medicament(String id_medicament) {
        this.id_medicament = id_medicament;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getType_medicament() {
        return type_medicament;
    }

    public void setType_medicament(String type_medicament) {
        this.type_medicament = type_medicament;
    }
    
    
}
