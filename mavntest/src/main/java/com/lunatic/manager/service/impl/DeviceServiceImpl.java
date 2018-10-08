/**    
 * @Title: DeviceManageServiceImpl.java  
 * @Package com.tocel.partrol.manage.service.impl  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author 彭佳俊     
 * @date 2018年4月10日 下午3:30:14  
 * @version V2.0    
 */

package com.lunatic.manager.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lunatic.framework.service.BaseService;
import com.lunatic.manager.primary.dao.DeviceMapper;
import com.lunatic.manager.primary.doman.Device;
import com.lunatic.manager.service.DeviceService;


@Service("deviceService")
public class DeviceServiceImpl extends BaseService implements DeviceService {
	@Autowired
	private DeviceMapper deviceMapper;
	public List<Device> getAllDeviceList() {
		
		return deviceMapper.selectAllDeviceList();
	}

}