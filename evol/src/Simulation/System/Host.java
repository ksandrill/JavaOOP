package Simulation.System;


import java.util.ArrayList;

public abstract class Host {
    public void setGID(int GID) {
        this.GID = GID;
    }

    protected int pointer;

    public int getGID() {
        return GID;
    }

    private int GID;



    public void setActionPoints(int actionPoints) {
        this.actionPoints = actionPoints;
    }

    protected int actionPoints;

    public int getActionPoints() {
        return actionPoints;
    }

    public Host []neighbours;
    public Pair []cord;

    public abstract void offsetPointer(int offset);


    public abstract void makeNeighbours(ArrayList<Host> cells,int hSize,int wSize);


    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    int posX;

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosY() {
        return posY;
    }

    int posY;

    public int getEnergy() {
        return energy;
    }

    int energy;
    int rotation;
    public void changeEnergy(int offset){
        energy += offset;

    }
    public void setRotation(int rot){
        rotation = rot;
    }
    public int getRotation(){
        return rotation;
    }




    public Host(int x, int y, int hp) {
        enable = true;
        posX = x;
        posY = y;
        energy = hp;
        rotation = 0;
        pointer =0;
        actionPoints = 2;

    }
    public Host(){};

    public abstract void step(Executable executor) throws Exception;
}




