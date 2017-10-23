package com.maven.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.maven.entity.Stu;

@Repository("stuDao")
public class StuDao extends BaseDao{

	//添加学生
	public boolean addStu(Stu stu){
		try{
			getSession().save(stu);
			return true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	//查询学生
	public List findStuList(String hql){
		return getSession().createQuery(hql).list();
	}
	
	//根据id查询学生
	public Stu findStuById(Stu stu) {
		return getSession().get(stu.getClass(), stu.getSno());
	}
	
	//修改学生
	public boolean updStu(Stu stu) {
		try {
			getSession().update(stu);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	//删除学生
	public boolean deleteStu(Stu stu){
		try {
			getSession().delete(stu);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
