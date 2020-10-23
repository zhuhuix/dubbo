package nacos.dubbo;

import java.util.List;

/**
 * 商品信息服务接口-模拟返回商品列表
 */
public interface GoodsService {
    // 获取所有商品信息
    List<Goods> getAllGoods();
}
