
public class Record implements Comparable<Record>{
	
	String key;
	Integer count;
	
	public Record() {
		// TODO Auto-generated constructor stub
	}
	
	public Record(String key, Integer count) {
		this.key=key;
		this.count=count;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Override
	public int compareTo(Record o) {
		return count.compareTo(o.getCount());
	}
	
	@Override
	public String toString() {
		return key+":"+count;
	}
	
}
