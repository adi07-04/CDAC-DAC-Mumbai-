const express = require("express"); 
const app = express(); 
const cors = require("cors");
const dotenv = require("dotenv");
var bodyParser = require("body-parser");
const connection = require("./config/db.js");



dotenv.config();
app.use(bodyParser.urlencoded({ extended: true }));
app.set("view engine", "ejs");
app.use(cors());
app.use(express.json());
app.use(express.static(__dirname + "/public"));
app.use(express.static(__dirname + "/views"));





// READ - Retrieve and display all data
app.get("/data", (req, res) => {
  connection.query("SELECT * FROM user",(err,rows) =>{
 
    if (err) {
      res.send(err);
    } else {
      res.render("read.ejs", { rows });
    }
  });
});

// udate final
app.post("/final-update", (req, res) => {
  const { hidden_id, first_name, last_name, email, phone_no, address, pickup_date, return_date } = req.body;

  const updateQuery = `
    UPDATE user 
    SET first_name=?, last_name=?, email=?, phone_no=?, address=?, pickup_date=?, return_date=? 
    WHERE id=?`;

  connection.query(
    updateQuery,
    [first_name, last_name, email, phone_no, address, pickup_date, return_date, hidden_id],
    (err, rows) => {
      if (err) {
        console.log(err);
        res.status(500).send("Error updating user data");
      } else {
        res.redirect("/data");
      }
    }
  );
});



// CREATE - Insert new data into the user table
app.post("/create", (req, res) => {
    const { car_model_no, first_name, last_name, email, phone_no, address, pickup_date, return_date } = req.body;
    try {
      connection.query(
        "INSERT INTO user (car_model_no, first_name, last_name, email, phone_no, address, pickup_date, return_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
        [car_model_no, first_name, last_name, email, phone_no, address, pickup_date, return_date],
        function (err, result) {
          if (err) {
            console.log(err);
            res.send(err);
          } else {
            res.redirect("/data");
          }
        }
      );
    } catch (err) {
      res.send(err);
    }
  });
  

// DELETE - Remove a record based on ID
app.get("/delete-data", (req, res) => {
  const deleteData = "DELETE FROM user WHERE id=?";
  connection.query(deleteData, [req.query.id], (err, rows) => {
    if (err) {
      res.send(err);
    } else {
      res.redirect("/data");
    }
  });
});

// PASSING DATA TO UPDATE PAGE
app.get("/update-data", (req, res) => {
  connection.query("SELECT * FROM user WHERE id=?", [req.query.id], (err, eachRow) => {
    if (err) {
      res.send(err);
    } else {
 
      const result = JSON.parse(JSON.stringify(eachRow[0]));

      
      if (result.pickup_date) {
        result.pickup_date = new Date(result.pickup_date);  
      }
      if (result.return_date) {
        result.return_date = new Date(result.return_date);  
      }

      
      res.render("edit.ejs", { result });
    }
  });  
});




// FINAL UPDATE - Updating existing data in user table
app.post("/final-update", (req, res) => {
    const id = req.body.hidden_id;
    const modelno = req.body.car_model_no;
    const fname = req.body.first_name;
    const lname= req.body.last_name;
    const email= req.body.email;
    const pno=req.body.phone_no;
    const addr=req.body.address;
    const pickupd=req.body.pickup_date;
    const returnd=req.body.return_date;
     console.log(req.body);
    const updateQuery = "update user set car_model_no=?, first_name=?,last_name=?, email=?,phone_no=?,address=?,pickup_date=?,return_date=?,where id=?";
    connection.query(
      updateQuery,
      [ id,modelno,fname,lname,email,pno,addr,pickupd,returnd],
      (err, rows) => {
        if (err) {
          res.send(err);
        } else {
          res.redirect("/data");
        }
      }
    );
  });




  
  

// Listening on specified port
app.listen(process.env.PORT || 3000, function (err) {
  if (err) console.log(err);
  console.log(`Listening on port ${process.env.PORT || 4000}`);
});
