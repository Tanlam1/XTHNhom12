use master
go

if db_id('g12shop') is not null
drop database g12shop
go

create database g12shop
go

use g12shop
go

create table roles
(
	id				bigint			primary key identity,  -- auto_increment
	[name]	        varchar(20)	    not null unique
)
go

create table accounts
(
	id				bigint			primary key identity,
	username		varchar(20)		not null unique,
	fullname		nvarchar(50)	null,
	hashPassword	varchar(255)	not null,
	email			varchar(100)	not null unique,
	isEnabled			bit           not null default 0,
	authProvider     varchar(15)    null,
	resetPasswordToken		varchar(30)		null,
	verificationCode		varchar(64)		null,
	createdDate		datetime		not null default getdate(), -- now()
	imgUrl			varchar(255)	null,
	roleId			bigint			foreign key references roles(id),
	isDeleted		bit				not null default 0 -- 0: false, 1: true
)
go

create table categories
(
	id				bigint			primary key identity,
	[name]	        nvarchar(500)	not null,
	slug			varchar(255)	not null,
	isDeleted		bit				not null default 0
)
go



create table products
(
	id				bigint			primary key identity,
	[name]			nvarchar(255)	not null,
	categoryId		bigint			foreign key references categories(id),
	quantity		int				not null,
	price			decimal(12,3)	not null,
	imgName			varchar(255)	not null,
	[description]	ntext			not null,
	discount	    int             null,
	slug			varchar(255)	not null unique,
	isDeleted		bit				not null default 0
)
go
create table product_images(
	id				bigint					 primary key identity,
	productId		bigint					 foreign key references products(id),
	imgName         varchar(255)  not null,				
)
go
create table product_reviews(
id				bigint				primary key identity,
productId		bigint				foreign key references products(id),
[description]   ntext		null,
accountId       bigint				foreign key references accounts(id),

)

go

create table orders
(
	id				bigint					primary key identity,
	accountId		bigint					foreign key references accounts(id),
	[address]		nvarchar(255)	not null,
	phone			varchar(11)		not null,
	statusOrder     Nvarchar(255)	not null,
	createdDate		datetime		not null default getdate()
)
go

create table order_details
(
	id				bigint			primary key identity,
	orderId			bigint			foreign key references orders(id),
	productId		bigint			foreign key references products(id),
	price			decimal(12,3)	not null,
	quantity		int				not null,
	statusOrder     Nvarchar(255)	not null,		
)
go
