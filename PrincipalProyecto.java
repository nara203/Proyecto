import java.util.Scanner;
public class PrincipalProyecto{
    public static Vehiculo vehiculos[]=new Vehiculo[10];
    public static Sensor sensores[]=new Sensor[8];
    public static void main(String[] args){
        PrincipalProyecto.mostrarMenu();
    }
    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 0 para detener el programa.");
        System.out.println("Ingrese 1 para ingresar cuatro parámetros de vehículo.");
        System.out.println("Ingrese 2 para mostrar información de los vehiculos.");
        System.out.println("Ingrese 3 para mostrar la cantidad de vehículos.");
        System.out.println("Ingrese 4 para ver la información de los vehículos con color verde.");
        System.out.println("Ingrese 5 para ver los vehículos con modelos entre 2000 y 2021.");
        System.out.println("Ingrese 6 para ingresar 2 parametros de sensor.");
        System.out.println("Ingrese 7 para mostrar la información de los sensores.");
        System.out.println("Ingrese 8 para mostrar la cantidad de sensores.");
        System.out.println("Ingrese 9 para ver los sensores de tipo temperatura.");
        System.out.println("Ingrese 666 para mostrar los sensores tipo temperatura ordenados por el valor.");
        while(true){
            int num=scan.nextInt();
            if(num==0){
                System.out.println("Finaliza.");
                break;
            }else if(num==1 && Vehiculo.posAnadir<10){
                System.out.println("Ingrese los datos en este orden: Modelo. Marca. Valor comercial. Color");
                int mo=scan.nextInt();
                String ma=scan.next();
                double va=scan.nextDouble();
                String co=scan.next();
                Vehiculo vAsig=new Vehiculo(mo,ma,va,co);
                System.out.println("Finalizó la asignación de datos.");
                if(Vehiculo.posAnadir>=10){
                    System.out.println("Error base de datos llena");
                }
            }else if(num==2){
                System.out.println("La información de los vehículos es: "+Vehiculo.toStringVehiculos());
            }else if(num==3){
                System.out.println("La cantidad de vehículos es: "+Vehiculo.cantidadVehiculos());
            }else if(num==4){
                System.out.println(Vehiculo.verdes());
            }else if(num==5){
                System.out.println(Vehiculo.model());
            }else if(num==6 && Sensor.posAnadir<8){
                System.out.println("Ingrese los datos en este orden: Tipo. Valor.");
                String t=scan.next();
                double v=scan.nextDouble();
                Sensor sAsig=new Sensor(t,v);
                System.out.println("Finalizó la asignación de datos.");
                if(Sensor.posAnadir>=8){
                    System.out.println("Error base de datos llena")
                }
            }else if(num==7){
                System.out.println("La información de los sensores es: "+Sensor.toStringSensores());
            }else if(num==8){
                System.out.println("La cantidad de sensores es: "+Sensor.cantidadSensores());
            }else if(num==9){
                System.out.println(Sensor.tempe());
                }
                System.out.println(listaTemp);
            }else if(num==666){
                Sensor.ordenar();
            }
        }
    }
}