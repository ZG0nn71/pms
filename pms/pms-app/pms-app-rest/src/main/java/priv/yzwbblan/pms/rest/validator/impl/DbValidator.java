package priv.yzwbblan.pms.rest.validator.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import priv.yzwbblan.pms.rest.module.dao.UserMapper;
import priv.yzwbblan.pms.rest.module.model.User;
import priv.yzwbblan.pms.rest.validator.IReqValidator;
import priv.yzwbblan.pms.rest.validator.dto.Credence;

/**
 * 账号密码验证
 *
 * @author fengshuonan
 * @date 2017-08-23 12:34
 */
@Service
public class DbValidator implements IReqValidator {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean validate(Credence credence) {
        List<User> users = userMapper.selectList(new EntityWrapper<User>().eq("userName", credence.getCredenceName()));
        if (users != null && users.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
