package com.example.demo.model;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	String name, problem;
	Integer id,age,notAttendedyet,seen,updated,cancelled;
	
	public Patient(){
		
	}

	public Patient(Integer id, String name, Integer age, String problem, Integer notAttendedyet, Integer seen,
			Integer updated, Integer cancelled) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.problem = problem;
		this.notAttendedyet = notAttendedyet;
		this.seen = seen;
		this.updated = updated;
		this.cancelled = cancelled;
	}

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public Integer getNotAttendedyet() {
		return notAttendedyet;
	}

	public void setNotAttendedyet(Integer notAttendedyet) {
		this.notAttendedyet = notAttendedyet;
	}

	public Integer getSeen() {
		return seen;
	}

	public void setSeen(Integer seen) {
		this.seen = seen;
	}

	public Integer getUpdated() {
		return updated;
	}

	public void setUpdated(Integer updated) {
		this.updated = updated;
	}

	public Integer getCancelled() {
		return cancelled;
	}

	public void setCancelled(Integer cancelled) {
		this.cancelled = cancelled;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", problem=" + problem + ", notAttendedyet="
				+ notAttendedyet + ", seen=" + seen + ", updated=" + updated + ", cancelled=" + cancelled + "]";
	}
	
}
