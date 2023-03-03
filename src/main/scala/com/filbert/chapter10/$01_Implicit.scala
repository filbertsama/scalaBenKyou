package com.filbert.chapter10

import com.filbert.chapter01.ImplictTest._


class ImplictTest2{

  /**
    * 隐式转换方法
    * @param d
    * @return
    */
  implicit def double2Int1( d:Double ):Int = {
    println(s"x=${d}")
    d.toInt
  }


  implicit def double2Int2( d:Double ):Int = {
    println(s"x=${d}")
    d.toInt
  }
}

object $01_Implicit {

  /**
    * 隐式转换方法: 悄悄的将一个类型转成另一个类型
    *     语法: implicit def 方法名(参数名: 待转换类型):目标类型 = {....}
    * 隐式转换的使用时机:
    *     1、当前类型与目标类型不一致,会查询符合要求的隐式转换使用
    *     2、对象使用了不属于自身的属性和方法,会查询符合要求的隐式转换使用
    * 隐式转换的解析机制:
    *     1、当需要隐式转换的时候,会首先从当前作用域查询是否有符合要求的隐式转换,如果有则直接调用,如果没有则报错
    *     2、隐式转换方法如果定义在其他的Object/class中,此时需要导入之后才能使用：
    *           1、如果隐式转换方法定义在object中,则可以通过 import object名称._ / import object名称.隐式转换名称 导入使用
    *           2、如果隐式转换方法定义在class中,则可以通过 import 对象._ / import 对象.隐式转换名称 导入使用
    *    注意: 如果object/class中有多个隐式转换都符合要求,此时不能导入所有,只能明确指定导入哪个隐式转换
    *
    */
  def main(args: Array[String]): Unit = {

    //TODO 导入object中的隐式转换
    //TODO 注意: scala导包可以在任何位置导入
    //import ImplictTest._
    //TODO 注意: 如果object/class中有多个隐式转换都符合要求,此时不能导入所有,只能明确指定导入哪个隐式转换
    //import ImplictTest.double2Int1

    //TODO 导入class中的隐式转换
    //val obj = new ImplictTest2
    //import obj.double2Int1
    val a1:Int  = 2.5
    val a2:Int  = 2.5
    val a3:Int  = 2.5
    val a4:Int  = 2.5
    val a5:Int  = 2.5
    val a6:Int  = 2.5
    val a7:Int  = 2.5
    val a8:Int  = 2.5
    val a9:Int  = 2.5
    val a10:Int  = 2.5
    val a11:Int  = 2.5

    println(a1)

    //TODO 2、对象使用了不属于自身的属性和方法,会查询符合要求的隐式转换使用
    val cat = new Cat
    cat.m1()
  }


}



class Dog{

  val name = "lisi"

  def m1() = println("汪汪....")
}

class Cat
