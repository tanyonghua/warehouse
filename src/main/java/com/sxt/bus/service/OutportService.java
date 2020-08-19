package com.sxt.bus.service;

import com.sxt.bus.domain.Outport;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mr谭
 * @since 2020-08-19
 */
public interface OutportService extends IService<Outport> {


    void addOutPort(Integer id, Integer number, String remark);
}
