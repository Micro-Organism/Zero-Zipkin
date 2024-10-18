# Zero-Zipkin
Zero-Zipkin

# 1. 概述

# 2. 导航
## 2.1. 安装配置
 - [Windows下载安装zipkin](https://blog.csdn.net/qq_35427589/article/details/121649912)
 - [linux下载安装zipkin](https://blog.csdn.net/qq_35427589/article/details/121649991)
# 3. 功能
## 3.1. linux下载安装zipkin
```shell
# 下载zipkin
docker pull openzipkin/zipkin:latest
# 启动zipkin
docker run -d --restart=always --name=zipkin -p 9411:9411 openzipkin/zipkin
```
## 3.2. Windows下载安装zipkin
```shell
java -jar zipkin-server-2.23.9-exec.jar
```
## 3.3. SpringBoot集成zipkin
<p>
 注意：这里我使用我虚拟机的域名进行访问，如果你的zipkin装在了本机，可以直接使用localhost访问
</p>

 - [http://localhost:9411/zipkin/](http://localhost:9411/zipkin/)
 - [http://zero.com:9411/zipkin/](http://zero.com:9411/zipkin/)

# 4. 其他

# 5. 问题
