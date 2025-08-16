// Smooth scroll when button clicked
function scrollDown() {
  window.scrollTo({
    top: window.innerHeight,
    behavior: "smooth"
  });
}

// Floating animation for cards
const cards = document.querySelectorAll(".card");
cards.forEach((card, i) => {
  card.style.animation = `floatCard 3s ease-in-out ${i * 0.5}s infinite alternate`;
});

const style = document.createElement("style");
style.innerHTML = `
@keyframes floatCard {
  from { transform: translateY(0); }
  to { transform: translateY(-15px); }
}
`;
document.head.appendChild(style);
