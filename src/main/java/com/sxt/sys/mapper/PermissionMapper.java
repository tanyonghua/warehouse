package com.sxt.sys.mapper;

import com.sxt.sys.domain.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mr谭
 * @since 2020-08-11
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    void deleteRolePermissionByPid(Serializable id);
}
