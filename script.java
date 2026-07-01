// Select elements
const envelope = document.getElementById('envelope');
const letter = document.getElementById('letter');
let isOpened = false;

// Open envelope on click
envelope.addEventListener('click', () => {
    if (!isOpened) {
        isOpened = true;
        envelope.classList.add('open');
        
        // Show letter + hearts after animation
        setTimeout(() => {
            letter.classList.add('show');
            createFloatingHearts();
        }, 1000);
    }
});

// Generate floating hearts
function createFloatingHearts() {
    setInterval(() => {
        const heart = document.createElement('div');
        heart.classList.add('heart');
        
        // Random heart emoji
        const heartEmojis = ['❤️', '💕', '💖', '💗', '💓', '🌹'];
        heart.innerHTML = heartEmojis[Math.floor(Math.random() * heartEmojis.length)];
        
        // Random position & speed
        heart.style.left = Math.random() * 100 + 'vw';
        heart.style.animationDuration = (Math.random() * 3 + 4) + 's';
        
        document.body.appendChild(heart);
        
        // Auto remove hearts
        setTimeout(() => heart.remove(), 7000);
    }, 350);
}
