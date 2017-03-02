package com.kyee.model;

import java.util.Date;

public class VHisLabInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.TEST_NO
     *
     * @mbggenerated
     */
    private String testNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.PATIENT_ID
     *
     * @mbggenerated
     */
    private String patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.PATIENT_NAME
     *
     * @mbggenerated
     */
    private String patientName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.VISIT_NO
     *
     * @mbggenerated
     */
    private String visitNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.INHOSPITAL_NO
     *
     * @mbggenerated
     */
    private String inhospitalNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.OUTPATIENT_NO
     *
     * @mbggenerated
     */
    private String outpatientNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.ID_NO
     *
     * @mbggenerated
     */
    private String idNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.CARD_NO
     *
     * @mbggenerated
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.PHONE_NUMBER
     *
     * @mbggenerated
     */
    private String phoneNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.LAB_SOURCE
     *
     * @mbggenerated
     */
    private String labSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.LAB_DATE_TIME
     *
     * @mbggenerated
     */
    private Date labDateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.ITEM_NAME
     *
     * @mbggenerated
     */
    private String itemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.SPECIMEN_TYPE
     *
     * @mbggenerated
     */
    private String specimenType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.SPECIMEN
     *
     * @mbggenerated
     */
    private String specimen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.REQUEST_NO
     *
     * @mbggenerated
     */
    private String requestNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.DOCTOR_CODE
     *
     * @mbggenerated
     */
    private String doctorCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.DOCTOR_NAME
     *
     * @mbggenerated
     */
    private String doctorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.INS_DEPT_CODE
     *
     * @mbggenerated
     */
    private String insDeptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.INS_DEPT_NAME
     *
     * @mbggenerated
     */
    private String insDeptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.LAB_DATE
     *
     * @mbggenerated
     */
    private Date labDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.REQUESTED_DATE_TIME
     *
     * @mbggenerated
     */
    private Date requestedDateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.PERFORMED_BY
     *
     * @mbggenerated
     */
    private String performedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.RESULT_STATUS
     *
     * @mbggenerated
     */
    private String resultStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.LAB_CREATE_TIME
     *
     * @mbggenerated
     */
    private String labCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.TOTAL_EXPENSE
     *
     * @mbggenerated
     */
    private Integer totalExpense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.RECEIVABLE_EXPENSE
     *
     * @mbggenerated
     */
    private Integer receivableExpense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.ACTUAL_EXPENSE
     *
     * @mbggenerated
     */
    private Integer actualExpense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.BILLING_INDICATOR
     *
     * @mbggenerated
     */
    private Integer billingIndicator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column V_HIS_LAB_INFO.PRESC_NO
     *
     * @mbggenerated
     */
    private String prescNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.TEST_NO
     *
     * @return the value of V_HIS_LAB_INFO.TEST_NO
     *
     * @mbggenerated
     */
    public String getTestNo() {
        return testNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.TEST_NO
     *
     * @param testNo the value for V_HIS_LAB_INFO.TEST_NO
     *
     * @mbggenerated
     */
    public void setTestNo(String testNo) {
        this.testNo = testNo == null ? null : testNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.PATIENT_ID
     *
     * @return the value of V_HIS_LAB_INFO.PATIENT_ID
     *
     * @mbggenerated
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.PATIENT_ID
     *
     * @param patientId the value for V_HIS_LAB_INFO.PATIENT_ID
     *
     * @mbggenerated
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.PATIENT_NAME
     *
     * @return the value of V_HIS_LAB_INFO.PATIENT_NAME
     *
     * @mbggenerated
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.PATIENT_NAME
     *
     * @param patientName the value for V_HIS_LAB_INFO.PATIENT_NAME
     *
     * @mbggenerated
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.VISIT_NO
     *
     * @return the value of V_HIS_LAB_INFO.VISIT_NO
     *
     * @mbggenerated
     */
    public String getVisitNo() {
        return visitNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.VISIT_NO
     *
     * @param visitNo the value for V_HIS_LAB_INFO.VISIT_NO
     *
     * @mbggenerated
     */
    public void setVisitNo(String visitNo) {
        this.visitNo = visitNo == null ? null : visitNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.INHOSPITAL_NO
     *
     * @return the value of V_HIS_LAB_INFO.INHOSPITAL_NO
     *
     * @mbggenerated
     */
    public String getInhospitalNo() {
        return inhospitalNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.INHOSPITAL_NO
     *
     * @param inhospitalNo the value for V_HIS_LAB_INFO.INHOSPITAL_NO
     *
     * @mbggenerated
     */
    public void setInhospitalNo(String inhospitalNo) {
        this.inhospitalNo = inhospitalNo == null ? null : inhospitalNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.OUTPATIENT_NO
     *
     * @return the value of V_HIS_LAB_INFO.OUTPATIENT_NO
     *
     * @mbggenerated
     */
    public String getOutpatientNo() {
        return outpatientNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.OUTPATIENT_NO
     *
     * @param outpatientNo the value for V_HIS_LAB_INFO.OUTPATIENT_NO
     *
     * @mbggenerated
     */
    public void setOutpatientNo(String outpatientNo) {
        this.outpatientNo = outpatientNo == null ? null : outpatientNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.ID_NO
     *
     * @return the value of V_HIS_LAB_INFO.ID_NO
     *
     * @mbggenerated
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.ID_NO
     *
     * @param idNo the value for V_HIS_LAB_INFO.ID_NO
     *
     * @mbggenerated
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.CARD_NO
     *
     * @return the value of V_HIS_LAB_INFO.CARD_NO
     *
     * @mbggenerated
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.CARD_NO
     *
     * @param cardNo the value for V_HIS_LAB_INFO.CARD_NO
     *
     * @mbggenerated
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.PHONE_NUMBER
     *
     * @return the value of V_HIS_LAB_INFO.PHONE_NUMBER
     *
     * @mbggenerated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.PHONE_NUMBER
     *
     * @param phoneNumber the value for V_HIS_LAB_INFO.PHONE_NUMBER
     *
     * @mbggenerated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.LAB_SOURCE
     *
     * @return the value of V_HIS_LAB_INFO.LAB_SOURCE
     *
     * @mbggenerated
     */
    public String getLabSource() {
        return labSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.LAB_SOURCE
     *
     * @param labSource the value for V_HIS_LAB_INFO.LAB_SOURCE
     *
     * @mbggenerated
     */
    public void setLabSource(String labSource) {
        this.labSource = labSource == null ? null : labSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.LAB_DATE_TIME
     *
     * @return the value of V_HIS_LAB_INFO.LAB_DATE_TIME
     *
     * @mbggenerated
     */
    public Date getLabDateTime() {
        return labDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.LAB_DATE_TIME
     *
     * @param labDateTime the value for V_HIS_LAB_INFO.LAB_DATE_TIME
     *
     * @mbggenerated
     */
    public void setLabDateTime(Date labDateTime) {
        this.labDateTime = labDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.ITEM_NAME
     *
     * @return the value of V_HIS_LAB_INFO.ITEM_NAME
     *
     * @mbggenerated
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.ITEM_NAME
     *
     * @param itemName the value for V_HIS_LAB_INFO.ITEM_NAME
     *
     * @mbggenerated
     */
    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.SPECIMEN_TYPE
     *
     * @return the value of V_HIS_LAB_INFO.SPECIMEN_TYPE
     *
     * @mbggenerated
     */
    public String getSpecimenType() {
        return specimenType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.SPECIMEN_TYPE
     *
     * @param specimenType the value for V_HIS_LAB_INFO.SPECIMEN_TYPE
     *
     * @mbggenerated
     */
    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType == null ? null : specimenType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.SPECIMEN
     *
     * @return the value of V_HIS_LAB_INFO.SPECIMEN
     *
     * @mbggenerated
     */
    public String getSpecimen() {
        return specimen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.SPECIMEN
     *
     * @param specimen the value for V_HIS_LAB_INFO.SPECIMEN
     *
     * @mbggenerated
     */
    public void setSpecimen(String specimen) {
        this.specimen = specimen == null ? null : specimen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.REQUEST_NO
     *
     * @return the value of V_HIS_LAB_INFO.REQUEST_NO
     *
     * @mbggenerated
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.REQUEST_NO
     *
     * @param requestNo the value for V_HIS_LAB_INFO.REQUEST_NO
     *
     * @mbggenerated
     */
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.DOCTOR_CODE
     *
     * @return the value of V_HIS_LAB_INFO.DOCTOR_CODE
     *
     * @mbggenerated
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.DOCTOR_CODE
     *
     * @param doctorCode the value for V_HIS_LAB_INFO.DOCTOR_CODE
     *
     * @mbggenerated
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode == null ? null : doctorCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.DOCTOR_NAME
     *
     * @return the value of V_HIS_LAB_INFO.DOCTOR_NAME
     *
     * @mbggenerated
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.DOCTOR_NAME
     *
     * @param doctorName the value for V_HIS_LAB_INFO.DOCTOR_NAME
     *
     * @mbggenerated
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.INS_DEPT_CODE
     *
     * @return the value of V_HIS_LAB_INFO.INS_DEPT_CODE
     *
     * @mbggenerated
     */
    public String getInsDeptCode() {
        return insDeptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.INS_DEPT_CODE
     *
     * @param insDeptCode the value for V_HIS_LAB_INFO.INS_DEPT_CODE
     *
     * @mbggenerated
     */
    public void setInsDeptCode(String insDeptCode) {
        this.insDeptCode = insDeptCode == null ? null : insDeptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.INS_DEPT_NAME
     *
     * @return the value of V_HIS_LAB_INFO.INS_DEPT_NAME
     *
     * @mbggenerated
     */
    public String getInsDeptName() {
        return insDeptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.INS_DEPT_NAME
     *
     * @param insDeptName the value for V_HIS_LAB_INFO.INS_DEPT_NAME
     *
     * @mbggenerated
     */
    public void setInsDeptName(String insDeptName) {
        this.insDeptName = insDeptName == null ? null : insDeptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.LAB_DATE
     *
     * @return the value of V_HIS_LAB_INFO.LAB_DATE
     *
     * @mbggenerated
     */
    public Date getLabDate() {
        return labDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.LAB_DATE
     *
     * @param labDate the value for V_HIS_LAB_INFO.LAB_DATE
     *
     * @mbggenerated
     */
    public void setLabDate(Date labDate) {
        this.labDate = labDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.REQUESTED_DATE_TIME
     *
     * @return the value of V_HIS_LAB_INFO.REQUESTED_DATE_TIME
     *
     * @mbggenerated
     */
    public Date getRequestedDateTime() {
        return requestedDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.REQUESTED_DATE_TIME
     *
     * @param requestedDateTime the value for V_HIS_LAB_INFO.REQUESTED_DATE_TIME
     *
     * @mbggenerated
     */
    public void setRequestedDateTime(Date requestedDateTime) {
        this.requestedDateTime = requestedDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.PERFORMED_BY
     *
     * @return the value of V_HIS_LAB_INFO.PERFORMED_BY
     *
     * @mbggenerated
     */
    public String getPerformedBy() {
        return performedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.PERFORMED_BY
     *
     * @param performedBy the value for V_HIS_LAB_INFO.PERFORMED_BY
     *
     * @mbggenerated
     */
    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy == null ? null : performedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.RESULT_STATUS
     *
     * @return the value of V_HIS_LAB_INFO.RESULT_STATUS
     *
     * @mbggenerated
     */
    public String getResultStatus() {
        return resultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.RESULT_STATUS
     *
     * @param resultStatus the value for V_HIS_LAB_INFO.RESULT_STATUS
     *
     * @mbggenerated
     */
    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus == null ? null : resultStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.LAB_CREATE_TIME
     *
     * @return the value of V_HIS_LAB_INFO.LAB_CREATE_TIME
     *
     * @mbggenerated
     */
    public String getLabCreateTime() {
        return labCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.LAB_CREATE_TIME
     *
     * @param labCreateTime the value for V_HIS_LAB_INFO.LAB_CREATE_TIME
     *
     * @mbggenerated
     */
    public void setLabCreateTime(String labCreateTime) {
        this.labCreateTime = labCreateTime == null ? null : labCreateTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.TOTAL_EXPENSE
     *
     * @return the value of V_HIS_LAB_INFO.TOTAL_EXPENSE
     *
     * @mbggenerated
     */
    public Integer getTotalExpense() {
        return totalExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.TOTAL_EXPENSE
     *
     * @param totalExpense the value for V_HIS_LAB_INFO.TOTAL_EXPENSE
     *
     * @mbggenerated
     */
    public void setTotalExpense(Integer totalExpense) {
        this.totalExpense = totalExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.RECEIVABLE_EXPENSE
     *
     * @return the value of V_HIS_LAB_INFO.RECEIVABLE_EXPENSE
     *
     * @mbggenerated
     */
    public Integer getReceivableExpense() {
        return receivableExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.RECEIVABLE_EXPENSE
     *
     * @param receivableExpense the value for V_HIS_LAB_INFO.RECEIVABLE_EXPENSE
     *
     * @mbggenerated
     */
    public void setReceivableExpense(Integer receivableExpense) {
        this.receivableExpense = receivableExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.ACTUAL_EXPENSE
     *
     * @return the value of V_HIS_LAB_INFO.ACTUAL_EXPENSE
     *
     * @mbggenerated
     */
    public Integer getActualExpense() {
        return actualExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.ACTUAL_EXPENSE
     *
     * @param actualExpense the value for V_HIS_LAB_INFO.ACTUAL_EXPENSE
     *
     * @mbggenerated
     */
    public void setActualExpense(Integer actualExpense) {
        this.actualExpense = actualExpense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.BILLING_INDICATOR
     *
     * @return the value of V_HIS_LAB_INFO.BILLING_INDICATOR
     *
     * @mbggenerated
     */
    public Integer getBillingIndicator() {
        return billingIndicator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.BILLING_INDICATOR
     *
     * @param billingIndicator the value for V_HIS_LAB_INFO.BILLING_INDICATOR
     *
     * @mbggenerated
     */
    public void setBillingIndicator(Integer billingIndicator) {
        this.billingIndicator = billingIndicator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column V_HIS_LAB_INFO.PRESC_NO
     *
     * @return the value of V_HIS_LAB_INFO.PRESC_NO
     *
     * @mbggenerated
     */
    public String getPrescNo() {
        return prescNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column V_HIS_LAB_INFO.PRESC_NO
     *
     * @param prescNo the value for V_HIS_LAB_INFO.PRESC_NO
     *
     * @mbggenerated
     */
    public void setPrescNo(String prescNo) {
        this.prescNo = prescNo == null ? null : prescNo.trim();
    }
}