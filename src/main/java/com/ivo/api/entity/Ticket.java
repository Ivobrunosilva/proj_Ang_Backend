package com.ivo.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.ivo.api.enums.StatusEnum;
import com.ivo.api.enums.PriorityEnum;

@Document
public class Ticket {

	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public StatusEnum getStatus() {
		return status;
	}
	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	public PriorityEnum getPriority() {
		return priority;
	}
	public void setPriority(PriorityEnum priority) {
		this.priority = priority;
	}
	public User getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(User assignedUser) {
		this.assignedUser = assignedUser;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<ChangeStatus> getChanges() {
		return changes;
	}
	public void setChanges(List<ChangeStatus> changes) {
		this.changes = changes;
	}
	private Date data;
	private String title;
	private Integer number;
	private StatusEnum status;
	private PriorityEnum priority;
	@DBRef(lazy = true)
	private User assignedUser;
	private String description;
	private String image;
	private List<ChangeStatus>changes;
}
