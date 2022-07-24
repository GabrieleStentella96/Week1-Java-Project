package com.epicode.backend.week1;

public class Video extends Media implements Guarda, RiproduciMedia  {
	
	private int duration;
	private int volume;
	private int lumex;
	
	
	
	public Video(String title,int dur, int vol, int light) {
		super(title);
		
		duration = dur;
		volume= vol;
		lumex = light;
	}

	@Override
	public void playMedia() {
		
		String lightString = "";
		
		for(int i=0; i<lumex; i++) {
			lightString += "*";
		}
		
		String volumeString = "";
		
		for(int i=0; i<volume; i++) {
			volumeString += "x";
		}
		
		System.out.println("Enjoy!");
		
	
		for(int i=0; i<duration; i++) {
			System.out.println("Video:"+getTitle()+" "+volumeString+" "+lightString+ 
					" seen:"+(i+1)+"seconds left:" + (duration-(i+1))+"seconds");
			
			}
		
		System.out.println("Video:"+ getTitle()+ " is over");
		
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
	public void UpLumex() {
		lumex++;
	}

	@Override
	public void DownLumex() {
		lumex--;
	}

	@Override
	public void playAudio() {
		
		
	}
}
