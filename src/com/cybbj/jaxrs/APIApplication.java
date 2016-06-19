/**   
 * 类名：APIApplication
 *
 */
package com.cybbj.jaxrs;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.cybbj.action.HelloResource;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/** 
 * APIApplication: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-6-19 v1.0 15989 新建 
 */
public class APIApplication extends ResourceConfig {
	public APIApplication() {
		//加载Resource
		register(HelloResource.class);
		//注册数据转换
		register(JacksonJsonProvider.class);
		//Logging..
		register(LoggingFilter.class);
	}
}
