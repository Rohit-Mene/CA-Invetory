
## Setup Instructions
1. Clone the repository.
2. Set up MySQL database and update `application.properties` with you password.
3. Run the application using IntelliJ IDE

## API Endpoints
- `GET /items`: Fetch all items.
- `GET /items/{id}`: Fetch item by ID.
- `POST /items`: Add a new item.
- `PUT /items/{id}`: Update an existing item.
- `DELETE /items/{id}`: Delete an item.

## Example
In Postman-
- Fetch all items: `http://localhost:8080/items`
- Add item: Give JSON {"name":"Pen","quantity":100,"price":1.5} `http://localhost:8080/items`
