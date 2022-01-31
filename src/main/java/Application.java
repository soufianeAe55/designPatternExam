import DesginPattern.Adapter;
import DesginPattern.IStrategyImpl;
import DesginPattern.IStrategyImpl2;
import uml.DiagrammeClasse;

public class Application {
    public static void main(String[] args) {
        DiagrammeClasse diagrammeClasse=new DiagrammeClasse();
        diagrammeClasse.createDiargramme();
        IStrategyImpl strategy1=new IStrategyImpl();
        diagrammeClasse.setStrategy(strategy1);
        diagrammeClasse.generateCode();
        IStrategyImpl2 strategy2=new IStrategyImpl2();
        diagrammeClasse.setStrategy(strategy2);
        diagrammeClasse.generateCode();
        diagrammeClasse.setStrategy(new Adapter());
        diagrammeClasse.generateCode();

    }
}
