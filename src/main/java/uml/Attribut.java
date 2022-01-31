package uml;

public class Attribut {
    private String Nom;
    private String Type;
    private Boolean finale;
    private Boolean Statique;
    private String visiilite;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Boolean getFinale() {
        return finale;
    }

    public void setFinale(Boolean finale) {
        this.finale = finale;
    }

    public Boolean getStatique() {
        return Statique;
    }

    public void setStatique(Boolean statique) {
        Statique = statique;
    }

    public String getVisiilite() {
        return visiilite;
    }

    public void setVisiilite(String visiilite) {
        this.visiilite = visiilite;
    }
}
