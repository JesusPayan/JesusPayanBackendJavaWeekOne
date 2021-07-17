package com.anncode.amazonviewer.db;

public class DataBase {
	//construccion de url para la conexion a la base de datos amazonviewer
	public static final String URL = "jdbc:mysql://localhost:3306/";//url para la conexion  a base de datos
	public static final String DB = "amazonviewer";//nombre de la BD
	public static final String USER = "amazonviewer";//usuario
	public static final String PASSWORD = "amazonviewer";//contraseña
	
	
	//CAMPOS TABLA MOVIE
	public static final String TMOVIE = "amazonviewer";//nombre tabla
	public static final String TMOVIE_ID = "id";//id pelicula
	public static final String TMOVIE_TITLE = "title";//titulo
	public static final String TMOVIE_GENRE = "genre";//generp
	public static final String TMOVIE_CREATOR = "creator";//creador
	public static final String TMOVIE_DURATION = "duration";//duracion
	public static final String TMOVIE_YEAR = "year";//año
	
	//TABLA MATERIALS
	public static final String TMATERIAL 	= "material";
	public static final int[] ID_TMATERIALS 	= {1,2,3,4,5};
	
	//CAMPOS TABLA USER
	public static final String TUSER = "user";//nombre tabla
	public static final int TUSER_IDUSUARIO = 1;//id usuario
	public static final String TUSER_NAME = "name";//nombre usuario
	
	//CAMPOS TABLA VIEWED
	public static final String TVIEWED = "viewed";//nombre tabla
	public static final String TVIEWED_IDMATERIAL = "id_material";//id material
	public static final String TVIEWED_IDELEMENT = "id_element";//id elemento
	public static final String TVIEWED_IDUSUARIO = "id_user";//id usario
	

	
	
	
	
	

	
	
	
}
