CREATE table if not exists  admin (
    admin_id int auto_increment primary key ,
    name varchar(50) not null,
    email varchar(50) unique not null,
    password VARCHAR(255) not null
);
-- 
-- INSERT INTO admin ( name, email,password )
-- VALUES
--     ( 'Alice', ''),
--     ( 'Bob', ''),
--     ( 'Charlie', '');