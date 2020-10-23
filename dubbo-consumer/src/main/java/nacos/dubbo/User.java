package nacos.dubbo;

import java.io.Serializable;
import java.util.List;

/**
 * 用户类
 */
public class User implements Serializable {

    private String name;

    private List<Goods> goods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
