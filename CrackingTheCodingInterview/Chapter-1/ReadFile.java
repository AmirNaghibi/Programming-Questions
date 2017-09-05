import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class ReadFile{
	private static final String FILEPATH = "/Users/amirmehdinaghibi/Desktop/sampleText.txt";
	String currentLine;

	FileReader fr=null;
	BufferedReader br=null;

	void read(String filePath){
		try{
			br = new BufferedReader(new FileReader(filePath));
			while((currentLine=br.readLine()) != null){
				System.out.println(currentLine);
			}
		}catch(IOException e){
			e.printStackTrace();
		}

		finally{
			try{
				if (br!=null) br.close();
				if (fr!=null) fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}	

	public static void main(String[] args) {
		ReadFile obj = new ReadFile();
		obj.read(FILEPATH);
	}
}