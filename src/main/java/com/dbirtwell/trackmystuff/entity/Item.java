package com.dbirtwell.trackmystuff.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Item extends BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;

//    @Column(name = "password", length = 255)
//    private String password;
    
    @Column(name = "description")
    @Type(type="text")
    private String description;

    public Item() {}

    
    public Item(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
    
    @Override
    public Long getId() {
        return id;
    }

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description
				+ "]";
	}



}