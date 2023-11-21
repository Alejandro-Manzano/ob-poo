package poo.clases;

public class Vehículo {

                // 1. Atributos
                String modelo;
                String fabricante;
                double cv;
                int year;
                boolean sport;

                // 2. Constructores
                public Vehículo(String fabricante, String modelo, double cv, int year, boolean sport){
                        this.fabricante = fabricante;
                        this.modelo = modelo;
                        this.cv = cv;
                        this.year = year;
                        this.sport = sport;
                }

                public Vehículo(String fabricante, String modelo){
                        this.fabricante = fabricante;
                        this.modelo = modelo;
                }


                // 3. Métodos

}
