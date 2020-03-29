package com.taotaojava.mapper;

import com.taotaojava.pojo.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2019\2\26 0026.
 */

/***
 * 1、注解方式 ； 2、xml方式
 */
@Mapper
public interface StudentsMapper {
    /**
     * 注解方式
     * @param sNo
     * @return
     */
    @Select("SELECT s_no,s_name,s_sex,s_birthday,s_class FROM students where s_no = #{sNo}")
    List<Students> findByNO(@Param("sNo") String sNo);


    /**
     * xml方式
     * @param sNo
     * @return
     */
    List<Students> findByNO2(String sNo);
}
