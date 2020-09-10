package agentecontador;
import jade.core.Agent;

public class AgenteContador extends Agent{

    protected void setup () {
        this.addBehaviour(new Comportamiento());
    }
    
}

