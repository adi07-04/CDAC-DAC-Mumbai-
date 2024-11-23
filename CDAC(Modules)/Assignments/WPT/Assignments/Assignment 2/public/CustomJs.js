

document.addEventListener("DOMContentLoaded", function () {
    let menu = document.querySelector("#menu-btn");
    let navbar = document.querySelector(".navbar");
    let header = document.querySelector(".header");
    let reservationList = document.getElementById("reservation-list");
    let form = document.querySelector(".form-container form");
    let currentEditIndex = null;
    const checkButtons = document.querySelectorAll(".v-btn");

    // Menu toggle
    menu.onclick = () => {
        menu.classList.toggle("fa-times");
        navbar.classList.toggle("active");
    };

    // Toggle login form
    document.querySelector('#login-btn').onclick = () => {
        document.querySelector('.login-form-container').classList.toggle('active');
        history.pushState({ modalOpen: true }, "", window.location.href);
    };

    // Close login form
    document.querySelector('#close-login-form').onclick = () => {
        document.querySelector('.login-form-container').classList.remove('active');
        history.back(); // Handle browser back
    };


    window.onscroll = () => {
        if (window.scrollY > 0) {
            header.classList.add("active");
        } else {
            header.classList.remove("active");
        }
        menu.classList.remove("fa-times");
        navbar.classList.remove("active");
    };

    
    window.onload = () => {
        if (window.scrollY > 0) {
            header.classList.add("active");
        } else {
            header.classList.remove("active");
        }
        loadReservations();
    };

    // Button click handling (open link in new tab)
    checkButtons.forEach((button) => {
        button.onclick = (event) => {
            event.preventDefault();
            console.log("Button clicked!");
             window.open("http://localhost:3000/create.html", "_blank"); 
        };
    });

    
    document.querySelector("#login-form").onsubmit = (event) => {
        event.preventDefault(); 

        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;

        // Basic client-side validation
        if (!email || !password) {
            alert("Please fill in both email and password.");
            return;
        }

        // Validate email format
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert("Please enter a valid email address.");
            return;
        }

        
        alert("User logged in successfully.");
        document.querySelector(".login-form-container").classList.remove("active");
        history.back(); 
    };

    // Google Login button
    document.querySelector("#google-login").onclick = (event) => {
        event.preventDefault();
        alert("Google login functionality (simulated).");
    };

    // Facebook Login button
    document.querySelector("#facebook-login").onclick = (event) => {
        event.preventDefault();
        alert("Facebook login functionality (simulated).");
    };

    // Forgot Password functionality
    document.querySelector("#forgot-password").onclick = (event) => {
        event.preventDefault();
        alert("Redirecting to password reset page.");
        window.location.href = "reset-password.html";  // Redirect to actual reset page
    };

    // Create Account functionality
    document.querySelector("#create-account").onclick = (event) => {
        event.preventDefault();
        alert("Redirecting to sign-up page.");
        window.location.href = "signup/signup.html";  // Redirect to actual sign-up page
    };

    // Handle browser back button when modal is open
    window.onpopstate = (event) => {
        if (event.state && event.state.modalOpen) {
            document.querySelector(".login-form-container").classList.remove("active");
        }
    };

});



















    

    




