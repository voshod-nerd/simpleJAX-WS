/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.voshodnerd.springjaxws.impl;

import com.voshodnerd.springjaxws.interfaces.HelloWorldBo;

/**
 *
 * @author Талалаев
 */
public class HelloWorldBoImpl implements HelloWorldBo{

	public String getHelloWorld(){
		return "JAX-WS + Spring!";
	}

}