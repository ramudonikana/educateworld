package org.educateworld.educateworld.service;

import java.util.List;
import java.util.stream.Collectors;

import org.educateworld.educateworld.dao.DataBaseRepository;
import org.educateworld.educateworld.model.CoreJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JavaServiceImpl implements JavaService{

	private DataBaseRepository dataBaseRepository;
	@Autowired
	public JavaServiceImpl(DataBaseRepository dataBaseRepository)
	{
		this.dataBaseRepository = dataBaseRepository;
	}
	
	@Override
	public List<String> ingestData(List<CoreJava> coreJava) {
		dataBaseRepository.saveAll(coreJava);
		return coreJava.stream().map(CoreJava::getId).collect(Collectors.toList());
	}

	@Override
	public CoreJava getById(String id) {
		return dataBaseRepository.getById(id);
	}

	@Override
	public String deleteAll() {
		dataBaseRepository.deleteAll();
		return "Successfully Deleted all Data";
	}

	@Override
	public List<String> updateData(List<CoreJava> coreJava) {
		dataBaseRepository.saveAll(coreJava);
		return coreJava.stream().map(CoreJava::getId).collect(Collectors.toList());
	}

	@Override
	public List<CoreJava> getData() {
		
		return dataBaseRepository.findAll();
	}

	@Override
	public String deleteById(String id) {
		dataBaseRepository.deleteById(id);
		return "Successfully Deleted Data";
	}

	

}
