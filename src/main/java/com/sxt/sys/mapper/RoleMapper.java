package com.sxt.sys.mapper;

import com.sxt.sys.domain.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mr谭
 * @since 2020-08-13
 */
public interface RoleMapper extends BaseMapper<Role> {

    void deleteRolePermissionByRid(Serializable id);

    void deleteRoleUserByRid(Serializable id);

    List<Integer> queryRolePermissionIdsByRid(Integer roleId);

    void saveRolePermission(Integer rid, Integer pid);

    List<Integer> queryUserRoleIdsByUid(Integer id);

    void deleteRoleUserByUid(Integer uid);

    @Insert("insert into sys_role_user(uid,rid) values(#{uid},#{rid})")
    void insertUserRole(Integer uid, Integer rid);
}
