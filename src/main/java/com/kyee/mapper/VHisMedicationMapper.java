package com.kyee.mapper;

import com.kyee.model.VHisMedication;
import java.util.List;

public interface VHisMedicationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_MEDICATION
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String medicationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_MEDICATION
     *
     * @mbggenerated
     */
    int insert(VHisMedication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_MEDICATION
     *
     * @mbggenerated
     */
    VHisMedication selectByPrimaryKey(String medicationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_MEDICATION
     *
     * @mbggenerated
     */
    List<VHisMedication> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table V_HIS_MEDICATION
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(VHisMedication record);
}