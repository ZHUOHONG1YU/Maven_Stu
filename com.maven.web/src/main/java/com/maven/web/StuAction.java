package com.maven.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.maven.entity.Stu;
import com.maven.service.StuService;
import com.opensymphony.xwork2.ActionContext;

@Controller("stuAction")
@Scope("prototype")
public class StuAction {

	private Stu stu;
	private int msg;
	
	@Resource(name="stuService")
	private StuService stuService;
	
	//去到添加学生页面
	public String addStu(){
		
		return "addstu";
	}
	
	//执行添加操作
	public String toAddStu(){	
		//调用学生的服务层方法执行添加学生
		if(stuService.addStu(stu)){
			msg=1;
		}else{
			msg=-1;
		}
		return "toaddStu";
	}
	
	//查询所有学生
	public String findStuList(){
		ActionContext.getContext().put("stuList", stuService.findStuList());
		return "input";
	}
	
	//根据学生id查询学生详细信息
	public String findStuById(){
		stu=stuService.findStuById(stu);
		return "main";
	}
	
	//修改学生
	public String updateStu(){
		if(stuService.updateStu(stu)){
			msg=1;
		}else{
			msg=-1;
		}
		return "tomain";
	}
	
	//删除学生
	public String deleteStu(){
		if(stuService.deleteStu(stu)){
			msg=2;
		}else{
			msg=-1;
		}
		return "tomain";
	}
	
	public Stu getStu() {
		return stu;
	}
	public void setStu(Stu stu) {
		this.stu = stu;
	}
	public int getMsg() {
		return msg;
	}
	public void setMsg(int msg) {
		this.msg = msg;
	}
	public void setStuService(StuService stuService) {
		this.stuService = stuService;
	}
}
