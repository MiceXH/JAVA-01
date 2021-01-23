学习笔记

## JVM调优

相关命令行工具：

+ jps：查看Java进程PID
+ jstat
+ jstack
+ jmap -heap -histo -dump

图形化工具：

+ VisualGC
+ VisualVM
+ jconsole
+ JMC
+ MAT: 分析dump文件

---

面试题：如何排查线上OOM

1. 使用`jmap`命令排查

   > 1. `jps`查PID
   > 2. `jmap -dump:live,format=b,file=heapdumpyyMMddHHmm.hprof PID`命令生成dump文件
   > 3. 利用jhat/Eclipse Memory Analyzer (MAT) 分析dump文件 

2. `-XX:+HeapDumpOnOutOfMemoryError`参数来让虚拟机出现 OOM 的时候，自动生成 dump 文件。

   `XX:HeapDumpPath`指定文件存放路径

## Netty简单介绍

+ TCP 全双工通信
+ 5种IO模型

<img src="C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20210123202154014.png" alt="image-20210123202154014" style="zoom: 33%;" />

## Netty简介

<img src="../../../Week02-JVM核心技术/week02周日笔记.assets/image-20210124003723820.png" alt="image-20210124003723820" style="zoom: 25%;" />

+ 1. 异步
  2. 事件驱动
  3. 基于NIO

---

### HTTP Server、Web Server、J2EEServer区别？

|                                               |                         HTTP Server                          |                          Web Server                          |                         J2EE Server                          |
| :-------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| HTTP协议的连接传输HTML、JS、CSS文件、静态资源 | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> |
|         cookie、session、JSB、Servlet         |                                                              | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> |
|                  JMS、JBOSS                   |                                                              |                                                              | <img src="week02周日笔记.assets/对号 选中.png" style="zoom:10%;" /> |

---

### 基本概念

+ Channel
+ ChannelFuture
+ Event& Handler
+ Encoder & Decoder
+ ChannelPiperline

> HTTP编码：
>
> 1. HTTP响应头
> 2. html文件meta
> 3. 解码器是utf8	