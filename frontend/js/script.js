// script.js
document.getElementById("form").addEventListener("submit", function (e) {
  e.preventDefault();

  const data = {
    username: document.getElementById("username").value,
    email: document.getElementById("email").value,
    message: document.getElementById("message").value
  };

  fetch("http://localhost:8080/api/submit", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(data)
  })
    .then(response => response.text())
    .then(result => {
      document.getElementById("result").textContent = result;
    })
    .catch(error => {
      console.error("Error:", error);
      document.getElementById("result").textContent = "Erreur lors de l'envoi du formulaire.";
    });
});
