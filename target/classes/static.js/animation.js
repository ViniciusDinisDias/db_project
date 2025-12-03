<script>
  // Animações avançadas com JS leve - Fade-in on scroll
  const observerOptions = {
    threshold: 0.1,  // Ativa quando 10% do elemento está visível
    rootMargin: '0px 0px -50px 0px'  // Margem para ativar antes de entrar totalmente na tela
  };

  const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add('visible');  // Adiciona classe para animação
      }
    });
  }, observerOptions);

  // Observa todos os elementos com classe .fade-in
  document.querySelectorAll('.fade-in').forEach(el => observer.observe(el));
</script>