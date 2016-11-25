import java.util.Scanner;


public class BasicGeometry {

    public static void main(String[] args) {
    
        // Berechnung des Volumens eines Quaders
        System.out.println("Berechnet wird das Volumen eines Quaders mit den Kantenlängen a, b, c.\n");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Kantenlänge a: ");
        int a = s.nextInt();
        System.out.print("Kantenlänge b: ");
        int b = s.nextInt();
        System.out.print("Kantenlänge c: ");
        int c = s.nextInt();
        
        System.out.println("\nVolumen des Quaders: " + (a*b*c));
            
    } //end of method main
}