package com.fm.wechat;

import com.jfinal.core.Controller;

public class WeChatController extends Controller{
	public void index(){
		String userid = getSessionAttr("userid");
		if(userid!=null){
			render("home.html");
		}else{
			render("login.html");
		}
		
	}
	
	public void login(){
		boolean loginin = true;
		if(loginin){
			setSessionAttr("userid", "123");
		}
		redirect("/wechat");
	}
	
	public void list(){
		render("list.html");
	}
}
