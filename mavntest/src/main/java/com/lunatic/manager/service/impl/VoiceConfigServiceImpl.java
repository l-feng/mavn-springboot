
/**    
* @Title: VoiceConfigServiceImpl.java  
* @Package com.tocel.multimedia.manage.service.impl  
* @Description: TODO(用一句话描述该文件做什么)  
* @author 刘峰    
* @date 2018年4月27日 下午4:31:50  
* @version V3.0    
*/  

package com.lunatic.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lunatic.manager.second.dao.VoiceConfigMapper;
import com.lunatic.manager.second.doman.VoiceConfig;
import com.lunatic.manager.service.IVoiceConfigService;




/**    
 * @Title: VoiceConfigServiceImpl.java  
 * @Package com.tocel.multimedia.manage.service.impl  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author 刘峰    
 * @date 2018年4月27日 下午4:31:50  
 * @version V2.0    
 */
@Service("iVoiceConfigService")
public class VoiceConfigServiceImpl implements IVoiceConfigService{

	@Autowired
	private VoiceConfigMapper voiceConfigMapper;
	/** (非 Javadoc)  
	*   
	*   
	* @param voiceConfig
	* @return  
	* @see com.tocel.multimedia.manage.service.IVoiceConfigService#update(com.tocel.partrol.manage.mul.domain.multimedia.manage.domain.VoiceConfig)  
	*/
	@Override
	public int update(VoiceConfig voiceConfig) {
		
		return voiceConfigMapper.updateByPrimaryKeySelective(voiceConfig);
	}

	
	/** (非 Javadoc)  
	*   
	*   
	* @param voiceConfig
	* @return  
	* @see com.tocel.multimedia.manage.service.IVoiceConfigService#add(com.tocel.partrol.manage.mul.domain.multimedia.manage.domain.VoiceConfig)  
	*/
	@Override
	public int add(VoiceConfig voiceConfig) {
		
		return voiceConfigMapper.insertSelective(voiceConfig);
	}


	
	/** (非 Javadoc)  
	*   
	*   
	* @return  
	* @see com.tocel.multimedia.manage.service.IVoiceConfigService#selectVoiceConfig()  
	*/
	@Override
	public VoiceConfig selectVoiceConfig() {
		
		return voiceConfigMapper.selectVoiceConfig();
	}

}
