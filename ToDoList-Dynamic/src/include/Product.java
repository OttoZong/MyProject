package include;

public class Product {
	private Integer id;
	private String uid;
	private String todo;
	private String list;
	
	
	
	public Product() {
		super();

	}



	public Product(Integer id, String uid, String todo, String list) {
		super();
		this.id = id;
		this.uid = uid;
		this.todo = todo;
		this.list = list;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getUid() {
		return uid;
	}



	public void setUid(String uid) {
		this.uid = uid;
	}



	public String getTodo() {
		return todo;
	}



	public void setTodo(String todo) {
		this.todo = todo;
	}



	public String getList() {
		return list;
	}



	public void setList(String list) {
		this.list = list;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((todo == null) ? 0 : todo.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (todo == null) {
			if (other.todo != null)
				return false;
		} else if (!todo.equals(other.todo))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", uid=" + uid + ", todo=" + todo + ", list=" + list + "]";
	}

	
	
}
