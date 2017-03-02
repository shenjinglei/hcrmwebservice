package com.kyee.mapper;

import com.kyee.model.VHisUsersInfo;
import java.util.List;

public interface VHisUsersInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_USERS_INFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_USERS_INFO
     *
     * @mbggenerated
     */
    int insert(VHisUsersInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_USERS_INFO
     *
     * @mbggenerated
     */
    VHisUsersInfo selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_USERS_INFO
     *
     * @mbggenerated
     */
    List<VHisUsersInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_USERS_INFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VHisUsersInfo record);
}