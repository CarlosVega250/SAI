package agentecontador;

import jade.core.behaviours.Behaviour;

public class Comportamiento extends Behaviour{
    int count = 0;

    @Override
    public void action() {
        System.out.println(count);
        count++;
    }

    @Override
    public boolean done() {
        return count > 100;
    }
    
    
}
