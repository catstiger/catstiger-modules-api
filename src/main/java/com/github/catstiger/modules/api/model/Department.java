package com.github.catstiger.modules.api.model;

import java.io.Serializable;

public interface Department extends Serializable {
  /**
   * 返回部门ID
   */
  Long getId();
  
  /**
   * 返回部门名称
   */
  String getName();
  
  /**
   * 返回上级部门，如果没有，返回{@code null}
   */
  Department getParent();
}
