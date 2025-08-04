package com.senglorn.cms.category;

import com.senglorn.cms.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryRepository {

    @Select("""
           SELECT *
           FROM tb_categories
           WHERE is_deleted = FALSE
           ORDER BY id
           """)
    @Results({
            @Result(property = "isDeleted", column = "is_deleted")
    })
    List<Category> selectAllCategorise();
}
