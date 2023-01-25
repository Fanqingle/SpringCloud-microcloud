package com.yootk.service;

import com.yootk.common.dto.DeptDTO;

import java.util.List;
import java.util.Map;

/**
 * @author qingle
 * @description
 * @date 2023/1/26
 */

public interface IDeptService {
    /**
     * @param id
     * @return
     */
    public DeptDTO get(long id);

    public boolean add(DeptDTO dto);

    public List<DeptDTO> list();

    public Map<String, Object> split(int currentPage, int lineSize, String column, String keyword);

}
