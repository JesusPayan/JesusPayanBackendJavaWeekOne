/*CUENTA CUANTOS REGISTROS ESTAN ACTIVOS Y CUANTOS ESTAN INACTIVOS Y LOS AGRUPA POR EL ESTATUS */
SELECT	estatus, COUNT(*) AS post_number
FROM		posts
GROUP BY estatus;
/*AGRUPA LOS POST GENERADOS EN DIVERSOS AÑOS MUESTRA EL NUMERO DE POST POR AÑO Y LOS AGRUPA POR AÑO DONDE SE PUBLICO EL POST */
SELECT	YEAR(fecha_publicacion) AS post_year, COUNT(*) AS NUMERO_DE_POST
FROM		posts
GROUP BY post_year;
/*IGUAL QUE LA SENTENCIA ANTERIO PERO EN LUGAR DE AÑO LO HCE POR MES*/
SELECT	MONTHNAME(fecha_publicacion) AS post_month, COUNT(*) AS post_number
FROM		posts
GROUP BY post_month;
/*MUESTA Y CUENTA TODOS LOS POST ACTIVOS POR MES Y LOS INACTIVOS POR MES*/
SELECT	estatus, MONTHNAME(fecha_publicacion) AS post_date, COUNT(*) AS post_number
FROM		posts
GROUP BY estatus, post_date;