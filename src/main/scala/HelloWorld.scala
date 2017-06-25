import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("hello").setMaster("local")
    val sc = new SparkContext(conf)
    val text = sc.parallelize(Seq("a", "b", "b"))
    val c = text.count()
    println(c)
  }
}
