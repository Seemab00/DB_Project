-- 1. Customers table
CREATE TABLE customer (
    customer_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    mobile_no VARCHAR(20) NOT NULL,
    role VARCHAR(20) NOT NULL DEFAULT 'customer'
);

-- 2. Customer Order table 
CREATE TABLE customerorder (
    order_id INT NOT NULL PRIMARY KEY, 
    customer_id INT NOT NULL,
    cake_type VARCHAR(100) NOT NULL,
    size VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    price INT NOT NULL,
    rating VARCHAR(50) NOT NULL,
    feedback VARCHAR(50) NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

-- 3. Customer Delivery Address table
CREATE TABLE customerdeliveryadress (
    order_id INT NOT NULL PRIMARY KEY,
    house_no VARCHAR(20) NOT NULL,
    street_no VARCHAR(50) NOT NULL,
    city VARCHAR(100) NOT NULL,
    date VARCHAR(100) NOT NULL,
    day VARCHAR(100) NOT NULL,
    time VARCHAR(50),
    FOREIGN KEY (order_id) REFERENCES customerorder(order_id)
);

-- 4. Customer Payment table
CREATE TABLE customerpayment (
    order_id INT NOT NULL PRIMARY KEY,
    mobile_no VARCHAR(20) NOT NULL,
    payment_type VARCHAR(50) DEFAULT 'Not Selected',
    payment_status VARCHAR(50) DEFAULT 'Pending',
    FOREIGN KEY (order_id) REFERENCES customerorder(order_id)
);

-- 5. Admin Order table 
CREATE TABLE adminorder (
    order_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, 
    customer_id INT NOT NULL,
    customer_name VARCHAR(50) NOT NULL,
    order_status VARCHAR(50) DEFAULT 'In Progress',
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

-- 6. Delivery Personal table
CREATE TABLE deliverypersonal (
    personal_id INT AUTO_INCREMENT PRIMARY KEY,
    personal_name VARCHAR(50) NOT NULL,
    order_id INT NOT NULL, 
    email VARCHAR(100) NOT NULL UNIQUE,
    mobile_no VARCHAR(20) NOT NULL,
    personal_status VARCHAR(50) DEFAULT 'Pending',
    FOREIGN KEY (order_id) REFERENCES adminorder(order_id)
);

-- 7. Cake Menu table
CREATE TABLE cake (
    cake_flavor VARCHAR(100) NOT NULL PRIMARY KEY,
    size VARCHAR(20) NOT NULL,
    price INT NOT NULL
);