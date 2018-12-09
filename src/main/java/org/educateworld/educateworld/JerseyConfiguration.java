package org.educateworld.educateworld;

import org.educateworld.educateworld.rs.RestServiceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
 
@Component
public class JerseyConfiguration extends ResourceConfig
{
    public JerseyConfiguration()
    {
        register(RestServiceImpl.class);
    }
}