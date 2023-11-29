package poo.clases;

public class Main {

    public static void main(String[] args) {

        //Crear objeto
        //Clase id = new Clase();
        //Vehículo toyotaPrius = new Vehículo();

        Vehículo fordMondeo = new Vehículo("Ford", "Mondeo", 2.1, 2015, true);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); //0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); //50
    }

}
