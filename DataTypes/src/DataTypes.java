public class DataTypes {
    //COMPILAR Y EJECUTAR EN JVA 10 O MAYOR
    public static void main(String[] args) {
        int number = 123;
        long longNumber = 234234234234242342L;
        double doubleNumber = 4.65465465464646546465464645464646;
        float floatNumber = 123458.1654165164165446f;

        char caracter ='A';
        boolean bandera = true | false ;
//        var texto =  "alkaloids";
        var salary = 1000;
        var pension =  salary*0.03;
        var totalSalary = salary - pension;
        var employeeName = "Jesus Payan";
        System.out.println("Employee " + employeeName + " Salary " + totalSalary);

       int a = 10  , b = 15;
       //operador +=
        //Aplicacion
        a += b;
        //Desglose
        a = a + b;

        //operador -=
        //Aplicacion
        a -= b;
        //Desglose
        a = a - b;
        //operador *=
        //Aplicacion
        a *= b;
        //Desglose
        a = a * b;

        //operador /=
        //Aplicacion
        a /= b;
        //Desglose
        a = a / b;
        //operador /=
        //Aplicacion
        a %= b;
        //Desglose
        a = a % b;
        int i= 10;
        //OPERADOR INCREMENTO ++
        i++;
        //DESGLOSE
        i = i + 1;
        //OPERADOR INCREMENTO --
        i--;
        //DESGLOSE
        i = i - 1;

    }
}
