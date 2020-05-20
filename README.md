# Spring Boot集成H2

## 需求

平时学习的时候，涉及到一些连接数据库相关的操作，经常需要初始化本地数据库，比如装个MySQL，初始化一些脚本，比较麻烦，H2是内存数据库，Spring Boot可以在应用启动的时候对H2数据库初始化一些SQL脚本，这样的话，在学习/测试阶段，可以先使用H2数据库进行测试和学习，不需要额外安装MySQL数据库了。



**注意**

因为SQL脚本是可以在Spring Boot启动的时候初始化的，所以，假如你的SQL脚本中有一些删表删数据的操作，

## 环境

- JDK 1.8
- Spring Boot 2.3.0.RELEASE
- Maven 3.6.1

## 项目结构







## 代码

[Github](https://github.com/GreyZeng/spring-boot-h2.git)

[Gitee](https://gitee.com/greyzeng/spring-boot-h2.git)

