package org.jboss.galleon.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class Resource {

    @GET
    @Produces({"application/json"})
    public Message getMessage() {
        return new Message();
    }
}
