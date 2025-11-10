import java.io.IOException;

public class DemoThrows {

	public static void main(String[] args) { //throws IOException if i write this here also then it crash the program does not handle the exception so here we can write try catch block
		// TODO Auto-generated method stub
		
		//IOException e = new IOException();//it is commmented because in try catch block thows an error
		
		//throw e; if only write this it shows an error for this we need to handle exception
		
		//handling exception
		/*try {
		throw e;
		}
		catch(IOException ex){
			
		}
		*/
		
	//	readFile(); only writing this in above "throws IOException" then it shows error
		
		try {
			readFile();
		}
		catch(IOException e) {
			
		}
		
	}
	static void readFile() throws IOException{
		IOException e = new IOException();
		throw e; //exception is generate here but it propogate by main method by writing this throws IOException
		
	}

}
