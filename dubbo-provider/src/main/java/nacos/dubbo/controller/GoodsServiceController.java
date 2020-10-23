package nacos.dubbo.controller;

import nacos.dubbo.Goods;
import nacos.dubbo.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GoodsServiceController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("goods")
    public List<Goods> getAllGoods() {
        return goodsService.getAllGoods();
    }
}
