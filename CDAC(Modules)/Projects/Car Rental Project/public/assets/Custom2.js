// Selecting elements
let menu = document.querySelector("#menu-btn");
let navbar = document.querySelector(".navbar");
let header = document.querySelector(".header");
const reservationListContainer = document.getElementById("reservation-list");
const reservationList = [];

// Toggle the navbar visibility when clicking the menu button
menu.onclick = () => {
    menu.classList.toggle("fa-times"); // Toggle menu icon (rotate)
    navbar.classList.toggle("active"); // Toggle navbar visibility
};

document.querySelector('#login-btn').onclick = () => {
    document.querySelector('.login-form-container').classList.toggle('active');
}

document.querySelector('#close-login-form').onclick = () => {
    document.querySelector('.login-form-container').classList.remove('active');
}

// Change header appearance on scroll and collapse menu if open
window.onscroll = () => {
    if (window.scrollY > 0) {
        header.classList.add("active"); // Make header "sticky"
    } else {
        header.classList.remove("active"); // Remove "sticky" style
    }

    // Close menu if scrolling
    menu.classList.remove("fa-times");
    navbar.classList.remove("active");
};

// Ensure the header appears sticky on load if page is scrolled
window.onload = () => {
    if (window.scrollY > 0) {
        header.classList.add("active");
    } else {
        header.classList.remove("active");
    }
};

// Function to display reservations
function displayReservations() {
    reservationListContainer.innerHTML = `<h3>Your Reservations</h3>`;
    if (reservationList.length === 0) {
        reservationListContainer.innerHTML += `<p>No reservations made.</p>`;
        return;
    }
    let table = `<table>
                    <thead>
                        <tr>
                            <th>Location</th>
                            <th>Pick-up Date</th>
                            <th>Return Date</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>`;
    reservationList.forEach((reservation, index) => {
        table += `<tr>
                      <td>${reservation.location}</td>
                      <td>${reservation.pickupDate}</td>
                      <td>${reservation.returnDate}</td>
                      <td><button onclick="deleteReservation(${index})">Cancel</button></td>
                  </tr>`;
    });
    table += `</tbody></table>`;
    reservationListContainer.innerHTML += table;
    reservationListContainer.style.display = 'block'; // Show the table
}

// Function to delete a reservation
function deleteReservation(index) {
    reservationList.splice(index, 1);
    displayReservations();
}

// Event listener for form submission
document.querySelector('.form-container form').onsubmit = (event) => {
    event.preventDefault(); // Prevent form submission

    const location = document.getElementById("location").value;
    const pickupDate = document.getElementById("pickup-date").value;
    const returnDate = document.getElementById("return-date").value;

    // Create a new reservation object
    const newReservation = {
        location: location,
        pickupDate: pickupDate,
        returnDate: returnDate
    };

    // Add the new reservation to the list
    reservationList.push(newReservation);
    
    // Clear the form
    document.querySelector('.form-container form').reset();
    
    // Display the updated list of reservations
    displayReservations();
};
