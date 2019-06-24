prompt PL/SQL Developer Export Tables for user SYSTEM@ORCL
prompt Created by huangdasheng on 2019年5月4日
set feedback off
set define off

prompt Dropping T_PERMISSION...
drop table T_PERMISSION cascade constraints;
prompt Dropping T_ROLE...
drop table T_ROLE cascade constraints;
prompt Dropping T_ROLE_PERMISSION...
drop table T_ROLE_PERMISSION cascade constraints;
prompt Dropping T_USER...
drop table T_USER cascade constraints;
prompt Dropping T_USER_ROLE...
drop table T_USER_ROLE cascade constraints;
prompt Creating T_PERMISSION...
create table T_PERMISSION
(
  permissionid     VARCHAR2(20) not null,
  permissionname   VARCHAR2(50),
  permissionznname VARCHAR2(50)
)
tablespace DATA_TEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_PERMISSION
  add constraint PERMISSIONID primary key (PERMISSIONID)
  using index
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_ROLE...
create table T_ROLE
(
  roleid   VARCHAR2(20) not null,
  rolename VARCHAR2(20)
)
tablespace DATA_TEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_ROLE
  add constraint ROLEID primary key (ROLEID)
  using index
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_ROLE_PERMISSION...
create table T_ROLE_PERMISSION
(
  ref_roleid       VARCHAR2(20) not null,
  ref_permissionid VARCHAR2(20) not null
)
tablespace DATA_TEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_ROLE_PERMISSION
  add constraint REF_ROLEIDREF_PERMISSIONID primary key (REF_ROLEID, REF_PERMISSIONID)
  using index
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_USER...
create table T_USER
(
  id       VARCHAR2(20) not null,
  name     VARCHAR2(20),
  email    VARCHAR2(20),
  password VARCHAR2(50),
  age      NUMBER(3)
)
tablespace DATA_TEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_USER
  add constraint ID primary key (ID)
  using index
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Creating T_USER_ROLE...
create table T_USER_ROLE
(
  ref_userid NUMBER(8) not null,
  ref_roleid VARCHAR2(20) not null
)
tablespace DATA_TEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table T_USER_ROLE
  add constraint PRIMARYREF_USERIDREF_ROLEID primary key (REF_USERID, REF_ROLEID)
  using index
  tablespace SYSTEM
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt Disabling triggers for T_PERMISSION...
alter table T_PERMISSION disable all triggers;
prompt Disabling triggers for T_ROLE...
alter table T_ROLE disable all triggers;
prompt Disabling triggers for T_ROLE_PERMISSION...
alter table T_ROLE_PERMISSION disable all triggers;
prompt Disabling triggers for T_USER...
alter table T_USER disable all triggers;
prompt Disabling triggers for T_USER_ROLE...
alter table T_USER_ROLE disable all triggers;
prompt Loading T_PERMISSION...
insert into T_PERMISSION (permissionid, permissionname, permissionznname)
values ('1', 'addUser', '添加用户');
insert into T_PERMISSION (permissionid, permissionname, permissionznname)
values ('2', 'delUser', '删除用户');
insert into T_PERMISSION (permissionid, permissionname, permissionznname)
values ('3', 'updateUser', '更新用户');
insert into T_PERMISSION (permissionid, permissionname, permissionznname)
values ('4', 'queryUser', '查询用户');
commit;
prompt 4 records loaded
prompt Loading T_ROLE...
prompt Table is empty
prompt Loading T_ROLE_PERMISSION...
insert into T_ROLE_PERMISSION (ref_roleid, ref_permissionid)
values ('1', '1');
insert into T_ROLE_PERMISSION (ref_roleid, ref_permissionid)
values ('1', '2');
insert into T_ROLE_PERMISSION (ref_roleid, ref_permissionid)
values ('1', '3');
insert into T_ROLE_PERMISSION (ref_roleid, ref_permissionid)
values ('1', '4');
commit;
prompt 4 records loaded
prompt Loading T_USER...
insert into T_USER (id, name, email, password, age)
values ('2430', '黄达盛', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 64);
insert into T_USER (id, name, email, password, age)
values ('2431', '黄达盛2', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 12);
insert into T_USER (id, name, email, password, age)
values ('2432', '黄达盛22', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 12);
insert into T_USER (id, name, email, password, age)
values ('2433', '黄达盛332', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 28);
insert into T_USER (id, name, email, password, age)
values ('2434', '黄达盛re332', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 26);
insert into T_USER (id, name, email, password, age)
values ('2435', '黄达盛ddsd332', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 21);
insert into T_USER (id, name, email, password, age)
values ('2436', '黄达盛dsd544332', '1107229735@qq.com', 'fc1709d0a95a6be30bc5926fdb7f22f4', 27);
commit;
prompt 7 records loaded
prompt Loading T_USER_ROLE...
insert into T_USER_ROLE (ref_userid, ref_roleid)
values (2430, '1');
commit;
prompt 1 records loaded
prompt Enabling triggers for T_PERMISSION...
alter table T_PERMISSION enable all triggers;
prompt Enabling triggers for T_ROLE...
alter table T_ROLE enable all triggers;
prompt Enabling triggers for T_ROLE_PERMISSION...
alter table T_ROLE_PERMISSION enable all triggers;
prompt Enabling triggers for T_USER...
alter table T_USER enable all triggers;
prompt Enabling triggers for T_USER_ROLE...
alter table T_USER_ROLE enable all triggers;

set feedback on
set define on
prompt Done
