package io.renren.modules.app.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.renren.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 * 
 * @author jingke
 * @email
 * @date 2017-03-23 15:22:06
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
