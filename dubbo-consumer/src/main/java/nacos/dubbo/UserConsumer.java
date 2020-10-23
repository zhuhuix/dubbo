package nacos.dubbo;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Restful api接口:用户消费者调用商品信息微服务
 */
@RestController
public class UserConsumer {

    @Reference(version= "${service.version}",mock = "熔断")
    private GoodsService goodsService;


    @GetMapping("/userGoods")
    public User getUserGoods() {
        User user = new User();
        // 通过GoodsService接口调用商品微服务
        try {
            List<Goods> goods = goodsService.getAllGoods();
            user.setName("jack");
            user.setGoods(goods);
        } catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
        return user;
    }
}
