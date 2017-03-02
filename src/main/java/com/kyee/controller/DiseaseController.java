//package com.kyee.controller;
//
//import com.kyee.service.IPersonService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
///**
// * Description:        疾病管理模块
// * Author:             徐少斌
// * CreateTime:	       2016/11/8 11:48
// * ModifiedBy:
// * ModifiedTime:
// */
//
//@Controller
//@RequestMapping("/diseaseManage")
//public class DiseaseController{
//
//	@Autowired
//	IPersonService personServiceImpl;
//
//	@RequestMapping(value = "/getDiseaseList", method = RequestMethod.GET)
//	@ResponseBody public List<Map<String,Object>> getDiseaseList(@RequestParam String para) throws Exception{
//	    try{
//	        return  personServiceImpl.getPatientInfo();
//	    }catch (Exception e){
//	        throw new Exception("失败");
//	    }
//	}
//
//}
