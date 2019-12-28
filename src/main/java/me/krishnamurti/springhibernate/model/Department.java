package me.krishnamurti.springhibernate.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "department")
public class Department extends BaseEntity {

	@Column(name = "department_name", nullable = false, unique = true)
	private String departmentName;
	
//	@OneToMany(mappedBy = "department")
//	private Set<User> users;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

//	public Set<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(Set<User> users) {
//		this.users = users;
//	}
	
	
}
