package com.nxtorbis.advocatemgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientsController {
	@RequestMapping(method = RequestMethod.GET,path = "/clients")
	public String createClient()
	{
		return "Service invoked";
	}

}
