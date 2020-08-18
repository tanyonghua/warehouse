package com.sxt.sys.service;

import com.sxt.sys.domain.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mr谭
 * @since 2020-08-13
 */
public interface RoleService extends IService<Role> {

    List<Integer> queryRolePermissionIdsByRid(@Param("roleId")Integer roleId);

    void saveRolePermission(@Param("id")Integer rid, @Param("id")Integer[] ids);


    void deleteRoleUserByUid(@Param("id") Serializable id);

    List<Integer> queryUserRoleIdsByUid(@Param("id")Integer id);
}
