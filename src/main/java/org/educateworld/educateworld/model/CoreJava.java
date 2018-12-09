package org.educateworld.educateworld.model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CoreJava {

	@javax.persistence.Id
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("topicName")
	private String topicName;
	
	@JsonProperty("description")
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
