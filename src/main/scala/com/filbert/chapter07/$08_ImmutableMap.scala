package com.filbert.chapter07

object $08_ImmutableMap {

  def main(args: Array[String]): Unit = {

    //TODO 不可变Map的创建: Map[K的类型,V的类型]( K->V , (K,V) , ... )
    val map = Map[String,Int]("aa"->10, ("bb",20) ,"aa"->100,"dd"->22)

    println(map)

    //TODO 添加元素
    val map2 = map.+( "ee"->30 )
    println(map2)

    val map3 = map.++(List( "ff"->11,"pp"->32,"oo"->34 ))
    println(map3)
    val map4 = map.++:(List( "ff"->11,"pp"->32,"oo"->34 ))
    println(map4)

    //TODO 删除元素
    val map5 = map4.-( "oo" )
    println(map5)

    val map6 = map4.--(List("pp","aa","ff"))
    println(map6)

    //TODO 根据key获取value值: getOrElse(key,默认值) [如果key存在则返回value值,如果key不存在则返回默认值]
    //TODO Option为了提示外部当前结果有可能为空,需要处理
    //      TODO Option有两个子类: Some 、None
    //            TODO Some: 代表结果不为空,结果封装在Some中,后续可以使用get方法获取最终结果值
    //            TODO None: 代表结果为空
    //println(map4.get("bb"))
    //println(map4.get("bb").get)
    //println(map4.get("bb1"))
    println(map4.getOrElse("bb", 0))
    println(map4.getOrElse("bb1", 0))

    //TODO 修改map key的value值
    val map7 = map4.updated("bb1",400)
    println(map7)
  }
}
