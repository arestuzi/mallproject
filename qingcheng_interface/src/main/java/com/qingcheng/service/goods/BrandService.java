package com.qingcheng.service.goods;

import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

public interface BrandService {


    public List<Brand> findAll();

    public PageResult findPage(int page, int size);

    public List<Brand> findList(Map<String, Object> searchMap);

    public Brand findById(Integer id);

    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size);

    public void add(Brand brand);

    public void update(Brand brand);

    public void delete(Integer id);
}
