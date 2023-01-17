# k8s-lin-demo

K8S使用/测试中，用到的demo。

- testjavahttpservice：用于校验K8S集群中，http的方式，能否使用servicename来进行访问。
- java-demo-lin：Jenkins和tomcat部署的项目，这里已添加Jenkins中所需的文件。
  - deploy.yaml：部署yaml，包含deployment、service
  - Dockerfile：打镜像
  - Jenkinsfile：Jenkins的pipeline文件
  - SQL文件: db/tables_ly_tomcat.sql
  - 数据库配置：src/main/resources/application.yml