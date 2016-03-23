# ORM-Hibernate-Project
ORM   
Medverkande: Pierre, Didrik, Hannes   

Du jobbar på ett företag som använder JDBC och MySQL. Chefen vill att er arbetsgrupp utvärderar om företaget ska byta till något ORM-ramverk som Hibernate. Ni behöver i gruppen då orientera er i följande frågor/områden:    

Vad är ORM?   
En programmeringsteknik för att omvandla/mappa data mellan relationsdatabaser ochi objektorienterade programspråk. Tabeller översätts tills klasser, tabellrader till objekt, och tabell-celler till objekt-attribut.   

Vad är Hibernate ORM?   
Hibernate ORM är Java-specificerad, open-source ramverk som använder JDBC-tekniken.   

Det finns något "mismatch"-problem, vad är det chefen har hört talas om?    
Objektorienterad kod översätts inte bra direkt till RDBMS. Hur man inom OOP kommer åt objekt, använder pekare till dem, kontrollerar likhet (equals, ==), och ärver, skiljer sig fundamentalt från RDBMS. Dessutom bör antal klasser stämma överens med antal tabeller.    

Vilka andra teknologier liknar Hibernate? Finns det något bättre alternativ än Hibernate?   
Det finns andra alternativ, såsom MyBatis, jOOQ eller Sormula. Dock är Hibernate väldigt populärt, och används inom Spring-ramverket.   

Vilka andra teknologier är Hibernate beroende av (eller använder sig av)? Behöver man kunna något mer än Hibernate?   
Kan vara bra att kunna SQL tänket eftersom man lär sig använda jar filer vad det gäller drivrutiner till ens databas, tex Oracle, Sqlite osv. Dessutom om man är van vid HTML, då man skriver konfigurations-filerna i XML-format, så är det en fördel.    

Kan ni skriva ett exempel med en klass som mappas till en databas med Hibernate? (hitta ngn tutorial/material till hjälp!)
Se kod i GitHub-repot.
