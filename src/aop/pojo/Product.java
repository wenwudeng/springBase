package aop.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/*@component注解表名此类是bean类*/
@Component("p")
public class Product {
    private int id;
    private String name = "product1";

    /*注入对象的注解*/

    /*1.在属性前加上@Autowired 会自动注入对象
    * 2.再setCategory方法前加上@Autowired达到相同效果
    @Autowired*/

    /*
    除了@AutoWired之外，@Resource也是常用方法
     */
    @Resource(name="c")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
