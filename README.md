# MDI-Design-Pattern-Pinard_Bruyas

## Objectif
L'objectif de ces tp est de comprendre et implémenter les patrons de conception suivants : observer, visitor, decorator et state.

## TP1 : Pattern Observer


## TP2 : Pattern Visitor


## TP3 : Pattern Decorate & State
### 3.1
* La fleche entre Commande et Pizza doit être inversée , une pizza ne possède pas de commande, mais une commande doit posséder une référence vers la ou les pizzas commandées.
* Certaine relation ne sont pas claire ou sont en trop, par exemple le moyen de transport a juste besoin d'être relié au collaborateur, et pas à la commande vu que la commande connait déjà son collaborateur.
* Aucun élement ne sont présent pour gérer les happy hours.
* On a pas forcément besoin de commaitre les types et la visibilité des éléments dans ce diagramme.

### 3.2
Ici, le pattern décorateur est utile pour pouvoir ajouter de nouvelles règles sans avoir à modifier tout le code existant.
