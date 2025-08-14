CREATE table if not exists  product (
    product_id int auto_increment primary key ,
    name varchar(50) not null,
    price int 
);



CREATE table if not exists customer (
customer_id int auto_increment primary key ,
name varchar(50) not null,
email varchar(50) unique not null,
address text not null,
phone int
)


CREATE table if not exists order_data (
order_id int auto_increment primary key,
order_date DATE,
customer_id int  ,

foreign key(customer_id ) references customer(customer_id )
)


create table products_orders(
order_id int not null,
product_id int not null,
primary key(order_id, product_id ),
CONSTRAINT fk_orders foreign key (order_id) references  order_data(order_id),
CONSTRAINT fk_products foreign key (product_id ) references product (product_id )
)


CREATE TABLE shipment (
    shipment_id int auto_increment key,
    order_id int not null,
    date DATE,
    status varchar(50),
    FOREIGN KEY (order_id) REFERENCES order_data(order_id)
);
