public class DepartamentoLogistica {

    public static void ingresarAnimalSalvaje() {
        AnimalSalvaje animalSalvaje = new AnimalSalvaje(1, "Lorenzo", "1"); //Leer info por teclado
        System.out.println("Bienvenido " + animalSalvaje.toString());
    }

    public static void admonZoo(){
        System.out.println("Qué desea hacer: 1 ingreso, 2 alimentar, 3 trasladar");
        //int option = leerInt("Ingrese su opción: ");
        int option = 1;
        if(option == 1) {
            System.out.println("Alimentado al animal");
        }
    }

}
