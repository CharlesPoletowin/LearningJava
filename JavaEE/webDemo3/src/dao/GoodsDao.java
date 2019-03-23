package dao;

import java.util.List;

import model.Goods;
import util.DBUtil;

public class GoodsDao {
	public List<Goods> getAllGoods(){
		return DBUtil.goodsList;
	}
}
