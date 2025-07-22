public class Main {
    public static void main(String[] args) {

        //TIPOS DE VARIABLES

        //Numero Enteros
        byte variableByte = 100;
        short variableShort = 1000;
        int variableInt = 10000;
        long variableLong = 100000L;

        //Numero Reales
        float variableFloat = 1.5555555f;
        double variableDouble = 1.55555555;

        //Booleanos
        boolean variableBoolean = true;

        //Cadenas y Caracteres
        String variableString = "Hola mundo";
        char variableChar = 'A';

        //Mostrar Valores

        System.out.println("Variable Byte=" + variableByte);
        System.out.println("Variable Short: " + variableShort);
        System.out.println("Variable Int: " + variableInt);
        System.out.println("Variable Long: " + variableLong);

        System.out.println("Variable float: " + variableFloat);
        System.out.println("Variable Double: "+ variableDouble);

        System.out.println("Variable Booleanos :" + variableBoolean);

        System.out.println("Variable String:" + variableString);
        System.out.println("Variable Char: " + variableChar);


        final int valorConstante = 100;
        System.out.println("Valor Constante: " + valorConstante);

    }

}