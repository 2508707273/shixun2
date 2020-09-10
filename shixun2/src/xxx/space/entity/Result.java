package xxx.space.entity;

public class Result {
	private int state;			//状态
	private String message;		//信息
	public Result() {
		super();
	}
	public Result(int state, String message) {
		super();
		this.state = state;
		this.message = message;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [state=" + state + ", message=" + message + "]";
	}
}
