package com.lakebin.blog.mapper;

import com.lakebin.blog.entiy.Blog;
import com.lakebin.blog.entiy.BlogExample;
import org.junit.Test;

import java.util.List;

/**
 * @author hubin.f
 * @date 2020/2/8 10:32
 */
public class BlogMapperTest extends AbstractMapperTest<BlogMapper> {


    @Test
    public void countByExample() {
    }

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = mapper.selectByExample(blogExample);
        System.out.println("第一次查询结束");
        System.out.println(blogs);
        final Blog blog = blogs.get(0);
        new Thread(() -> {
            mapper.updateByPrimaryKey(blog);
            session.commit();
            System.out.println("异步线程已提交更新");
        }).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Blog> blogs1 = mapper.selectByExample(blogExample);
        System.out.println("第二次查询结束");
        System.out.println(blogs1);
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Override
    public Class<BlogMapper> getEntityClass() {
        return BlogMapper.class;
    }
}
