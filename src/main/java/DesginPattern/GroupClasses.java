package DesginPattern;

import uml.Classe;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class GroupClasses extends Classe {
    private List<Classe>classes= new ArrayList<Classe>();
    public GroupClasses(String name) {
        super(name);
    }

    public Classe addClasse(Classe c){
        classes.add(c);
        return c;
    }

}
