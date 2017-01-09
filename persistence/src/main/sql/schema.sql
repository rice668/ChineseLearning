DROP DATABASE chinese;
CREATE DATABASE chinese;
USE chinese;

create table t_user
(
	id bigint(20) not null auto_increment,
    created_date datetime not null,
    last_modified datetime not null,
    username varchar(100) not null,
    password varchar(100) not null,
    primary key (id)
);
