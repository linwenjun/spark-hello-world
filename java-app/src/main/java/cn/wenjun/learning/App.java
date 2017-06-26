package cn.wenjun.learning;

import cn.linwenjun.learning.demo.CountDemo;
import cn.linwenjun.learning.demo.CountTest;

public class App {
    public static void main(String args[]) {
        CountDemo countDemo = new CountDemo();
        countDemo.count();
        CountTest countTest = new CountTest();
        countTest.print();
    }
}
