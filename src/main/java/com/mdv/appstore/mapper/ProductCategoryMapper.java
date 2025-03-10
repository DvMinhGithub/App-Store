package com.mdv.appstore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mdv.appstore.model.dto.CategoryDTO;
import com.mdv.appstore.model.dto.ProductDTO;

@Mapper
public interface ProductCategoryMapper {
    void create(@Param("productId") Long productId, @Param("categoryId") Long categoryId);

    List<CategoryDTO> getCategoriesByProductId(Long productId);

    List<ProductDTO> getProductsByCategoryId(Long categoryId);

    boolean isExist(@Param("productId") Long productId, @Param("categoryId") Long categoryId);

    void delete(@Param("productId") Long productId, @Param("categoryId") Long categoryId);
}
