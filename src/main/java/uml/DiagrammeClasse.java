package uml;

import DesginPattern.IStrategy;
import uml.associations.Association;
import uml.associations.Cardenalite;

import java.util.List;

public class DiagrammeClasse {
    private List<Entite> entites;
    private IStrategy strategy;

    public void createDiargramme(){
        Classe salarie=new Classe("salarie");
        Classe Departement=new Classe("Departement");
        Association appartient=new Association();

        Attribut nom=new Attribut();
        nom.setNom("Nom");
        nom.setType("String");
        nom.setStatique(false);
        nom.setFinale(false);
        nom.setVisiilite("private");
        Attribut prenom=new Attribut();
        nom.setNom("Prenom");
        nom.setType("String");
        nom.setStatique(false);
        nom.setFinale(false);
        nom.setVisiilite("private");
        salarie.getAttributs().add(nom);
        salarie.getAttributs().add(prenom);

        Attribut nomDept=new Attribut();
        nom.setNom("NomDept");
        nom.setType("String");
        nom.setStatique(false);
        nom.setFinale(false);
        nom.setVisiilite("private");
        Attribut NombreSalarie=new Attribut();
        nom.setNom("NombreSalarie");
        nom.setType("Integer");
        nom.setStatique(false);
        nom.setFinale(false);
        nom.setVisiilite("private");
        Departement.getAttributs().add(nomDept);
        Departement.getAttributs().add(NombreSalarie);

        appartient.setEntiteSource(salarie);
        appartient.setEntiteDestination(Departement);
        Cardenalite cardenalite1=new Cardenalite();
        Cardenalite cardenalite2=new Cardenalite();
        cardenalite1.setEnumrateur("UN");
        cardenalite2.setEnumrateur("MANY");
        appartient.getCardenalites().add(cardenalite1);
        appartient.getCardenalites().add(cardenalite2);

    }
    public void generateCode(){
        strategy.appliquer();
    }
    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
