package poo.clases;

public class Vehículo {

                // 1. Atributos
                String modelo;
                String fabricante;
                double cv;
                int year;
                boolean sport;
                double speed;
                

                // 2. Constructores
                public Vehículo(String fabricante, String modelo, double cv, int year, boolean sport){
                        this.fabricante = fabricante;
                        this.modelo = modelo;
                        this.cv = cv;
                        this.year = year;
                        this.sport = sport;
                        this.speed = 0;
                }

                public Vehículo(String modelo, int year) { //Creación de constructor automáyico
                        this.modelo = modelo;
                        this.year = year;
                }

                public Vehículo(String fabricante, String modelo){
                        this.fabricante = fabricante;
                        this.modelo = modelo;
                }

                // 3. Métodos
                public void  acelerar(int quantity){

                    this.speed += quantity;
                }
}
