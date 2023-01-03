package com.izumi.myobjectstream;

import java.io.Serializable;

/***
 * Serializable 接口里面是没有抽象方法，这种接口就叫标记型接口
 * 一旦实现了这个接口，name就表示当前的Student类可以被序列化
 * 理解：
 *      一个物品的合格证
 */

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
