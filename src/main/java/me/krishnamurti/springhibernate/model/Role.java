package me.krishnamurti.springhibernate.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="role")
public class Role extends BaseEntity{
	
	@Column(name="role", nullable = false, unique = true)
	private String role;
	
//	@ManyToMany
//    @JoinTable(
//            name="USER_ROLE",
//            joinColumns = @JoinColumn(name="user_id"),
//            inverseJoinColumns = @JoinColumn(name="role_id")
//    )
	@ManyToMany(mappedBy = "roles", cascade=CascadeType.ALL)
	private Set<User> users;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return role;
	}
	
	
	
	
}
