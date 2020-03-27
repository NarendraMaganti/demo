package com.capgemini.revision.hadarelationship;

public class Ola {
	GoogleMaps g1;
	Ola(GoogleMaps g1){
		this.g1=g1;
	}
	void location(String src , String destination) {
		g1.mapping(src,destination);
	}
	

}
