package agente1;

import jade.core.behaviours.Behaviour;


public class Comportamiento extends Behaviour{

    @Override
    public void action() {
        System.out.println("Hola Mundo");
    }

    @Override
    public boolean done() {
        return true;
    }
    
}
