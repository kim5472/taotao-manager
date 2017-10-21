package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGrifResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	
	TbItem getItemById(long itemId);
//	EasyUIDataGrifResult getItemList(int page ,int rows);
}
