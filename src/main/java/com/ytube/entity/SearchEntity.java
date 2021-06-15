package com.ytube.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

//import io.swagger.annotations.ApiModelProperty;
 
@Entity
@Table(name = "video")
public class SearchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
   // @ApiModelProperty(value="Video Url",required=true)
    @NotBlank
    @Column(name = "url")
    private String url;
    
    
   // @ApiModelProperty(value="Description",required=true)
    @NotBlank
    @Size(min = 3, max = 30,message="Description length must be between 3 and 30")
    @Column(name = "description")
    private String description;
    
    
   // @ApiModelProperty(value="Tags",required=true)
    @NotBlank
    @Size(min = 3, max = 30,message="Description length must be between 3 and 30")
    @Column(name = "tags")
    private String tags;

    public SearchEntity() {

    }
 
    public SearchEntity(int id, String url, String description, String tags) {
		super();
		this.id = id;
		this.url = url;
		this.description = description;
		this.tags = tags;
	}

	public long getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public String getTags() {
        return tags;
    }
 
    public void setTags(String tags) {
        this.tags = tags;
    }
 
    public String getUrl() {
        return url;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    

}
