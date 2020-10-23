package nacos.dubbo;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品信息服务实现-模拟返回商品列表
 */
// 注意需使用正确的包 org.apache.dubbo.config.annotation.Service
@Service(version = "${service.version}")
public class GoodsServiceImpl implements GoodsService {

    private static final Logger logger = LoggerFactory.getLogger(GoodsServiceImpl.class);

    @Override
    public List<Goods> getAllGoods() {
        List<Goods> goods = new ArrayList<>();
        goods.add(new Goods("电脑", 10));
        goods.add(new Goods("手机", 20));
        goods.add(new Goods("书籍", 30));
        logger.info(RpcContext.getContext().getRemoteHost()+"正在调用服务..");
        return goods;
    }
}
