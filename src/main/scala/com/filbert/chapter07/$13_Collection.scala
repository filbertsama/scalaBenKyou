package com.filbert.chapter07

object $13_Collection {

  def main(args: Array[String]): Unit = {

    val list = List(1,3,2,1,4,7,10,11)

    //去重 ********
    println(list.distinct)

    //删除前N个元素,保留剩余所有元素
    println(list.drop(3))

    //删除后N个元素,保留剩余所有元素
    println(list.dropRight(3))

    //获取前N个元素 ********
    println(list.take(3))

    //获取后N个元素
    println(list.takeRight(3))

    //获取指定角标范围的所有元素[包含开始角标,不包含结束角标元素] ********
    println(list.slice(1, 4))

    //获取第一个元素 ********
    println(list.head)

    //获取最后一个元素 ********
    println(list.last)

    //获取除开第一个元素的所有元素
    println(list.tail)

    //获取除开最后一个元素的所有元素
    println(list.init)

    //反转 ********
    println(list.reverse)

    //滑窗 ********
    val it = list.sliding(3,2)
    println(it.toList)

    //交集【两个集合都有的元素】
    val list2 = List(1,2,3,4,5)
    val list3 = List(4,5,6,7,8)
    println(list2.intersect(list3))
    //差集
    println(list2.diff(list3))
    //并集
    println(list2.union(list3))

    //拉链
    val list4 = List("aa","bb","cc","dd","pp")
    val list5 = List(10,34,22,56)
    val list6 = list4.zip(list5)
    println(list6)

    //反拉链
    println(list6.unzip)

    //将元素与角标拉链
    println(list4.zipWithIndex)

  }
}
