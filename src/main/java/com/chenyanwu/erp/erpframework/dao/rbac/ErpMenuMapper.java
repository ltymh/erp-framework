package com.chenyanwu.erp.erpframework.dao.rbac;

import java.util.List;

import com.chenyanwu.erp.erpframework.entity.dtree.Dtree;
import com.chenyanwu.erp.erpframework.entity.rbac.ErpMenu;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
* <p>
    * </p>
*
* @author chenyanwu
* @date 2019-02-27 11:15:03
* @version
*/
//@org.apache.ibatis.annotations.Mapper
public interface ErpMenuMapper extends Mapper<ErpMenu>,InsertListMapper<ErpMenu> {

    List<Dtree> getSysRoleTreeMenus(@Param("roleId") String roleId);

}