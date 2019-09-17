package com.github.catstiger.modules.api.model;

import java.io.Serializable;

public interface Leader extends Serializable {
  /**
   * 返回Leader ID
   */
  Long getId();
  
  /**
   * 返回Leader对应的{@link Leader}
   */
  Staff getStaff();
  
  /**
   * 返回所在部门
   */
  Department getDepartment();
  
  /**
   * 是否副职
   */
  Boolean isDeputy();
}
