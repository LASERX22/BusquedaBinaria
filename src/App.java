import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        MetodoBurbuja mb=new MetodoBurbuja();
        System.out.println("Ingrese la cantidad de personas");
        int cantidad=scanner.nextInt();
        Persona[] persona=new Persona[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingrese Persona");
            System.out.println("Nombre:");
            String nombre=scanner.next();
            System.out.println("Edad:");
            int edad=scanner.nextInt();
            persona[i]=new Persona(nombre, edad);
        }
        mb.ascendente(persona);
        BusquedaBinaria bb=new BusquedaBinaria(persona);
        bb.showPersonByEdad();
        scanner.close();
    }
}   
