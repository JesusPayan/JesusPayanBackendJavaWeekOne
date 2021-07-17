package com.jesuspayan.lambdas;


public abstract class ImplementsClickable implements Clickable {
private static final Element Boton = null;

public static void main(String[] args) {
	
	Clickable clickeClickableElement =  (Element element) -> {
		System.out.println("Se dio click en el elemento " + element);
	};
	
	clickeClickableElement.click(Boton);
}
	

}
