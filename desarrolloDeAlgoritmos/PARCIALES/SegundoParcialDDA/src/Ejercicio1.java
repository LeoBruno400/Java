public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 8;
        System.out.println("El numero en binaro es: " +cambioDeBase(numero)); 
    }
    
    public static String cambioDeBase(int num){
        String cadena = "";

        if(num<2){
            if(num!=0){
                cadena = "1";
            }else{
                cadena = "0";
            }
        }else{
            cadena += cambioDeBase(num/2) + num%2;
        }
        return cadena;
    }  
}
