package com.filbert.chapter07

object $12_CollectionFields {

  def main(args: Array[String]): Unit = {

    val list = List(1,4,2,5,6)

    //获取集合长度
    println(list.size)
    println(list.length)

    //判断集合是否为空
    println(list.isEmpty)

    //判断集合是否包含某个元素
    println(list.contains(4))

    //将集合元素拼接成字符串
    println(list.mkString("#"))

    //集合转迭代器
    //Iterator迭代器: 一次性的迭代器
    //Iterable迭代器: 可重复使用的迭代器
    val it = list.toIterator
    while(it.hasNext){
      println(it.next())
    }
    println("---------------------------")
    while(it.hasNext){
      println(it.next())
    }

    val it2 = list.toIterable
    for( i<- it2 ){
      println(s"i=${i}")
    }

    for( j<- it2 ){
      println(s"j=${j}")
    }
  }
}
