package com;

class Tom extends Person {
	
@Override
void eat() {
	System.out.println("Tom is eaating");
}
@Override
void sleep() {
	System.out.println("Tom is sleeping");
}
static void display(Person p) {
	p.eat();
	p.sleep();
}
public static void main(String[] args) {
	Person p = new Tom();
	p.eat();
	p.sleep();
	
	System.out.println("-------------");
	display(new Tom());
	
}

}

