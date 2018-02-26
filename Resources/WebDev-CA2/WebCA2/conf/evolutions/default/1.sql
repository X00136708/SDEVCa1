# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table events (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  venue                         varchar(255),
  date                          varchar(255),
  price                         double not null,
  category_id                   bigint,
  constraint pk_events primary key (id)
);

create table user (
  email                         varchar(255) not null,
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

create table venues (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  country                       varchar(255),
  city                          varchar(255),
  capacity                      integer not null,
  constraint pk_venues primary key (id)
);

alter table events add constraint fk_events_category_id foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_events_category_id on events (category_id);


# --- !Downs

alter table events drop constraint if exists fk_events_category_id;
drop index if exists ix_events_category_id;

drop table if exists category;

drop table if exists events;

drop table if exists user;

drop table if exists venues;

