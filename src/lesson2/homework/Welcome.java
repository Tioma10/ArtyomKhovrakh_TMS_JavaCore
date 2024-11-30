package lesson2.homework;

public class Welcome {
    public static void main(String[] args){
        getBasicInformationOnJava();
        setBasicVariables();
        arithmeticOperators();
    }

    public static void getBasicInformationOnJava(){
        System.out.println("Welcome to Java with next line...");
        System.out.print("Welcome to Java without next line...");

        System.out.print("No new line...\n");
        System.out.print("The new line message...");

        System.out.println();
        System.out.print("");
    }

    public static void setBasicVariables(){
        byte byteValue = 10;
        short shortValue = 1089;
        int intValue = 234894;
        long longValue = 48_0920_22L;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);

        System.out.println("--------------------------------------------");
        char charValue = 'b';
        System.out.println(charValue);
        char charASCIIValue = 90;
        System.out.println(charASCIIValue);
        System.out.println("----------------------------------------------");

        float floatValue = 34.567F;
        double doubleValue = 456.232323;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        System.out.println("--------------------------------------------------");
        boolean isAlive = true;
        boolean isMarried = false;
        System.out.println(isMarried);
        System.out.println(isAlive);

    }

    public static void arithmeticOperators(){

        int height = 171;
        double weight = 80.1;

        int getSumHeightAddition = height + height;
        System.out.println(getSumHeightAddition);

        int getSumHeightSubtraction = height - 78;
        System.out.println(getSumHeightSubtraction);

        double getSumWeightDivided = weight / 2;
        System.out.println(getSumWeightDivided);

        char storeChangingValue = 87;
        storeChangingValue = (char) (storeChangingValue + 3);
        System.out.println(storeChangingValue);

        System.out.println(10%4);

        System.out.println(11%2);

        int valueIncrement = 1;
        valueIncrement = valueIncrement + 1;
        int valueDecrement = 9;

        // post-increment
        valueIncrement++; // valueIncrement = valueIncrement + 1;
        // post-decrement
        valueDecrement--; // valueIncrement = valueIncrement - 1;

        // pre-increment
        ++valueIncrement;
        // pre-decrement
        --valueDecrement;
    }
}
