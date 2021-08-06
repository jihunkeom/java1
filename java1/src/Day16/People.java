package Day16;

public class People <T> {
	
	private String title;
	private T[] list;
	
	public People(String title,  int num) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.list = (T[]) new Object[num];
	}
	
	public void add(T cla) {
		for (int i=0; i<list.length; i++) {
			if (list[i]==null) {
				list[i] = cla;
			}
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public T[] getList() {
		return list;
	}

	public void setList(T[] list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}
	
	

}
