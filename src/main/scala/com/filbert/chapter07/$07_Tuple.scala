package com.filbert.chapter07

object $07_Tuple {

  class Region(val name:String,val school:School)

  class School(val name:String, val clazz:Clazz)

  class Clazz(val name:String, val stu:Student)

  class Student(val name:String,val age:Int)

  /**
    * 元组的创建方式
    *     1、通过()的形式创建[可以用于创建任何元组]: (初始元素,....)
    *     2、通过 -> 的方式创建[只能用于创建二元元组]: K -> V
    *     scala的二元元组表示KV键值对
    * 元组最多只能存放22个元素
    * 元组一旦创建,元素个数与元素都不可变
    * 元组获取值的方式: 元组名._N
    */
  def main(args: Array[String]): Unit = {

    //TODO 1、通过()的形式创建: (初始元素,....)
    val t1: (String, Int, String) = ("zhangsan",20,"lisi")

    //TODO 2、通过 -> 的方式创建[只能用于创建二元元组]: K -> V
    val t2: (String, Int) = "张三" -> 20

    println(t1)
    println(t2)

    println(t1._1)
    println(t1._2)
    println(t1._3)

    val list = List("1 张三 20 北京","2 李四 33 深圳","3 王五 40 深圳","4 赵六 50 北京")

    val list2 = for( element<- list ) yield{
      val arr = element.split(" ")
      val age = arr(2).toInt
      val region = arr(3)
      (region,age)
    }

    val list3 = List(
      new Region("宝安区",new School("宝安中学", new Clazz("王者峡谷班",new Student("安其拉",18)))),
      new Region("宝安区",new School("宝安中学", new Clazz("王者峡谷班",new Student("甄姬",18)))),
      new Region("宝安区",new School("宝安中学", new Clazz("王者峡谷班",new Student("妲己",18)))),
      new Region("宝安区",new School("宝安中学", new Clazz("王者峡谷班",new Student("王昭君",18)))),
      new Region("宝安区",new School("宝安中学", new Clazz("王者峡谷班",new Student("扁鹊",18))))
    )

    val stuNames = for(region<- list3) yield{
      region.school.clazz.stu.name
    }


    val list4 = List(
      ("宝安区",("宝安中学", ("王者峡谷班",("安其拉",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("甄姬",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("妲己",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("王昭君",18)))),
      ("宝安区",("宝安中学", ("王者峡谷班",("扁鹊",18))))
    )

    val stus = for(element<- list4) yield{

      element._2._2._2._1
    }

    println(stus)

  }
}
