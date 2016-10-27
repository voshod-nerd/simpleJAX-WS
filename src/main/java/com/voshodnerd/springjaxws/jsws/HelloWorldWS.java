/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.springjaxws.jsws;

import com.voshodnerd.springjaxws.interfaces.HelloWorldBo;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Талалаев
 */
@WebService
public class HelloWorldWS{

	//DI via Spring
	HelloWorldBo helloWorldBo;

	@WebMethod(exclude=true)
	public void setHelloWorldBo(HelloWorldBo helloWorldBo) {
		this.helloWorldBo = helloWorldBo;
	}

	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld() {

		return helloWorldBo.getHelloWorld();

	}

}
