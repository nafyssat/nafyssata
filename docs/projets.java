<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Projets - Mon Portfolio</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <!-- Inclusion de la barre de navigation -->
    <div id="navbar-container"></div>

    <section id="projets" class="container">
        <h2 class="section-title">Projets</h2>
        <div class="row">
            <div class="col-md-4 project-card">
                <div class="card">
                    <img src="https://via.placeholder.com/350x200" class="card-img-top" alt="Projet 1">
                    <div class="card-body">
                        <h5 class="card-title">Projet 1</h5>
                        <p class="card-text">Description du projet 1.</p>
                    </div>
                </div>
            </div>
            <!-- Ajouter d'autres projets ici -->
        </div>
    </section>

    <script>
        // Charger le fichier navbar.html
        fetch('navbar.html')
            .then(response => response.text())
            .then(data => {
                document.getElementById('navbar-container').innerHTML = data;
            });
    </script>
</body>
</html>
