package cn.roc.mag.mapper;

import cn.roc.mag.entity.DmOrderAreaSumF;

public interface DmOrderAreaSumFMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(DmOrderAreaSumF record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(DmOrderAreaSumF record);

    /**
     *
     * @mbggenerated
     */
    DmOrderAreaSumF selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DmOrderAreaSumF record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DmOrderAreaSumF record);
}