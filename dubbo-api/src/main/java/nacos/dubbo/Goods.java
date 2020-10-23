package nacos.dubbo;

import java.io.Serializable;

/**
 * 商品类
 */
public class Goods implements Serializable {

    // 商品名称
    private String name;
    // 商品价格
    private Integer number;

    public Goods(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
