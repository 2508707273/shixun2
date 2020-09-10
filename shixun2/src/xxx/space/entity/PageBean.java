package xxx.space.entity;

import java.util.List;

public class PageBean<T> {
	private int currentPage;
	private int pageSize;
	private List<T> lists;
	private int count;
	private int totalPage;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<T> getLists() {
		return lists;
	}
	public void setLists(List<T> lists) {
		this.lists = lists;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public PageBean(int currentPage, int pageSize, List<T> lists, int count, int totalPage) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.lists = lists;
		this.count = count;
		this.totalPage = totalPage;
	}
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", pageSize=" + pageSize + ", lists=" + lists + ", count="
				+ count + ", totalPage=" + totalPage + "]";
	}
	
}
