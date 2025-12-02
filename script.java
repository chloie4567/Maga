 const learnButton = document.querySelector('.button');
const learnSection = document.getElementById('learn-section');

learnButton.addEventListener('click', () => {
  learnSection.classList.toggle('show');
});
