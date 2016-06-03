package com.fm.common.routes;

import com.fm.admin.AdminController;
import com.jfinal.config.Routes;

/**
 * 管理员路由
 * @author Administrator
 *
 */
public class AdminRoutes extends Routes{

	@Override
	public void config() {
		add("/admin",AdminController.class);
	}

}
