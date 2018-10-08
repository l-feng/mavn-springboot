/**    
 * @Title: DeviceController.java  
 * @Package com.tocel.partrol.manage.controller  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author 彭佳俊     
 * @date 2018年4月10日 下午3:06:31  
 * @version V2.0    
 */

package com.lunatic.manager.controller;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lunatic.framework.controller.BaseController;
import com.lunatic.manager.dto.ResultDTO;
import com.lunatic.manager.primary.doman.Device;
import com.lunatic.manager.service.DeviceService;



@Controller
@RequestMapping("/wapi")
@Api(consumes = "application/json", produces = "application/json", protocols = "http", value = "设备管理")
public class DeviceController extends BaseController {



	@Autowired
	private DeviceService deviceManageservice;

	
	@RequestMapping(value = "/device/getAllDevice", method = RequestMethod.GET)
	@ApiOperation(value = "查询所有的设备信息", notes = "查询所有的设备信息")
	@ResponseBody
	public ResultDTO getAllDevice() {
		try {
			List<Device> deviceList= deviceManageservice.getAllDeviceList();
			return ResultDTO.ok(deviceList);
		} catch (Exception e) {
			return ResultDTO.error(500, "服务器端发生错误");
		}
	}
	
}
