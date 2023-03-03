package com.filbert.chapter08

object $04_MatchClass {

  case class Person(val name:String,var age:Int, address:String)
  /**
    * 样例类: 其实就是伴生类与伴生对象的封装
    *     语法: case class 类名( [val/var] 属性名:类型[=默认值],.... )
    *         样例类中属性如果没有用val/var修饰,默认就是val修饰的
    *     创建样例类对象: 类名(属性值,...) / 类名.apply(属性值....)
    *
    * 样例类可以直接用于模式匹配
    * 普通类不能直接用于模式匹配,如果想要用于模式匹配需要在伴生对象中定义unapply方法
    */
  def main(args: Array[String]): Unit = {

    val person = Person("lisi",20,"shenzhen")
    println(person)
    println(person.name)
    println(person.age)
    println(person.address)
    //person.address = "beijing"

    //TODO 样例类可以直接用于模式匹配
    person match {
      case Person(x,y,z) =>
        println(x)
        println(y)
        println(z)
    }

    val stu = Student("zhagnsan",88,"beijing")
    stu match {
      case Student(x,y) =>
        println(x)
        println(y)

    }
  }
}

class Student(val name:String, var age:Int, val address:String)

object Student{
  //TODO apply方法是将属性组装成对象
  def apply(name:String,age:Int,address:String) = new Student(name,age,address)

  //TODO unapply是对象拆分为属性值
  def unapply(stu: Student): Option[(Int,String)] = {

    if(stu == null )
      None
    else
      Some( (stu.age,stu.name) )
  }
}
