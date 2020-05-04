package cn.theo.gmall.manage.mapper;

import cn.theo.gmall.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {

    public List<SpuSaleAttr> selectSpuSaleAttrList(long spuId);
}


