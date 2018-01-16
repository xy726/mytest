package cn.itcast.core.po;

import java.util.Date;

/**
 * @ClassName: User 
 * @Description: 用户pojo
 * @author xy
 *
 */
public class User {
    private Integer id;
    private String name;
    private Date birthday;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}

}