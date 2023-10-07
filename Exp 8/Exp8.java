package exp8;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class PC{
	String data;
	synchronized void get(String data) {
		this.data = data;
		System.out.println("Producer: "+ data);
		notify();
		try {
			wait();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
	}
	synchronized void put() {
		System.out.println("Consumer: "+ data);
		notify();
		try {
			wait();
		}
		catch(InterruptedException ex) {
			System.out.println(ex);
		}
	}
}
public class Exp8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PC pc= new PC();
		System.out.print("Enter a String: ");
		String s = br.readLine();
		String ss[]= s.split(" ");
		Thread producer = new Thread(
				new Runnable() {
					public void run() {
						for(String i: ss) {
							pc.get(i);
						}
					}
				}
				);
		Thread consumer = new Thread(
				new Runnable() {
					public void run() {
						for(int i = 0; i < ss.length; i++) {
							pc.put();
						}
					}
				}
				);
		producer.start();
		consumer.start(); 
    }
    
}
