package cn.roc.mag.mapper;

import cn.roc.mag.entity.DmCeoDesktopT;

public interface DmCeoDesktopTMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(DmCeoDesktopT record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(DmCeoDesktopT record);

    /**
     *
     * @mbggenerated
     */
    DmCeoDesktopT selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DmCeoDesktopT record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DmCeoDesktopT record);
}