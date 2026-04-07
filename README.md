C'est noté ! J'ai supprimé toutes les balises de citation pour que tu puisses copier-coller le texte directement dans ton fichier `README.md` sur GitHub.

---

# 🚗 Projet Auto+ : Gestion de Concessionnaire

Bienvenue sur le repository **scenar-classes** ! Ce projet Java a été réalisé pour aider le concessionnaire **Auto+** à gérer son parc de 200 véhicules.

## 📝 Présentation du projet
L'objectif est de passer d'un simple stockage de données dans des variables à une véritable **programmation orientée objet (POO)**.



## 🛠️ Ce que contient le projet

Le projet est divisé en plusieurs étapes clés (missions) :

* **Mission 1 :** Création d'un premier programme avec des variables simples pour une Peugeot 208.
* **Mission 3 & 4 :** Création de la classe `Voiture` et apprentissage de l'**instanciation** (création d'objets comme `v1` et `v2`).
* **Mission 5 :** Utilisation d'un **constructeur** pour créer des voitures plus rapidement en une seule ligne.
* **Mission 6 :** Association de classes. Chaque `Voiture` possède désormais un objet `Pneu`.

---

## 💡 Concepts Clés

### 🏗️ La Classe
C'est le **moule** ou le plan de fabrication. Par exemple, la classe `Voiture` définit qu'une voiture a toujours une marque, un modèle et un prix.

### 🚗 L'Objet
C'est le véhicule réel fabriqué à partir du moule. `v1` est un objet (une Peugeot spécifique), tandis que la classe est le concept général.

### 🛠️ Le Constructeur
C'est le bloc de code qui permet d'initialiser les caractéristiques d'un objet dès sa création.

---

## 🚀 Comment utiliser ce projet ?

1.  **Ouvrir le projet :** Utilise un logiciel comme **NetBeans**.
2.  **Créer une voiture :** Grâce au constructeur, tu peux ajouter un véhicule facilement dans le `Main` :
    ```java
    Voiture maVoiture = new Voiture("Toyota", "Yaris", 2015, 9800);
    ```
3.  **Gérer les pneus :** Tu dois d'abord créer un pneu avant de l'ajouter à une voiture :
    ```java
    Pneu p1 = new Pneu(205, 55, 16, "été");
    Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500, p1);
    ```

---
