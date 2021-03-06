package com.troisieme.time;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import com.troisieme.vue.ChronoTroupes;

public class ChronoStAnne {

	private Timer chrono;
	private int sec = 0;
	private int min = 0;
	private int tour = 0;
	
	
	public ChronoStAnne(){
		chrono = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sec == 60) {
					sec = 0;
					min++;
				}
				sec++;
				if(min<10)
    				ChronoTroupes.labelStAnneMin.setText("0"+String.valueOf(min));
    			else
    				ChronoTroupes.labelStAnneMin.setText(String.valueOf(min));
    			if(sec<10)
    				ChronoTroupes.labelStAnneSec.setText("0"+String.valueOf(sec));
    			else
    				ChronoTroupes.labelStAnneSec.setText(String.valueOf(sec));
			}
		});
	}
	
	public int getSec(){
		return sec;
	}
	
	public int getMin(){
		return min;
	}
	
	public int getTour(){
		return tour;
	}
	
	public void addTour(){
		tour++;
	}
	
	public void setTour(int t){
		tour = t;
	}
	
	public void start(){
		chrono.start();
	}
	
	public void stop(){
		chrono.stop();
	}
	
	public void raz(){
		sec = 0;
		min = 0;
	}
}
