import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TopKFinder {

	static void preprocess(String filename){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;
			while((line = reader.readLine())!=null){
				String[] splits= line.split("\t");
				HashedIps.addEntry(splits[1]);
				HashedAddresses.addEntry(splits[2]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void printTopK(int k){
		Object[] topKIps = HashedIps.getTopK(k);
		Object[] topKAddresses = HashedAddresses.getTopK(k);
		for(int i=0;i<topKIps.length;i++){
			System.out.println(topKIps[i]);
		}
		for(int i=0;i<topKAddresses.length;i++){
			System.out.println(topKAddresses[i]);
		}
	}

}
