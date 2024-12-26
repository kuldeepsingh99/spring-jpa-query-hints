-- Create the 'customer' table if it does not exist
CREATE TABLE IF NOT EXISTS customer (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(20) NOT NULL,
    salary DECIMAL(10, 2),
    address VARCHAR(255),
    age INT,
    active BOOLEAN DEFAULT TRUE
);

