package com;

public class Cage {
Animal animal;
public static void main(String[] args) {
	Cage cage = new Cage();
	cage.animal = new Lion();
	cage.animal.sound();
}
}
