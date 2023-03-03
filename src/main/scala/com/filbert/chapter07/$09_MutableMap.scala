package com.filbert.chapter07

import scala.collection.mutable

object $09_MutableMap {

  def main(args: Array[String]): Unit = {

    //TODO 可变Map的创建: mutable.Map[K的类型,V的类型]( k->V, (K,V) ...)
    val map = mutable.Map[String,Int]("aa"->10,"ff"->20,"pp"->18,"rr"->20)
    println(map)

    //TODO 添加元素
    map.put("cc",40)
    println(map)

    //TODO 删除元素
    map.remove("cc")
    println(map)

    //TODO 获取key的value值
    println(map.getOrElse("aa", -1))

    //TODO 修改key的value值
    map("aa1") = 200
    println(map)
  }
}
