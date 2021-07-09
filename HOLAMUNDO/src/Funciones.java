public class Funciones {

    public  static void main(String args[]){
        double y = 3.0;
        double radio = 0.0;

        System.out.println("Area de un circulo " + circleArea(radio) );
        System.out.println("Area esfera " + sphereArea(radio) );
        System.out.println("volumen esfera  " + spherevolumen(radio) );
        System.out.println("Convertir  a dolars :" + convertToDollar(10,"mx") );

    }
    /**
     * Descripcion: Funcion que calcula y regresa el area de un circulo
     * @param radio radio para calcular el area
     * @return area Regresa el area de un ciculo con n de radio
     * */
    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,3);
    }
    /**
     * Descripcion: Funcion que calcula y regresa el area de un esfera
     * @param radio radio para calcular el area
     * @return area Regresa el area de una esfera con n de radio
     * */
    public static double sphereArea(double radio){
      return   4 * Math.PI * Math.pow(radio,2);
    }
    /**
     * Descripcion: Funcion que calcula y regresa el volumen de una esfera
     * @param radio radio para calcular el volumen de una esfera
     * @return area Regresa el volumen de un ciculo con n de radio
     * */
    public static double spherevolumen(double radio){
        return (4/3) * Math.PI + Math.pow(radio,3);
    }
    /**
     * Descripcion: funcion que convierte a dolares especificando la moneda que se utilizara
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda solo validado para euro,mx
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double convertToDollar(double quantity, String currency){
        switch (currency){
            case "mx":
                quantity =  quantity * 0.157;
                break;
            case "eu":
                quantity =  quantity * 1.157;
                break;
            case "col":
                quantity =  quantity * 0.153457;
                break;
        }
        return quantity;
    }
}
