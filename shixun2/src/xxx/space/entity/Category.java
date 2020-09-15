package xxx.space.entity;

import java.util.List;

public class Category {
	private int id;//子目录
	private String name;
	private String alias;//类目别名
	private int p_id;//父级目录
	private int order_weight;
	private List<Category> childrenList;
	public List<Category> getChildrenList() {
		return childrenList;
	}
	public void setChildrenList(List<Category> childrenList) {
		this.childrenList = childrenList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getOrder_weight() {
		return order_weight;
	}
	public void setOrder_weight(int order_weight) {
		this.order_weight = order_weight;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", alias=" + alias + ", p_id=" + p_id + ", order_weight="
				+ order_weight +", childrenList=" + childrenList + "]";
	}
	public Category(int id, String name, String alias, int p_id, int order_weight) {
		super();
		this.id = id;
		this.name = name;
		this.alias = alias;
		this.p_id = p_id;
		this.order_weight = order_weight;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
