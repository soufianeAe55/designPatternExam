package uml.associations;

import uml.Classe;
import uml.Entite;

import java.util.ArrayList;
import java.util.List;

public class Association {
    private Entite entiteSource;
    private Entite entiteDestination;
    private List<Cardenalite> cardenalites= new ArrayList<>();;

    public Entite getEntiteSource() {
        return entiteSource;
    }

    public void setEntiteSource(Entite entiteSource) {
        this.entiteSource = entiteSource;
    }

    public Entite getEntiteDestination() {
        return entiteDestination;
    }

    public void setEntiteDestination(Entite entiteDestination) {
        this.entiteDestination = entiteDestination;
    }

    public List<Cardenalite> getCardenalites() {
        return cardenalites;
    }

    public void setCardenalites(List<Cardenalite> cardenalites) {
        this.cardenalites = cardenalites;
    }
}
