package com.github.catstiger.modules.api;

import java.util.List;

import com.github.catstiger.modules.api.model.Staff;

public interface StaffService {
  /**
   * 根据username得到staff实例
   */
  Staff byUsername(String username);

  /**
   * 根据phone得到staff实例
   */
  Staff byPhone(String phone);

  /**
   * 新增或者保存一个内部员工
   * @param roles 分配给员工的角色
   */
  Staff save(Staff model, String... roles);

  /**
   * 删除员工（标记为已经删除）
   */
  void delete(Long staffId);

  /**
   * 根据企业ID，查询企业中所有员工
   * 
   * @param corpId 企业ID
   * @return List of staff
   */
  List<Staff> queryByCorp(Long corpId);

  /**
   * 根据ID，获取单个记录。会抓取所有的字段，并支持以ID为key的缓存
   * 
   * @param id 主键
   * @return
   */
  Staff get(Long id);
}
