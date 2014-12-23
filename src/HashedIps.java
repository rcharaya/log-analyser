import java.util.HashMap;


public class HashedIps {

	//Thought of using a tree map but too expensive, will sort for each line input
	private static HashMap<String, Integer> ipCount = new HashMap<String, Integer>();

	static void addEntry(String ip){
		if(ipCount.containsKey(ip)){
			ipCount.put(ip, ipCount.get(ip)+1);
		} else{
			ipCount.put(ip, 1);
		}
	}
	
	static Object[] getTopK(int k){
		MyPriorityQueue myPriorityQueue = new MyPriorityQueue(k);
		for(String ip : ipCount.keySet()){
			myPriorityQueue.addElement(new Record(ip, ipCount.get(ip)));
		}
		return myPriorityQueue.getElements();
	}

}
