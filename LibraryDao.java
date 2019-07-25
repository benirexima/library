package com.library.dao;

import java.util.ArrayList;
import org.apache.tomcat.jni.Library;
import org.springframework.stereotype.Component;

@Component
public class LibraryDao {

	ArrayList<Library> array=new ArrayList<>();	
	public Library create(Library library) {
		array.add(library);
		return library; 
}
	public static void del(int bookId) {
		LibraryDao.del(bookId);
	}

}
