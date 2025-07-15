/* one to one relationship */
create table tb_categories
(
    id         serial primary key,
    name       char(50),
    is_deleted bool
);

create table tb_contents
(
    id          serial primary key,
    uuid        varchar(255) unique,
    slug        text unique,
    keyword     varchar(255),
    title       text,
    description text,
    thumbnail   text,
    editor      text,
    is_deleted  bool,
    create_at   timestamp,
    category_id int,
    foreign key (category_id) references tb_categories (id)
);

create table tb_users
(
    id           serial primary key,
    uui          varchar(255) unique,
    username     varchar(100),
    password     varchar(100),
    display_name varchar(100),
    is_deleted   bool,
    create_at    timestamp
);

/* many to many relationship */
create table tb_roles
(
    id   serial primary key,
    name varchar(50)
);

create table users_roles
(
    id      serial primary key,
    user_id int,
    role_id int,
    foreign key (user_id) references tb_users (id) on update cascade on delete cascade,
    foreign key (role_id) references tb_roles (id)
);