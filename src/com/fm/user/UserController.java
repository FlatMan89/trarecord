package com.fm.user;

import com.jfinal.core.Controller;

public class UserController extends Controller{
	public void index(){
		render("list.html");
	}
}
