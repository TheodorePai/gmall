package cn.theo.gmall.service;

import cn.theo.gmall.bean.BaseAttrInfo;
import cn.theo.gmall.bean.BaseCatalog1;
import cn.theo.gmall.bean.BaseCatalog2;
import cn.theo.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

}
