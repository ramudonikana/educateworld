package org.educateworld.educateworld.service;

import java.util.List;

import org.educateworld.educateworld.model.CoreJava;

public interface JavaService {

	List<String> ingestData(List<CoreJava> corejava);

	CoreJava getById(String id);

	String deleteAll();

	List<String> updateData(List<CoreJava> coreJava);

	List<CoreJava> getData();

	String deleteById(String id);

}
