package com.epicode.backend.week1;

public class Immagini extends Media implements Guarda{
	
	public Immagini(String title, int light) {
		super(title);
		lumex = light;
	}
	
	int lumex;
	
	@Override
	public void UpLumex() {
		lumex++;
		
	}

	@Override
	public void DownLumex() {
		lumex--;
		
	}

	
	@Override
	public void showMedia() {
		String shine = "";
		for(int i=0; i<lumex; i++) {
			shine += "*";
		}
		
		System.out.println("Immagine:"+getTitle()+" "+shine);
		
	}

	

}
