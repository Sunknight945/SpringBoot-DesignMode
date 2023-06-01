package com.appleyk.DMA5_建造者模式;

import com.appleyk.DMA5_建造者模式.DM5.Cake;
import com.appleyk.DMA5_建造者模式.DM5.CakeBuilder;
import com.appleyk.DMA5_建造者模式.DM5.CakeDirector;

/**
 * <p>建造者模式测试 == 客户购买蛋糕</p>
 *
 * @author Appleyk
 * @blob https://blog.csdn.net/appleyk
 * @date Created on 下午 1:32 2018-11-9
 * @version v0.1.2
 */
public class BuilderTest {

    /**
     * 1、假设我要去蛋糕店买蛋糕,我只需要付钱，蛋糕销售员给我一个蛋糕即可
     * 2、作为购买者，我不关心我买到的蛋糕是怎么制作出来的，即我只关心显示【蛋糕】，不关心行为【制作蛋糕】
     * 3、而蛋糕肯定是按照一定的制作工序才能制作出来的，谁会这种制作工序呢？答案肯定是蛋糕制作师傅了
     * 4、话又说回来，蛋糕师傅只会制作蛋糕，他并不关心蛋糕的去向
     * 5、但是客户又要买蛋糕，所以最后还是会绕到销售员的身上
     * 6、即 -- 蛋糕制作师傅  --> 蛋糕销售员 --> 蛋糕购买者
     *
     * 接下来，我们来实现一下
     */
    public static void main(String[] args) {

        /**先指定一个蛋糕师傅  == 李师傅*/
        CakeBuilder cakeBuilder = new CakeBuilder("李师傅");

        /**指定蛋糕销售员*/
        CakeDirector cakeDirector = new CakeDirector();

        /**销售员卖个客户一个蛋糕 == 注意，这个蛋糕的制作工程已经被隐藏了*/
        Cake cake = cakeDirector.sell(cakeBuilder);

        /**这一句其实没必要显示，这里显示是为了说明，蛋糕不是平白无故的创造出来的*/
        cake.show();

        /**
         * Product： 具体产品【本案例中☞Cake】
         * Builder： 创建一个Product对象的各个部分指定的抽象接口【本案例中☞ICakeBuilder】
         * ConcreteBuilder：具体的建造者，实现Builder接口，构建和装配各个部件【本案例中☞CakeBuilder】
         * Director： 构建一个使用builder接口的对象【本案例中☞CakeDirector】
         * 场景：创建一些复杂的对象，这些对象内部构建之间的建造顺序是稳定的，但是对象内部的构建通常面临着复杂的变化
         * 好处：建造代码与表示代码分离，隐藏了该产品是如何组装的，
         *      若需要改变一个产品的内部表示，只需要再定义一个具体的建造者就可以了 == 这个就非常狠了
         *
         * 补充说明：建造者模式和门面（外观）模式有些地方很相似，似乎都是封装了复杂的过程，但是从切入点来讲，
         * 建造者模式更多关注的是如何将复杂的产品的构建过程对用户进行屏蔽，关注的是产品和用户之间的关系，因此
         * 建造者模式可以将产品的制作过程抽象化和工序步骤化，产品可以由不同的制造者去实现，最终用户得到的只是一个他
         * 想要的产品，而不关心这玩意是怎么来的！
         *        而外观模式主要作用于处理类或对象的组合关系，属于结构型模式，关注点在于如何简化现有众多产品
         * （也可泛化为API调用）以解决用户的选择困难症，这种困难主要体现在，产品众多，怎么选，能不能有个套餐或组合什么的，让我快速
         * 选择我想要的产品族，而不是让我用户一个个产品去挑选，那样太麻烦，因此，外观模式提供了一种组合的方式，将多个产品依据口味和性价比
         * 组合在一起提供给用户，用户那边既快速购买了套餐填饱了肚子又省了不少钱，这难道不香吗？例子用在复杂系统各个模块之间的调用上，也是成立的，
         * 客户端面对繁琐的系统API，如果对系统每个模块不是很了解，想要快速通过组合API调用的方式来得到用户想要的功能或数据是困难的，因此，何不用
         * 用外观模式来改善呢？
         *
         */
    }

}
