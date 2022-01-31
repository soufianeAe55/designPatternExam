package uml;

import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite{

    public Classe(String nom) {
        super(nom);
    }
    private Boolean abstraite;
    private Boolean finale;
    private Boolean publique;
    private List<Methode> methodes= new ArrayList<>();
    private  List<Constructeur> constructeurs= new ArrayList<>();
    private List<Attribut> attributs= new ArrayList<>();

    public Boolean getAbstraite() {
        return abstraite;
    }

    public void setAbstraite(Boolean abstraite) {
        this.abstraite = abstraite;
    }

    public Boolean getFinale() {
        return finale;
    }

    public void setFinale(Boolean finale) {
        this.finale = finale;
    }

    public Boolean getPublique() {
        return publique;
    }

    public void setPublique(Boolean publique) {
        this.publique = publique;
    }

    public List<Methode> getMethodes() {
        return methodes;
    }

    public void setMethodes(List<Methode> methodes) {
        this.methodes = methodes;
    }

    public List<Constructeur> getConstructeurs() {
        return constructeurs;
    }

    public void setConstructeurs(List<Constructeur> constructeurs) {
        this.constructeurs = constructeurs;
    }

    public List<Attribut> getAttributs() {
        return attributs;
    }

    public void setAttributs(List<Attribut> attributs) {
        this.attributs = attributs;
    }
}
