import java.util.PriorityQueue;


public class MyPriorityQueue {

	private int size;

	private PriorityQueue<Record> priorityQueue;
	
	public MyPriorityQueue(int size) {
		this.size=size;
		priorityQueue = new PriorityQueue<Record>(size);
	}

	void addElement(Record record){
		if(priorityQueue.size()==size){
			if(priorityQueue.peek().getCount()<record.getCount()){
				priorityQueue.poll();
				priorityQueue.add(record);
			}
		} else{
			priorityQueue.add(record);
		}
	}
	
	Object[] getElements(){
		return priorityQueue.toArray();
	}
	
}
