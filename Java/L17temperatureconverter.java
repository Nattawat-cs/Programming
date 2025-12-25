import java.util.Scanner;

public class L17temperatureconverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Double temp;
        Double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F)");
        unit = scanner.next().toUpperCase();

        // (condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
        
        System.out.print("%.1f %s",newTemp, unit);

        scanner.close();
    }
}