/**   
 * 类名：HelloResource
 *
 */
package com.cybbj.action;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

/** 
 * HelloResource: TODO请填写类描述
 * 
 * @version 1.0
 * @author 15989
 * @modified 2016-6-19 v1.0 15989 新建 
 */
@Controller(value="helloResource")
@Path("/hello")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	public String syaHello() {
		return "Hello Jersey";
	}
	
	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/testPutAndQueryParam")
	public String testPutAndQueryParam(@DefaultValue("just a test") @QueryParam("desc") String desc) {
		return desc;
	}
	
	@POST
	//@Consumes(MediaType.MULTIPART_FORM_DATA)
	//@Produces(MediaType.MULTIPART_FORM_DATA)
	@Consumes("application/x-www-form-urlencoded")
	//@Produces("application/x-www-form-urlencoded")
	@Path("/testPutAndQueryParam")
	public String testPutAndQueryParam2(@DefaultValue("just a test") @FormParam("desc") String desc,@DefaultValue("just a test") @FormParam("desc2") String desc2) {
		System.out.println(">>desc: " + desc + "\t>>>desc2: " + desc2);
		return desc;
	}
}
