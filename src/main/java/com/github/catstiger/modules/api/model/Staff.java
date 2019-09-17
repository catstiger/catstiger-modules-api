package com.github.catstiger.modules.api.model;

import java.io.Serializable;

public interface Staff extends Serializable {
  /**
   * 返回Staff ID
   */
  Long getId();
  
  /**
   * 返回对应的用户ID
   */
  Long getUserId();
  
  /**
   * 返回Staff Name
   */
  String getName();
  
  /**
   * 返回对应的Username
   */
  String getUsername();
  
  /**
   * 联系电话
   */
  String phone();
  
  /**
   * 返回所在部门
   */
  Department getDepartment();
}
