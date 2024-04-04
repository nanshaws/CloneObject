# CloneObject
java复制对象，相同字段值的赋值  ，对象包含json，等等

**使用此项目：**

```xml
<groupId>io.github.nanshaws</groupId>
<artifactId>cloneUtils</artifactId>
<version>1.4</version>
```

**本项目本来目录**

![image-20240404235902985](./../img/image-20240404235902985.png)

**JsonClone类的用法：**

![image-20240404231620117](./../img/image-20240404231620117.png)

**ObjectClone类的用法：**

![image-20240404232056360](./../img/image-20240404232056360.png)

**FileClone类和PathUtils用法：**

```java
PathUtils.findByNameReturnFile(name)
```

这个方法可以找到本项目中的任何名字的文件

比如说，接下来我想将fileUtils里面的t1.txt文件里面的内容复制到t2.txt文件中

```java
File prefile = PathUtils.findByNameReturnFile("t1.txt");
File nextfile = PathUtils.findByNameReturnFile("t2.txt");
FileClone.cloneFile(prefile,nextfile);
```

![image-20240404235415798](./../img/image-20240404235415798.png)

可以直接复制过去

![image-20240404235502699](./../img/image-20240404235502699.png)

```java
PathUtils.getResourceFile(name)方法是为了直接获取resource里面的文件的
```

PropertiesUtils类的两个方法：readProperties和readResourcesProperties，一个是读取本项目中的properties文件，一个是读取resource里面的properties文件。
