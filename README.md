# springboot-dubbo
springboot整合dubbo

打包jar包步骤：

1.首先install package是pom的工程（springboot-dubbo工程）父工程

或者将mall-api的pom.xml改成：
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <artifactId>mall-api</artifactId>
    <groupId>com.shawn</groupId>
    <version>1.0-SNAPSHOT</version>
    <modelVersion>4.0.0</modelVersion>
</project>

2.install mall-api

3.分别package mall-order-service-consumer mall-user-service-provider



ZooKeeper服务命令:
    在准备好相应的配置之后，可以直接通过zkServer.sh 这个脚本进行服务的相关操作
1. 启动ZK服务:       sh bin/zkServer.sh start
2. 查看ZK服务状态: sh bin/zkServer.sh status
3. 停止ZK服务:       sh bin/zkServer.sh stop
4. 重启ZK服务:       sh bin/zkServer.sh restart


