package com.anncode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	/**
	 * Este metodo captura el tiempo exactop de visualizacio
	 * @param dateI es un objetos {@code}  con el tiempo de inicio exacto
	 * @return Regresa la fecha y la hora capturada. */
	Date startToSee(Date dateI);
	/**
	 * Este metodo captura el tiempo exactop de inicio y final de la visualizacion
	 * 
	 * @param dateI es un objeto {@code Date} con eltiempo de inicio
	 * @param dateF es un objeto {@code Date} con eltiempo de final*  
	 *  
	 *  */
	void stopToSee(Date dateI, Date dateF);
	
}
