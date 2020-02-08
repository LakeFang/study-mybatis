package com.lakebin.blog.mapper;

import com.lakebin.blog.entiy.Post;
import com.lakebin.blog.entiy.PostExample;
import com.lakebin.blog.entiy.PostWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    long countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostWithBLOBs record);

    int insertSelective(PostWithBLOBs record);

    List<PostWithBLOBs> selectByExampleWithBLOBs(PostExample example);

    List<Post> selectByExample(PostExample example);

    PostWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExampleWithBLOBs(@Param("record") PostWithBLOBs record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(PostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PostWithBLOBs record);

    int updateByPrimaryKey(Post record);
}