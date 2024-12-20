 
const dotenv = require("dotenv");
const mysql = require("mysql2");
dotenv.config();

const connection = mysql.createConnection({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASS,
  database: process.env.DB_NAME,
});

connection.connect((error) => {
  if (error) return console.log(error);
  console.log("connection successfull");
});

module.exports = connection;