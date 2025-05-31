package pack1;

import java.util.List;

public class Users {
	private List<userPojo> users;

	public Users(List<userPojo> users) {
		this.users = users;
	}

	public List<userPojo> getUsers() {
		return users;
	}

	public void setUsers(List<userPojo> users) {
		this.users = users;
	}
	
	}
