package com.maven.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.maven.dao.StuDao;
import com.maven.entity.Stu;

@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuService {

	@Resource(name="stuDao")
	private StuDao stuDao;
	
	//添加学生
	public boolean addStu(Stu stu){
		return stuDao.addStu(stu);
	}
	
	//查询学生
	public List findStuList(){
		return stuDao.findStuList("from Stu");
	}
	
	//根据id查询学生
	public Stu findStuById(Stu stu) {
		return stuDao.findStuById(stu);
	}
	
	//修改学生
	public boolean updateStu(Stu stu){
		return stuDao.updStu(stu);
	}
	
	//删除学生
	public boolean deleteStu(Stu stu){
		return stuDao.deleteStu(stu);
	}
}
