package com.mdv.appstore.mapper;

import com.mdv.appstore.model.dto.BrandDTO;
import com.mdv.appstore.model.request.BrandRequest;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BrandMapper {
    void createBrand(@Param("brand") BrandRequest brand);

    List<BrandDTO> findAll();

    BrandDTO findById(@Param("id") Long id);

    void updateBrand(@Param("id") Long id, @Param("brand") BrandRequest brand);

    void deleteBrand(@Param("id") Long id);

    boolean existsByName(@Param("name") String name);
}
