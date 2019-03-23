package service;

import java.util.List;

import dao.GoodsDao;
import model.Goods;

public class GoodsService {
	public List<Goods> selectAllGoods(){
		return new GoodsDao().getAllGoods();
	}
}
