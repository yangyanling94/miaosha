package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

public interface ItemService {

    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //浏览商品列表
    List<ItemModel> listItem();

    //浏览商品详情
    ItemModel getItemById(Integer id);
}
