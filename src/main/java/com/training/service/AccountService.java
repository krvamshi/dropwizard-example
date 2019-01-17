package com.training.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/accountService")
public class AccountService {


  @POST
  @Path("/create")
  public String createAccount(@FormParam("name") String name){
    return "Account Created for "+name;
  }

  @GET
  @Path("/get")
  public String getAccount(){
    return "Account Number: 001";
  }

}

