package org.example.InterfacesAvengers;

class IronMan implements Superhero {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void shootLasers() {
        System.out.println("I'm shooting lasers!");
    }
}

