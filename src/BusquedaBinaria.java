import java.util.Scanner;

public class BusquedaBinaria {
    private Persona [] personas;
    private int edad;
    Scanner scanner=new Scanner(System.in);

    public BusquedaBinaria(Persona[] personas){
        this.personas=personas;
        System.out.println("Metodo de busqueda binaria");
    }
        
    public int findbyEdad(int edad){
        int bajo=0;
        int alto=personas.length-1;
        while(alto>=bajo){
            int central=(alto+bajo)/2;
            for (int i=bajo;i<alto+1;i++){
                System.out.print(personas[i].getEdad()+" | ");
            }
            if(personas[central].getEdad()==edad){
                System.out.println("");
                System.out.println("BAJO="+bajo+" ALTO="+alto+" CENTRO="+central+" VALORCENTRO="+personas[central].getEdad()+" --> ENCONTRADO");
                return central;
            }
            if(personas[central].getEdad()>edad){
                System.out.println("");
                System.out.println("BAJO="+bajo+" ALTO="+alto+" CENTRO="+central+" VALORCENTRO="+personas[central].getEdad()+" --> IZQUIERDA");
                alto=central-1; //izq
            }
            else{
                System.out.println("");
                System.out.println("BAJO="+bajo+" ALTO="+alto+" CENTRO="+central+" VALORCENTRO="+personas[central].getEdad()+" --> DERECHA");
                bajo=central+1; //der
            }
        }
        return -1;
    }

    public void showPersonByEdad(){
        System.out.println("Edad de la persona a buscar:");
        int edad=scanner.nextInt();
        int posicion=findbyEdad(edad);
        if(posicion==-1){
            System.out.println("Persona con edad "+edad+" no encontrada");
        }
        else{
            System.out.println("Persona con edad "+edad+" encontrada");
            System.out.println(personas[posicion].toString());
        }
    }
}
