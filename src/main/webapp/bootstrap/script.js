const navSlide = () => {

  const burger = document.querySelector('.burger');
  const nav = document.querySelector('.mynavbar-items');

  burger.addEventListener('click', () => {
    nav.classList.toggle('nav-active')
  });
}

navSlide();