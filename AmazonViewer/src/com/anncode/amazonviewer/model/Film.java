package com.anncode.amazonviewer.model;

/** 
 
 * 
 * Film Class
 * <p>
 * Film es una clase abstracta, en consecuencia no pude ser instanciada directamente sino que
 * deber ser instanciada mediante las clases hijas
 * {@code view()} este metodo al ser abstracto ES OBLIGATORIO que todas sea implementado en las clases
 * que heredan de esta.
 * 
 * 
 * @author j.hernandez.payan
 * 
 * 
 * @version 1.1 
 * 
 * */
public abstract class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	public Film() {
		
	}
	
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if(viewed == true) {
			visto = "Sí";
		}else {
			visto = "No";
		}
		
		return visto;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	/**
	 * {@code}Metodo abstracto obligatorio de implementar */
	public abstract void view();

}









