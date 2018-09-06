package io.renren.modules.sys.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.renren.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author jingke
 * @email
 * @date 2017-03-08 10:40:56
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
