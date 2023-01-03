package com.izumi.myobjectstream;

import java.io.Serializable;

/***
 * Serializable �ӿ�������û�г��󷽷������ֽӿھͽб���ͽӿ�
 * һ��ʵ��������ӿڣ�name�ͱ�ʾ��ǰ��Student����Ա����л�
 * ��⣺
 *      һ����Ʒ�ĺϸ�֤
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
