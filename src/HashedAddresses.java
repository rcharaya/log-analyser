import java.util.HashMap;



public class HashedAddresses {
	
	private static HashMap<String, Integer> addressCount = new HashMap<String, Integer>();
	
	static void addEntry(String address){
		if(addressCount.containsKey(address)){
			addressCount.put(address, addressCount.get(address)+1);
		} else{
			addressCount.put(address, 1);
		}
	}
	
	static Object[] getTopK(int k){
		MyPriorityQueue myPriorityQueue = new MyPriorityQueue(k);
		for(String address : addressCount.keySet()){
			myPriorityQueue.addElement(new Record(address, addressCount.get(address)));
		}
		return myPriorityQueue.getElements();
	}

}
