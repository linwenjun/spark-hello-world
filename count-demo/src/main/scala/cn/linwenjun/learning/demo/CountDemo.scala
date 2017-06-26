package cn.linwenjun.learning.demo

import org.apache.spark.{SparkConf, SparkContext}

class CountDemo {
  def count(): Unit = {
    val conf = new SparkConf().setAppName("hello").setMaster("local")
    val sc = new SparkContext(conf)
    val text = sc.parallelize(Seq("a", "b", "b"))
    val c = text.count()
    println(c)
  }
}
