/**    
* @Title: TerminalController.java  
* @Package com.tocel.multimedia.manage.controller  
* @Description: TODO(用一句话描述该文件做什么)  
* @author 彭佳俊     
* @date 2018年4月19日 下午2:21:04  
* @version V3.0    
*/

package com.lunatic.manager.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lunatic.manager.dto.ResultDTO;
import com.lunatic.manager.second.doman.VoiceConfig;
import com.lunatic.manager.service.IVoiceConfigService;



@RestController
@RequestMapping("/api/mm/v1")
@Api(consumes = "application/json", produces = "application/json", protocols = "http", value = "终端管理")
public class VoiceController {

	@Autowired
	private IVoiceConfigService iVoiceConfigService;

	

	@RequestMapping(value = "/terminal/getVoice", method = RequestMethod.GET)
	@ApiOperation(value = "获取voice", notes = "获取voice")
	@ResponseBody
	public ResultDTO getVoice() {
		VoiceConfig voice = iVoiceConfigService.selectVoiceConfig();
		if (voice == null) {
			return ResultDTO.ok("获取失败");
		} else {
			return ResultDTO.ok(voice);
		}
	}
}
