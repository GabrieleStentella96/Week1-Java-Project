package com.epicode.backend.week1;



public class Audio extends Media implements RiproduciMedia {
	
	private int duration;
	private int volume;
	
	
	
	public Audio(String title, int dur, int vol) {
		super(title);
		
		duration = dur;
		volume = vol;
		
	}

	@Override
	
	public void playMedia() {
		
		String songString = "";
		for(int i=0; i<volume; i++) {
			songString += "x";
		}
		
		for(int i=0; i<duration; i++) {
			System.out.println("Canzone:"+getTitle()+" "+songString+ " "
					+ "riprodotti:"+(i+1)+"secondi, restanti altri:" + 
					(duration-(i+1))+"secondi");
			
			}
		System.out.println("La canzone:"+getTitle()+ " è terminata");
		
		
	}

	
	@Override
	public void UpVolume() {
		volume++;
		
	}
	@Override
	public void DownVolume() {
		volume--;
	}

	@Override
	public void playAudio() {
		// TODO Auto-generated method stub
		
	}
}
