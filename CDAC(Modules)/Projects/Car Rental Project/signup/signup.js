document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("#signup-form");

    form.addEventListener("submit", function (event) {
        event.preventDefault();

        const username = document.querySelector("#username").value;
        const email = document.querySelector("#email").value;
        const password = document.querySelector("#password").value;
        const confirmPassword = document.querySelector("#confirm-password").value;

        // Basic validation
        if (!username || !email || !password || !confirmPassword) {
            alert("Please fill in all fields.");
            return;
        }

        // Email validation
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!emailPattern.test(email)) {
            alert("Please enter a valid email address.");
            return;
        }

        // Password matching validation
        if (password !== confirmPassword) {
            alert("Passwords do not match.");
            return;
        }

        // Simulate successful sign-up (replace with actual backend integration)
        alert("Account created successfully!");
        
        // Optionally, redirect to the login page after successful sign-up
        window.location.href = "login.html";
    });
});
