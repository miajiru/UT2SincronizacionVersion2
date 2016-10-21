package Ejercicio3.src;


public class CoffeeStore {
	    private String lastClient;
	    private volatile int soldCoffees;
	     
	    private void someLongRunningProcess() throws InterruptedException {
	        Thread.sleep(3000);
	    }
	     
	    synchronized public void buyCoffee(String client) throws InterruptedException {
	        someLongRunningProcess();
	        lastClient = client;
	        soldCoffees++;
	        System.out.println(client + " bought some coffee");
	    }
	     
	    public int countSoldCoffees() {return soldCoffees;}
	     
	    public String getLastClient() {return lastClient;}
}
