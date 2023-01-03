package com.izumi.myobjectstream;

import java.io.Serializable;

/***
 * Serializable �ӿ�������û�г��󷽷������ֽӿھͽб���ͽӿ�
 * һ��ʵ��������ӿڣ�name�ͱ�ʾ��ǰ��Student����Ա����л�
 * ��⣺
 *      һ����Ʒ�ĺϸ�֤
 */

public class Student implements Serializable {
    // ϸ��1���汾��
    private static final long serialVersionUID = 6746582546342271507L;
    private String name;
    private int age;
    // ϸ��2��transient��˲̬�ؼ���
    // ���ã�����ѵ�ǰ�������л��������ļ�����
    private transient String address;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
