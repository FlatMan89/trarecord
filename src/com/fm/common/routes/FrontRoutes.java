package com.fm.common.routes;

import com.fm.index.IndexController;
import com.fm.user.UserController;
import com.fm.wechat.WeChatController;
import com.jfinal.config.Routes;

/**
 * 前端路由
 * @author Administrator
 *
 */
public class FrontRoutes extends Routes{

	@Override
	public void config() {
		add("/",IndexController.class);
		add("/user",UserController.class);
		add("/wechat",WeChatController.class);
	}

}
