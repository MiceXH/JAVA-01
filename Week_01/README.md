# 学习笔记

## JVM运行时数据区

JVM运行时数据区&GC算是已有的知识储备。

## GC

### GC算法

+ 标记-清除
+ 标记-整理
+ 标记-复制

### 垃圾收集器

+ serial
+ parallel
+ CMS
+ G1
+ ZGC

## 类加载

收获比较大的是类加载部分。之前只是理论上的了解，本次作业算是写了一个自定义类加载器。

另外，纠正了一个错误认识：双亲委派机制中，父加载器并不是~~父类~~加载器，网上有一些资料会把`BooststrapClassLoader <= ExtClassLoader <= AppClassLoader`的关系描述为继承关系，这是错误的。`ExtClassLoader`&`AppClassLoader`均继承自`ClassLoader <= URLClassLoader`。

## 字节码

之前对于字节码的认知也属于黑科技范畴，本次课对字节码有了更加直观的认识。今后有机会会更深入地了解学习。