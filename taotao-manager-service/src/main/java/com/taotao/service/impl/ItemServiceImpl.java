package com.taotao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem getItemById(long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

//	@Override
//	public EasyUIDataGrifResult getItemList(int page, int rows) {
//		// 设置分页信息
//		PageHelper.startPage(page, rows);
//		TbItemExample example = new TbItemExample();
//		List<TbItem> list = itemMapper.selectByExample(example );
//		// 去查询结果
//		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
//		EasyUIDataGrifResult result = new EasyUIDataGrifResult();
//		result.setRows(list);
//		result.setTotal(pageInfo.getTotal());
//		return result;
//	}
	
}
