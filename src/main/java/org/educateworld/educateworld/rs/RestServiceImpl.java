package org.educateworld.educateworld.rs;

import java.util.List;

import org.educateworld.educateworld.model.CoreJava;
import org.educateworld.educateworld.service.JavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestServiceImpl implements RestService {

	private final JavaService javaService;
	@Autowired
	public RestServiceImpl(JavaService javaService)
	{
		this.javaService = javaService;
	}
	
	@Override
	public List<String> ingestData(List<CoreJava> coreJava) {
		return javaService.ingestData(coreJava);
	}

	@Override
	public CoreJava getById(String id) {
		return javaService.getById(id);
	}

	@Override
	public List<String> updateData(List<CoreJava> coreJava) {
		return javaService.updateData(coreJava);
	}

	@Override
	public List<CoreJava> getData() {
		return javaService.getData();
	}

	@Override
	public String deleteById(String id) {
		return javaService.deleteById(id);
	}

	@Override
	public String deleteAll() {
		return javaService.deleteAll();
	}

}
