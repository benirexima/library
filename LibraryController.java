package com.library.controller;

import org.apache.tomcat.jni.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.service.LibraryService;

@RequestMapping("library")
@RestController

public class LibraryController {
	@Autowired
	LibraryService libraryService;
	
	@PostMapping("create")
	private Library create(@RequestBody Library library) {
		return libraryService.create(library);
		
	}

     @DeleteMapping("delete/{bookId}")
	private void delete(@PathVariable("bookId")int bookId) {
		libraryService.delete(bookId);
	} 
}
