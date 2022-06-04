package com.abc.hotelbooking.dto;

import java.util.Objects;

public class FeedbackDTO {
	int id;
	String feedback;
	public FeedbackDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FeedbackDTO(int id, String feedback) {
		super();
		this.id = id;
		this.feedback = feedback;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public int hashCode() {
		return Objects.hash(feedback, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeedbackDTO other = (FeedbackDTO) obj;
		return Objects.equals(feedback, other.feedback) && id == other.id;
	}
	@Override
	public String toString() {
		return "FeedbackDTO [id=" + id + ", feedback=" + feedback + "]";
	}
	
	

}
