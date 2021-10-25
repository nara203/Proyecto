public class Sensor{
    public static Sensor sensores[]=new Sensor[8];
    public static int tamano=8;
    public static int posAnadir=0;
    private String tipo;
    private double valor;
    public Sensor(){
    }
    public Sensor(String t,double v){
        Sensor sAsignar=new Sensor();
        sAsignar.setTipo(t);
        sAsignar.setValor(v);
        this.sensores[posAnadir]=sAsignar;
        this.posAnadir=this.posAnadir+1;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public void setValor(double v){
        this.valor=v;
    }
    public String getTipo(){
        return this.tipo;
    }
    public double getValor(){
        return this.valor;
    }
    public String toString(){
        String toString=getTipo()+", "+getValor();
        return toString;
    }
    public static String toStringSensores(){
        String listaSensores="";
        for(int i=0;i<posAnadir;i++){
            String t=sensores[i].getTipo();
            Double v=sensores[i].getValor();
            listaSensores=listaSensores+"/ "+t+", "+v;
        }
        return listaSensores;
    }
    public static int cantidadSensores(){
        return posAnadir;
    }
    public static void ordenar(){
        double[] acumulador=new double[posAnadir];
        int posm; 
        double temp;
        int n=posAnadir;
        for(int i=0;i<n;i++){
            if(sensores[i].getTipo().equals("temperatura")){
                acumulador[i]=sensores[i].getValor();
            }else{
                n=n-1;
            }
        }
        for(int i=0;i<n-1;i++){
            posm=i;
            for(int j=i+1;j<n;j++){
                if(acumulador[j]<acumulador[posm]){
                    posm=j;
                }
            }
            temp=acumulador[i];
            acumulador[i]=acumulador[posm];
            acumulador[posm]=temp;
                }
        for(int i = 0; i < n; i++){
            System.out.println(acumulador[i]);
        }
    }
    public static String tempe(){
        String lista="";
        for(int i=0;i<posAnadir;i++){
            if(sensores[i].getTipo().equals("temperatura")){
                lista=lista+"/ "+sensores[i].toString();
            }
        }
        return lista;
    }
}