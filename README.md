# Demo
How to run?

Its using in-memory H2-DB, which is seeded with some data using sql and some programmatically loaded.
Please run below command to execute the project.

./mvnw spring-boot:run

userName=user

password will be generated instantly on the console as you run the command  './mvnw spring-boot:run'

example: Using default security password: ae4e6cca-f21a-4ef7-9b58-3ffd53769ad5

By default port is 8080. Below are the service endpoints exposed to read from the DB.

<host>:<port>/getAllPrice

<host>:<port>/getPriceByArticle?article=Milk

<host>:<port>/getPriceByVendor?vendor=Costco
