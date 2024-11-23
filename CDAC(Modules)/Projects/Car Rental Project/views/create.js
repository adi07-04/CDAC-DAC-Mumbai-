document.addEventListener("DOMContentLoaded", function() {
    document.getElementById("myForm").addEventListener("submit", function(event) {
      // Get form values
      const pickupDate = new Date(document.getElementById("pickup_date").value);
      const returnDate = new Date(document.getElementById("return_date").value);
      const phoneNo = document.getElementById("phone_no").value;
  
      console.log("Pickup Date:", pickupDate); 
      console.log("Return Date:", returnDate); 
      console.log("Phone Number:", phoneNo); 
  
      // Date validation
      if (returnDate <= pickupDate) {
        alert("Return date must be after the pickup date.");
        event.preventDefault(); 
        return;
      }
  
      // Phone number validation (10 digits)
      const phoneRegex = /^\d{10}$/;
      if (!phoneRegex.test(phoneNo)) {
        alert("Please enter a valid 10-digit phone number.");
        event.preventDefault(); 
        return;
      }
    });
  });
  
  
