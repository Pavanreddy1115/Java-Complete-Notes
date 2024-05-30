package org;

class Country {
	String name;
	State state;
	Country(String name,State state){
		this.name = name;
		this.state = state;
	}
	

}
class State{
	String name;
	District district;
	State(String name,District district){
		this.name = name;
		this.district = district;
	}
	
	
	
	
}
class District{
	String name;
	District(String name){
		this.name = name;
	}
}
