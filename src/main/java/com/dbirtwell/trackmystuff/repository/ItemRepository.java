package com.dbirtwell.trackmystuff.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbirtwell.trackmystuff.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

	// By defining this, the methods will be implemented by Spring Data
	// it sees an entity of this name "name" and uses it
	public Item findByName(String name);
}