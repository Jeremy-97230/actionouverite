package mq.synsuka.actionouverite.data

class Questions{

    companion object{

        fun getActions(): ArrayList<QuestionFormat>{
            val questions =  arrayListOf<QuestionFormat>(
                QuestionFormat("action", "Touche ta tete.", 1),
                QuestionFormat("action", "Mange du piment", 3),
                QuestionFormat("action", "Saute 15x a cloche pied.", 1),
                QuestionFormat("action", "Retiens ta respiration 25 min.", 3),
                QuestionFormat("action", "Calcule 5 X 6 - 39 en 10s.", 2),
                QuestionFormat("action", "Ne pas regarder son téléphone pendant 2 heures", 2),
                QuestionFormat("action", "Poster une photo moche sur Instagram", 2),
                QuestionFormat("action", "Embrassez la personne que vous trouvez le/la plus beau/belle", 2),
                QuestionFormat("action", "Ne plus pouvoir dire ni oui ni non toute la soirée", 2),
                QuestionFormat("action", "Ponctuer toutes vos phrases d'un gros mot", 2),
                QuestionFormat("action", "Twerker", 2),
                QuestionFormat("action", "Lécher le cou d'un.e personne du groupe", 2),
                QuestionFormat("action", "Faites du rap freestyle pendant 1 minute sur les autres participants.", 2),
                QuestionFormat("action", "Buvez du jus de citron.", 2),
                QuestionFormat("action", "Échangez des vêtements avec une personne du sexe opposé pendant 2 tours.", 2),
                QuestionFormat("action", "Parlez avec un accent jamaïcain jusqu'à votre prochain tour", 2),
                QuestionFormat("action", "Nommez une personne célèbre qui ressemble à chaque joueur", 2),
                QuestionFormat("action", " Tournez environ 12 fois et essayez de marcher droit", 2),
                QuestionFormat("action", "Mettez un bandeau sur les yeux et touchez le visage des autres joueurs jusqu'à ce que vous puissiez découvrir de qui il s'agit", 2),
                QuestionFormat("action", "Laissez les autres joueurs refaire votre coiffure.", 2),
                QuestionFormat("action", "Chantez l'hymne national avec un accent britannique.", 2),
                QuestionFormat("action", "Dire 3 fois : les chaussettes de l’archiduchesse sont-elles sèches ? Archi-sèches !", 2),
                QuestionFormat("action", "Présenter un évènement de la journée à la façon d’un présentateur de JT.", 2),
                QuestionFormat("action", "Réciter l’alphabet à l’envers.", 2),
                QuestionFormat("action", "Toucher son front avec son pied.", 2),
                QuestionFormat("action", "Danser le tango avec ton voisin de droite.", 2),
                QuestionFormat("action", "Se frotter le ventre en se tapant la tête.", 2),
                QuestionFormat("action", "Appeler votre partenaire pour lui dire que vous êtes enceinte", 2),
                QuestionFormat("action", "Appeler un numéro inconnu et commander une pizza", 2),
                QuestionFormat("action", "Envoyer une photo chaude à une personne choisie par le reste du groupe", 2),
                QuestionFormat("action", "Envoyez un audio à quelqu'un dans lequel vous prétendez avoir un orgasme", 2),
                QuestionFormat("action", "Mettez-vous sur une autre personne durant le prochain tour", 2),
                QuestionFormat("action", "Envoyez un message cochon à la personne du groupe de votre choix", 2),
                QuestionFormat("action", "Montrez votre jouet sexuel préféré", 2),
            )
            return questions
        }

        fun getVerites(): ArrayList<QuestionFormat>{
            val questions =  arrayListOf<QuestionFormat>(
                QuestionFormat("verite", "Quelle est la personne la plus sexy ici ?", 1),
                QuestionFormat("verite", "T'as déjà entendu tes parents en train de le faire ?", 1),
                QuestionFormat("verite", "Tu t'es déjà fait pipi dessus en dormant ?", 1),
                QuestionFormat("verite", "Tu te rases les parties intimes ?", 1),
                QuestionFormat("verite", "Quel est ton film préféré ?", 1),
                QuestionFormat("verite", "Raconte la plus grande honte que tu as vécue ?", 1),
                QuestionFormat("verite", "Quel est le rêve le plus étrange que tu aies fait ?", 1),
                QuestionFormat("verite", "Si aujourd’hui était le dernier jour de ta vie, que ferais-tu ?", 1),
                QuestionFormat("verite", "De 0 à 10. Quelle note donnerais-tu (choisir quelqu'un du groupe) en beauté, sympathie ou intelligence ?", 1),
                QuestionFormat("verite", "Quel est le pire cadeau que tu aies jamais reçu ?", 1),
                QuestionFormat("verite", "As-tu déjà nagé nu dans l'eau ?", 1),
                QuestionFormat("verite", "As-tu déjà envoyé une photo coquine par portable ?", 1),
                QuestionFormat("verite", "As-tu déjà embrassé plusieurs personnes le même jour ?", 1),
                QuestionFormat("verite", "Te crois-tu attirant.e ?", 1),
                QuestionFormat("verite", "Si tu pouvais voyager dans le temps, à quelle époque irais-tu ?", 1),
                QuestionFormat("verite", "As-tu menti en jouant à ce jeu ?", 1),
                QuestionFormat("verite", "Quelle est ta technique de séduction ?", 1),
                QuestionFormat("verite", "Quel le plus grand mensonge que tu aies raconté ?", 1),
                QuestionFormat("verite", "T'as déjà commis un délit ?", 1),
                QuestionFormat("verite", "Quel est le membre préféré de ta famille ?", 1),
                QuestionFormat("verite", "Quelle est la célébrité que tu trouves le plus beau ?", 1),
                QuestionFormat("verite", "Quelle est la célébrité que tu trouves la plus belle ?", 1),
                QuestionFormat("verite", "Tu t'es déjà fait pipi dessus, si oui, raconte-nous tout !", 1),
                QuestionFormat("verite", "Tu t'es déjà fait caca dessus, si oui, raconte-nous l'histoire complète !", 1),
                QuestionFormat("verite", "T'as déjà été amoureux.se ?", 1),
                QuestionFormat("verite", "Avec quelle personne célèbre tu coucherais ?", 1),
                QuestionFormat("verite", "T'es déjà parti.e sans payer l'addition ?", 1),
                QuestionFormat("verite", "Tu ronfles ?", 1),
                QuestionFormat("verite", "Tu crois au destin ?", 1),
                QuestionFormat("verite", "Tu crois au coup de foudre ?", 1),
                QuestionFormat("verite", "T'as déjà dormi dans la rue ?", 1),
                QuestionFormat("verite", "T'as déjà rembourré ton soutif ou ton slip ?", 1),
                QuestionFormat("verite", "Voudrais-tu avoir des relations sexuelles avec une personne de ce groupe ?", 1),
                QuestionFormat("verite", "Si tu étais aveugle, qui autour de cette table serait ton chien d'aveugle ?", 1),

            )
            return questions
        }
    }

}
