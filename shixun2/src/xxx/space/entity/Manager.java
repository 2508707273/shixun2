package xxx.space.entity;

import java.util.Date;
/**
 * insert into manager VALUES(20171681,'zhangsan',123456,'zhangsan',
 * 'asdvj','zhangsan@qq.com','2008-09-10',1,
 * '头像',15693921222,'memo','2020-09-10')
 * @author xiexi
 *
 */
public class Manager {
	private int id;
    
	private String lname;
    private String pwd;
    private String salt;
    private String email;
    private Date joined_date;
    private int status;
    private String avatar;
    private String real_name;
    private Date create_time;
    private int author;
    private String tel;
    private String memo;
    public Manager() {
		// TODO Auto-generated constructor stub
	}
    public Manager(int id, String lname, String pwd, String salt, String email, Date joined_date, int status,
			String avatar, String real_name, Date create_time, int author, String tel, String memo) {
		super();
		this.id = id;
		this.lname = lname;
		this.pwd = pwd;
		this.salt = salt;
		this.email = email;
		this.joined_date = joined_date;
		this.status = status;
		this.avatar = avatar;
		this.real_name = real_name;
		this.create_time = create_time;
		this.author = author;
		this.tel = tel;
		this.memo = memo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getJoined_date() {
		return joined_date;
	}
	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", lname=" + lname + ", pwd=" + pwd + ", salt=" + salt + ", email=" + email
				+ ", joined_date=" + joined_date + ", status=" + status + ", avatar=" + avatar + ", real_name="
				+ real_name + ", create_time=" + create_time + ", author=" + author + ", tel=" + tel + ", memo=" + memo
				+ "]";
	}
    
}
