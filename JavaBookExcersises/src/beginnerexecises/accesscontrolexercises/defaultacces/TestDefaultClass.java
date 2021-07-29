package beginnerexecises.accesscontrolexercises.defaultacces;

public class TestDefaultClass {
                public static void main(String[] args) {
                            DefaultClass defaultClass = new DefaultClass();
                            PublicClass publicClass = new PublicClass();
                            defaultClass.printDefaultMessage("TestDefaultClass");
                            publicClass.printMessageFromPublicClass("TestDefaultClass");
                }

}
