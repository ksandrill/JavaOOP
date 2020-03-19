package Simulation.Evolution.Genes;

import Simulation.System.Command;
import Simulation.System.Host;

public class Rotate implements Command {



    @Override
    public void doStuff(Host host) {
        host.setRotation((int)(Math.random()*8));

    }
}
