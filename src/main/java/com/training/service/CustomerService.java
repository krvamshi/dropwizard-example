package com.training.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customerService")
public class CustomerService {
  @POST
  @Path("/create")
  public String createCustomer(@FormParam("name") String name){
    return "Customer Created for "+name;
  }

  @GET
  @Path("/get")
  public String getCustomer(){
    return "Customer Number: 001";
  }
}
