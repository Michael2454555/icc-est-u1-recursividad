public class EjerciciosRecursivos {
    public int fibonacci(int n ){
        if (n<=1){
            return n;

        } 
        return fibonacci(n-1) + fibonacci(n-2);
    }





    public int sumaConsecutivos(int n){
        if (n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n + resultadoParcial;
        return resultado;

    }



    public int getPotencia( int base, int exponente ){
        if(exponente == 0){
            return  base=1;
        }
        
        int resultadoPotencia = base * getPotencia(base, exponente-1);
        
        return resultadoPotencia;

    }
    public int getSumaDigitos(int n ){
        if( n < 10){
            return n;
        }else {
            int num = n % 10;
            int num2 = n/10;
            
            return getSumaDigitos(num2) + num;
            
        }
        
       
        
        
        
    }
    public int numerosDescendente (int n ){
        if (n==0){
            return 1;
    }else{

         System.out.print(n+" ");
        int resultadoDescendente =  numerosDescendente(n-1);
        return resultadoDescendente;
    }

    }


    public int reverso(int n, int invertido){
         if (n == 0 ){
            return invertido;

            
         }else {
            int numer = n % 10; 
            int  numero = n / 10;
            int numer3 = invertido * 10 ;
            return reverso(numero ,numer + numer3 );
         }
    }
    

    
}
