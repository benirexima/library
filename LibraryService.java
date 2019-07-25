package com.library.service;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.dao.LibraryDao;


@Component
public class LibraryService {

	@Autowired
	LibraryDao libraryDao;

	public Library create(Library library) {
		return libraryDao.create(library);
}

	public void delete(int bookId) {
		
		libraryDao.del(bookId);
		
	}
    
    
}
