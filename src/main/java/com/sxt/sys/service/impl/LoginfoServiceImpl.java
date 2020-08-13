package com.sxt.sys.service.impl;

import com.sxt.sys.domain.Loginfo;
import com.sxt.sys.mapper.LoginfoMapper;
import com.sxt.sys.service.LoginfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mr谭
 * @since 2020-08-11
 */
@Service
@Transactional
public class LoginfoServiceImpl extends ServiceImpl<LoginfoMapper, Loginfo> implements LoginfoService {

}
