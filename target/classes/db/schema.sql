prompt PL/SQL Developer Export User Objects for user SYSTEM@ORCL
prompt Created by huangdasheng on 2019年5月4日
set define off
spool ddfd.log

prompt
prompt Creating table T_PERMISSION
prompt ===========================
prompt
create table T_PERMISSION
(
  permissionid     VARCHAR2(20) not null,
  permissionname   VARCHAR2(50),
  permissionznname VARCHAR2(50)
)
;
alter table T_PERMISSION
  add constraint PERMISSIONID primary key (PERMISSIONID);

prompt
prompt Creating table T_ROLE
prompt =====================
prompt
create table T_ROLE
(
  roleid   VARCHAR2(20) not null,
  rolename VARCHAR2(20)
)
;
alter table T_ROLE
  add constraint ROLEID primary key (ROLEID);

prompt
prompt Creating table T_ROLE_PERMISSION
prompt ================================
prompt
create table T_ROLE_PERMISSION
(
  ref_roleid       VARCHAR2(20) not null,
  ref_permissionid VARCHAR2(20) not null
)
;
alter table T_ROLE_PERMISSION
  add constraint REF_ROLEIDREF_PERMISSIONID primary key (REF_ROLEID, REF_PERMISSIONID);

prompt
prompt Creating table T_USER
prompt =====================
prompt
create table T_USER
(
  id       VARCHAR2(20) not null,
  name     VARCHAR2(20),
  email    VARCHAR2(20),
  password VARCHAR2(50),
  age      NUMBER(3)
)
;
alter table T_USER
  add constraint ID primary key (ID);

prompt
prompt Creating table T_USER_ROLE
prompt ==========================
prompt
create table T_USER_ROLE
(
  ref_userid NUMBER(8) not null,
  ref_roleid VARCHAR2(20) not null
)
;
alter table T_USER_ROLE
  add constraint PRIMARYREF_USERIDREF_ROLEID primary key (REF_USERID, REF_ROLEID);


prompt Done
spool off
set define on
