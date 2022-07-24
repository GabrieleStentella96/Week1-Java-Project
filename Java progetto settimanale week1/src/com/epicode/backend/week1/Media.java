package com.epicode.backend.week1;

import java.util.Scanner;

public abstract class Media {
	
	private String title;

    public Media(String title) {
        this.setTitle(title);
    }

    
    public void showMedia() {};
    public void playMedia() {};


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void volUp() {
		
		
	}


	public void volDown() {
		
		
	}
	
	
    public void modifySetMedia(Scanner print) {
		
	}


	public void start() {
		
		
	}





    
}