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

![5种网络模型](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/5%E7%A7%8DIO%E6%A8%A1%E5%9E%8B.png)

## Netty简介

![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/Netty%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

+ 1. 异步
  2. 事件驱动
  3. 基于NIO

---

### HTTP Server、Web Server、J2EEServer区别？

|                                               |                         HTTP Server                          |                          Web Server                          |                         J2EE Server                          |
| :-------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: | :----------------------------------------------------------: |
| HTTP协议的连接传输HTML、JS、CSS文件、静态资源 | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) |
|         cookie、session、JSB、Servlet         |                                                              | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) |
|                  JMS、JBOSS                   |                                                              |                                                              | ![](https://github.com/MiceXH/JAVA-01/blob/main/Week_02/resources/%E5%AF%B9%E5%8F%B7%20%E9%80%89%E4%B8%AD.png) |

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