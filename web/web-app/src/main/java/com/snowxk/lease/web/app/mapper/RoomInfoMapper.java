package com.snowxk.lease.web.app.mapper;

import com.snowxk.lease.model.entity.RoomInfo;
import com.snowxk.lease.web.app.vo.room.RoomItemVo;
import com.snowxk.lease.web.app.vo.room.RoomQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @createDate 2023-07-26 11:12:39
* @Entity com.snowxk.lease.model.entity.RoomInfo
*/
@Mapper
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {


    IPage<RoomItemVo> pageItem(Page<RoomItemVo> page, RoomQueryVo queryVo);
}