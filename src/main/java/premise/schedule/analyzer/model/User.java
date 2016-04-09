package premise.schedule.analyzer.model;

import javax.persistence.Table;

@Table(name="user")
public class User {
	
	Long id;
	
	String name;
	
	String username;
	
	Byte password; //check type on this -- mysql blob
	
	Role role;
	
	boolean needsChange;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Byte getPassword() {
		return password;
	}

	public void setPassword(Byte password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isNeedsChange() {
		return needsChange;
	}

	public void setNeedsChange(boolean needsChange) {
		this.needsChange = needsChange;
	}
}
