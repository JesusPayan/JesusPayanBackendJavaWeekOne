public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions;
        androidVersions = new String[17];
        String days[] = new String[7];
        String[][] cities = new String[4][2];
        int numbers[][][] = new int[2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

//        System.out.println(androidVersion[0]);
//        System.out.println(androidVersion[1]);
//        System.out.println(androidVersion[2]);
//        System.out.println(androidVersion[3]);

        for (int i = 0; i < androidVersions.length - 1; i++) {
            System.out.println(androidVersions[i]);
        }
        System.out.println("");
        System.out.println("");

        for (String androidVersion: androidVersions) {
            //System.out.println(androidVersions[i]).out.println();
        }
        System.out.println("");
        System.out.println("");
        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        System.out.println( "dimensiones " + cities.length);

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length-2; j++) {

                System.out.println("i["+ i +"]"+ "j[" + j+ "] " + cities[i][j]);
                //System.out.println(" " + cities[i][j]);

            }
        }

        for (String[] pair:cities) {
            for (String name:pair) {
                System.out.println(name);
            }
        }
//
        int i = 7; char c = 'w'; System.out.println((i >= 6) && (c == 'w'));
/* T*/
//        System.out.println(cities[0][1]);
//        System.out.println(cities[1][0]);
//        System.out.println(cities[1][1]);
//        System.out.println(cities[2][0]);
//        System.out.println(cities[2][1]);
//        System.out.println(cities[3][0]);
//        System.out.println(cities[3][1]);


        String animals[][][][] = new String[2][3][2][2];
        animals[1][0][0][1] = "monkey";
        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);
        for ( i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k < 0; k++) {
                    for (int l = 0; l < 0; l++) {
                        System.out.println(animals[i][j][k][l]);

                    }
                }
            }
        }
    }
}
