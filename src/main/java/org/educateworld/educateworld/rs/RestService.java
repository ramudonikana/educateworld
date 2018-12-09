package org.educateworld.educateworld.rs;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.educateworld.educateworld.model.CoreJava;

@Produces({MediaType.APPLICATION_JSON})
@Path("/service")
public interface RestService {

	@POST
	@Path("/ingestData")
	List<String> ingestData(List<CoreJava> coreJava);
	
	@PUT
	@Path("/updateData")
	List<String> updateData(List<CoreJava> coreJava);
	
	@GET
	@Path("/getById")
	CoreJava getById(@QueryParam("id") String id);
	
	@GET
	@Path("/getData")
	List<CoreJava> getData();
	
	@DELETE
	@Path("/deleteById")
	String deleteById(@QueryParam("id") String id);
	
	@DELETE
	@Path("/deleteAll")
	String deleteAll();
	
}
