package co.ramirolynch.hibernate_proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BATCH")
public class Batch {
	@Id
	//@GeneratedValue
	@Column
	private Integer batchId;
	@Column
	private String course;
	@ManyToOne
	@JoinColumn(name = "facultyId")
	private Faculty faculty;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Batch(Integer batchId, String course, Faculty faculty) {
		super();
		this.batchId = batchId;
		this.course = course;
		this.faculty = faculty;
	}
	
	public Batch(String course, Faculty faculty) {
		super();
		this.course = course;
		this.faculty = faculty;
	}
	public Integer getBatchId() {
		return batchId;
	}
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	

}
