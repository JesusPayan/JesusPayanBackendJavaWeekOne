public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
       // salary = salary + 1000;
        System.out.println("Salario base: $" + salary);
        //bono $200
        salary += 200;
        System.out.println("Salario mas bono: $" + salary);
        //menos pension
        salary -=50;
        System.out.println("Salario menos pension: $" + salary);
        //trabajo 2 hras extra $30 c/u
        salary += 30 * 2;
        System.out.println("Salario mas extras: $" + salary);
        salary -= 45;
        System.out.println("Salario menos comida: $" + salary);
        //Actualizar CAdena de texto
        String employeeName = "Jesus";
        System.out.println(employeeName);
        employeeName = employeeName + "Armando";
        System.out.println("Segundo nombre" + employeeName);
        employeeName = employeeName + "Hernandez";
        System.out.println("Primer Apellido " + employeeName);
    }
}
