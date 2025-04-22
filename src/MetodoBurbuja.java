public class MetodoBurbuja {
    public void ascendente(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - 1 - i; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
    }

    /*public void printArray(Persona[] personas){
        for(int i=0; i<personas.length;i++){
            System.out.println("Persona["+i+"]: "+nombre+);
        }
    }*/
}
