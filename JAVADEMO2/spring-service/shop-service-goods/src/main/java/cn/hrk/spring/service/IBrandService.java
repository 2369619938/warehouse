package cn.hrk.spring.service;

import cn.hrk.common.domain.PageResult;
import cn.hrk.spring.goods.domain.Brand;

import java.util.List;
import java.util.Map;

public interface IBrandService {
    public List<Brand> findAll() ;
    public PageResult<Brand> findPage(int page, int size);
    public List<Brand> findList( Map<String,Object> searchMap) ;
    public PageResult<Brand> findPage(Map<String, Object> searchMap, int page,int size) ;
    public Brand findById(Integer id) ;
    public void add ( Brand brand) ;
    public void update(Brand brand);
    public void delete(Integer id);

}
