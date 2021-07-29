package beginnerexecises.accesscontrolexercises.outdefaultpackage;

//import beginnerexecises.accesscontrolexercises.defaultacces.DefaultClass;

import beginnerexecises.accesscontrolexercises.defaultacces.PublicClass;

public class TestNotDefault {
    public static void main(String[] args) {
        //DefaultClass defaultClass = new DefaultClass();

        /*
        DefaultClass defaultClass = new DefaultClass();
                *this is not possible because, DefaultClass class have access control default
        */
        PublicClass publicClass = new PublicClass();
        publicClass.printMessageFromPublicClass("TestNotDefault");
    }

}
