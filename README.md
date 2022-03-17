# ENSITECH
## technologies :
* java 11
* Spring 5
* Spring Boot 2
* MySQL
* Docker
* Lombok
### Modules Spring :
#### Spring data :
Spring data jpa est une implemantation de la spécification JPA, il nous aide à faire le mapping "enregistrement<-->objet java", j'ai utilisé dans ce projet pour implementer la couche DAO.
#### Spring MVC :
Spring MVC est un framwork qui implémente le pattern MVC, dans mon je l'ai utilisé avec Thymleaf et MySQL.
## fonctionnalités :
dans cette version j'ai pu implementer l'affichage et l'ajout des etudiants.
* ajouter étudiant : allez sur /home et clicker new Etudiant
* Afficher les étudiant : aller sur /home
* s'authentifier : allez sur /login
* page d'accueil : /
## DevOps
### Docker
j'ai développé une image docker, cette image docker prend les jars compilés dans target et les place dans le conteneur puis les exécuter avec la commande java -jar