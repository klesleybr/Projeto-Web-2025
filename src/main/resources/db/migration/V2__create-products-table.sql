CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS products(
	id UUID DEFAULT gen_random_uuid() PRIMARY KEY NOT NULL,
	name VARCHAR(100) NOT NULL,
	manufacturer VARCHAR(100) NOT NULL,
	description VARCHAR(250),
	weight DECIMAL,
	volume DECIMAL,
	picture TEXT
);