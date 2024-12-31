// Form Validation and Interactivity Script

document.getElementById('fitnessForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const age = document.getElementById('age').value.trim();
    const fitnessGoal = document.getElementById('fitness-goal').value;

    // Validate required fields
    if (!name || !email || !age || !fitnessGoal) {
        alert('Please fill out all fields.');
        return;
    }

    // Validate email format
    if (!/\S+@\S+\.\S+/.test(email)) {
        alert('Please enter a valid email address.');
        return;
    }

    // Show success message
    alert('Form submitted successfully!');

    // Optionally clear the form after submission
    document.getElementById('fitnessForm').reset();
});

// Show the form dynamically
function showForm() {
    const formContainer = document.getElementById('formContainer');
    formContainer.style.display = 'block';
    formContainer.style.opacity = 0;
    let opacity = 0;
    const fadeEffect = setInterval(() => {
        if (opacity < 1) {
            opacity += 0.1;
            formContainer.style.opacity = opacity;
        } else {
            clearInterval(fadeEffect);
        }
    }, 50);
}
