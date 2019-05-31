# MDI-Design-Pattern-Pinard_Bruyas

## Objectif
L'objectif de ces tp est de comprendre et implémenter les patrons de conception suivants : observer, visitor, decorate et state.

## TP1 : Pattern Observer
Le pattern observer est composé de la classe abstraite Subject ainsi qu'une interface Observer. On a une classe Mailbox qui va utiliser le pattern pour dans un premier temps afficher le nombre de mails reçus. Pour cela, la classe Mailbox hérite de Subject et on crée une classe CounterObserver qui implémente l'interface Observer. Dans un deuxième temps, on vaut en plus un affichage des objets des mails. Pour cela, on crée une classe MailObserver qui va elle aussi implémenter l'interface Observer. Nous avons donc nos deux classes observer qui en héritant de Jlabel nous permettent d'afficher les objets ainsi que le nombre de mail.

## TP2 : Pattern Visitor


## TP3 : Pattern Decorate & State
### 3.1
* La fleche entre Commande et Pizza doit être inversée , une pizza ne possède pas de commande, mais une commande doit posséder une référence vers la ou les pizzas commandées.
* Certaine relation ne sont pas claire ou sont en trop, par exemple le moyen de transport a juste besoin d'être relié au collaborateur, et pas à la commande vu que la commande connait déjà son collaborateur.
* Aucun élement ne sont présent pour gérer les happy hours.
* On a pas forcément besoin de commaitre les types et la visibilité des éléments dans ce diagramme.

### 3.2
Ici, le pattern décorateur est utile pour pouvoir ajouter de nouvelles règles sans avoir à modifier tout le code existant.
