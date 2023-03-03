package com.filbert.chapter07

import scala.io.Source

object $16_WordCount {

  def main(args: Array[String]): Unit = {

    //1、读取数据
    val list = Source.fromFile("datas/wc.txt").getLines().toList
    //List(
    //    "hello java spark hadoop",
    //    "hadoop flume kafka scala",
    //    "scala java hello hello",
    //    "hello scala java flume",
    //    "flume hadoop spark kafka"
    // )

    //2、切割 + 炸开
    val list2 = list.flatMap( line => line.split(" ") )
    //List( hello,java,spark,hadoop,hadoop,..... )
    //3、按照单词分组
    val list3 = list2.groupBy( x => x )
    //Map(
    //    hello -> List( hello,hello,hello... )
    //    java -> List( java ,... )
    //   hadoop -> List( hadoop, .... )
    //   .....
    // )
    //4、统计每个组中单词的个数
    val list4= list3.map(x=> {
      //x =  hello -> List( hello,hello,hello... )

      (x._1 , x._2.size )
    })
    //Map( hello->4,java ->2,hadoop->5,....)

    //5、结果打印
    list4.foreach(println)

    Source.fromFile("datas/wc.txt").getLines()
      .toList
      .flatMap(_.split(" "))
      .groupBy(x=>x)
      .map(x=>(x._1,x._2.size))
      .foreach(println)
  }
}
