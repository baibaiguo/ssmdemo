# 第二天
建项目和子模块
web项目 用骨架是war包，但默认maven里有一堆配置，父项目src目录手动删除
通过idea的插件建立.gitignore文件，选模板，自动隐藏了
---
直接share到github上不用先建本地仓库，这样share上去后就自动创建好了.git文件

## mysql的建表语句
mysql和oracle区别 mysql是varchar 日期转化函数是DATE_FORMAT
```sql
CREATE TABLE product(
	id VARCHAR(32) PRIMARY KEY,
	productNum VARCHAR(50) NOT NULL,
	productName VARCHAR(50),
	cityName VARCHAR(50),
	DepartureTime TIMESTAMP,
	productPrice NUMERIC,
	productDesc VARCHAR(500),
	productStatus INT
)

INSERT INTO PRODUCT (id, productnum, productname, cityname, departuretime, productprice,productdesc, productstatus)
VALUES ('676C5BD1D35E429A8C2E114939C5685A', 'itcast-002', '北京三日游', '北京', DATE_FORMAT('10-10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
INSERT INTO PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
VALUES ('12B7ABF2A4C544568B0A7C69F36BF8B7', 'itcast-003', '上海五日游', '上海', DATE_FORMAT('25-
04-2018 14:30:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1800, '魔都我来了', 0);
INSERT INTO PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
VALUES ('9F71F01CB448476DAFB309AA6DF9497F', 'itcast-001', '北京三日游', '北京', DATE_FORMAT('10-
10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
```
## Oracle的建表语句
```sql
CREATE TABLE product(
id varchar2(32) default SYS_GUID() PRIMARY KEY,
productNum VARCHAR2(50) NOT NULL,
productName VARCHAR2(50),
cityName VARCHAR2(50),
DepartureTime timestamp,
productPrice Number,
productDesc VARCHAR2(500),
productStatus INT,
CONSTRAINT product UNIQUE (id, productNum)
)
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('676C5BD1D35E429A8C2E114939C5685A', 'itcast-002', '北京三日游', '北京', to_timestamp('10-
10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('12B7ABF2A4C544568B0A7C69F36BF8B7', 'itcast-003', '上海五日游', '上海', to_timestamp('25-
04-2018 14:30:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1800, '魔都我来了', 0);
insert into PRODUCT (id, productnum, productname, cityname, departuretime, productprice,
productdesc, productstatus)
values ('9F71F01CB448476DAFB309AA6DF9497F', 'itcast-001', '北京三日游', '北京', to_timestamp('10-
10-2018 10:10:00.000000', 'dd-mm-yyyy hh24:mi:ss.ff'), 1200, '不错的旅行', 1);
```

## 去掉web项目pom里默认配置
 <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
 要把这个去掉， 要不加tomcat7插件在maven右侧没有出现tomcat7
 
 ## 第二天代码有误
 前端代码缺文件 plugin里两个文件没有，启动后菜单无效 报错
 
 怎么提git上还报一堆前端框架的错误，没提上去