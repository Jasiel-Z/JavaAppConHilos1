public class Programa1 extends Thread{
    
    public void run(){
        System.out.println(Thread.currentThread().getName()+ " subproceso corriendo...");
    }    

    public static void main(String[] args){
        Programa1 hilo = new Programa1();
        hilo.start();
        System.out.println("Este código está fuera del hilo");
    }

}