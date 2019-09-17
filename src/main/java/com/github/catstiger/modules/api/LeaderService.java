package com.github.catstiger.modules.api;

import java.util.List;

import com.github.catstiger.modules.api.model.Department;
import com.github.catstiger.modules.api.model.Staff;

public interface LeaderService {

  /**
   * 讲一个用户设置为部门经理
   * 
   * @param staff 给出用户
   * @param Department 给出部门
   */
  void asManager(Staff staff, Department Department);

  /**
   * 设置为部门副总经理
   * 
   * @param staff 给出用户
   * @param Department 给出部门
   */
  void asViceManager(Staff staff, Department Department);

  /**
   * 解除领导职务
   * @param staff 被解除职务的员工
   * @param Department 部门
   */
  void depose(Staff staff, Department Department);

  /**
   * 解除某部门所有领导职务
   * @param Department 部门
   */
  void depose(Department Department);

  /**
   * 找到部门领导， 如果部门领导不存在，则返回emtpyList。本函数不会返回上级部门的领导。
   */
  List<Staff> findLeader(Department Department, Boolean isDeputy);

  /**
   * 找到部门领导(正职和副职)，如果当前部门没有领导，则取上级部门的领导，如果上级部门不存在，则返回emptyList
   */
  List<Staff> findLeader(Department Department);

  /**
   * 找到某个用户的领导，如果此用户是当前部门的总经理，则返回上级部门的经理； 如果此用户是当前部门的副经理
   * ，则返回当前部门的总经理。 如果当前部门是顶级部门，且未设置经理，则返回emptyList
   * 
   * @param staff 给出员工
   * @return
   */
  List<Staff> findLeader(Staff staff);

  /**
   * 判断一个用户是否是部门经理（正职）
   * 
   * @param staff Staff to be detected.
   * @return
   */
  Boolean isManager(Staff staff);

  /**
   * 判断用户是否是某个部门的经理
   */
  Boolean isManager(Staff staff, Department Department);

  /**
   * 寻找下属，不包括子部门
   * 
   * @param staff 领导
   * @return
   */
  List<Staff> findUnderling(Staff staff);

  /**
   * 判断一个用户是否是部门经理（正职）
   * 
   * @param staff Staff to be detected
   * @return
   */
  Boolean isViceManager(Staff staff);

  /**
   * 判断一个用户是否是某个部门的副经理
   */
  Boolean isViceManager(Staff staff, Department Department);

}
