package com.dbirtwell.trackmystuff;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dbirtwell.trackmystuff.entity.Item;
import com.dbirtwell.trackmystuff.repository.ItemRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrackMyStuffSpring1ApplicationTests {
	
	
	@Autowired
	private ItemRepository itemRepository;

	@Test
	public void findByNameTest() {
		
		Item item1 = new Item(1L, "item 1", "Sample item 1");
		Item item2 = new Item(1L, "item 2", "Sample item 2");
		Item item3 = new Item(1L, "item 3", "Sample item 3");
		Item item4 = new Item(1L, "item 4", "Sample item 4");
		Item item5 = new Item(1L, "item 5", "Sample item 5");
		
	
		itemRepository.save(item1);
		itemRepository.save(item2);
		itemRepository.save(item3);
		itemRepository.save(item4);
		itemRepository.save(item5);
		
		System.out.println(itemRepository.findByName("item 1"));		
	}	

}
