/*
	User concurrent class to dely your program
*/

import java.util.concurrent.TimeUnit;

public class Timer{
	

	public static void main(String[] args) {
		int i=1;

		while(i<11){
			System.out.println(i);
			// sleep for 1 seconds
			try{
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i++;
		}
	}
}