public class javapr {

   public static void main(String[] args) {
//paso1
       String articulo = "Lapiz";

       boolean tienePermiso = true;
//paso2
       if(!tienePermiso){
           System.out.println("No tiene permiso de acceso");


       }
       else {
           System.out.println("Bienvenido");
       }

//paso3
       int cifra = 950;

       if (cifra >0 && cifra <500){
           System.out.println("Rango menor");
       }

       if (cifra >501 && cifra <2000){
           System.out.println("Rango Medio");

       }

       if (cifra > 2000 && cifra <10000){
           System.out.println("Rango superior");

       }
       else if(cifra <0 && cifra >10000) {
           System.out.println("Rango invalido");

       }


       //paso4
       String respuesta = "";
       int n = 25;

       if (n > 0 && n <100){
          respuesta = "SI";

       }
       else {
           respuesta = "NO";
       }


       //paso5

       boolean encendido = true;
       int cantidad = 0;

       if (encendido){

           if (cantidad == 20){
               System.out.println("Correcto");
           }
           else {
               System.out.println("Incorrecto");
           }
       }


    }













}

