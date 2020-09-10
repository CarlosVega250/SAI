package agente1;
import jade.core.Agent;

public class Agente extends Agent{

    protected void setup () {
        this.addBehaviour(new Comportamiento());
    }
    
}
