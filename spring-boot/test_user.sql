prompt PL/SQL Developer import file
prompt Created on 2018Äê11ÔÂ23ÈÕ by shizhongkai
set feedback off
set define off
prompt Disabling triggers for TEST_USER...
alter table TEST_USER disable all triggers;
prompt Deleting TEST_USER...
delete from TEST_USER;
commit;
prompt Loading TEST_USER...
insert into TEST_USER (ID, NAME, AGE, PASSWORD)
values ('12', 'admin', '23', '123');
insert into TEST_USER (ID, NAME, AGE, PASSWORD)
values ('13', 'xinhualin', '22', '123');
commit;
prompt 2 records loaded
prompt Enabling triggers for TEST_USER...
alter table TEST_USER enable all triggers;
set feedback on
set define on
prompt Done.
