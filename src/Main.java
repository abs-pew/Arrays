import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Aufgabe 01 - String Array
// String[] studentNames = {"Florian", "Martin", "Domijnic", "Sara"};
        String[] studentNames = new String[4];
        studentNames[0] = "Florian";
        studentNames[1] = "Martin";
        studentNames[2] = "Dominic";
        studentNames[3] = "Sara";

int[] oneToTenIntegrs = new int[10];
int sum1To10 = 0;
for (int i = 0; i < oneToTenIntegrs.length; i++)
{
    oneToTenIntegrs[i] = i + 1;
    System.out.println(oneToTenIntegrs[i]);
    sum1To10 = sum1To10 + oneToTenIntegrs[i];
}
System.out.println("Sum of 1 - 10 = " + sum1To10);
 //       System.out.println(Arrays.stream(oneToTenIntegrs).sum());
        System.out.println("Largest Number = " + Arrays.stream(oneToTenIntegrs).max().getAsInt());

int[] elevenToTwentyIntegers = new int[10];
for (int i = 0; i < elevenToTwentyIntegers.length; i++)
{
    elevenToTwentyIntegers[i] = i + 11;
//    System.out.println(elevenToTwentyIntegers[i]);
}

int[] sumOfArrays = new int[10];
for (int i = 0; i < elevenToTwentyIntegers.length; i++)
{
    sumOfArrays[i] = oneToTenIntegrs[i] + elevenToTwentyIntegers[i];
    System.out.println(oneToTenIntegrs[i] + " + " + elevenToTwentyIntegers[i] + " = " + sumOfArrays[i]);
}

/*
for  (int tempArray : sumOfArrays )
{
    System.out.println(tempArray);
}
*/

    }
}