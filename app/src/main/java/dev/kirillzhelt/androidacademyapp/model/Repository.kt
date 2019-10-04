package dev.kirillzhelt.androidacademyapp.model

class Repository {

    private val films = listOf(
        Film("https://image.tmdb.org/t/p/w342/c9XxwwhPHdaImA2f1WEfEsbhaFB.jpg",
            "Jurassic World",
            "Twenty-two years after the original Jurassic Park failed, the new park, also known as Jurassic World, is open for business. After years of studying genetics, the scientists on the park genetically engineer a new breed of dinosaur, the Indominus Rex. When everything goes horribly wrong, will our heroes make it off the island?"),
        Film("https://image.tmdb.org/t/p/w342/eyWICPcxOuTcDDDbTMOZawoOn8d.jpg",
            "The Meg",
            "Rescue diver Jonas Taylor is attempting to save the crew of a damaged nuclear submarine when he sees the hull of the sub being rammed by a giant creature. Two of his crew are trapped in the damaged sub; Taylor is forced to flee, realizing that attempting rescue would result in the death of everyone on the deep-submergence rescue vehicle. Moments later, the nuclear sub explodes. Taylor's account of the story is dismissed by fellow survivor Dr. Heller, who believes that Taylor turned coward due to pressure-induced psychosis."),
        Film("https://image.tmdb.org/t/p/w342/2slvblTroiT1lY9bYLK7Amigo1k.jpg",
            "The First Purge",
            "America's third political party, the New Founding Fathers of America, comes to power and conducts an experiment: no laws for 12 hours on Staten Island. No one has to stay on the island, but \$5,000 is given to anyone who does."),
        Film("https://image.tmdb.org/t/p/w342/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg",
            "Deadpool 2",
            "Foul-mouthed mutant mercenary Wade Wilson (AKA. Deadpool), brings together a team of fellow mutant rogues to protect a young boy with supernatural abilities from the brutal, time-traveling cyborg, Cable."),
        Film("https://image.tmdb.org/t/p/w342/uxzzxijgPIY7slzFvMotPv8wjKA.jpg",
            "Black Panther",
            "After the events of Captain America: Civil War, Prince T'Challa returns home to the reclusive, technologically advanced African nation of Wakanda to serve as his country's new king. However, T'Challa soon finds that he is challenged for the throne from factions within his own country. When two foes conspire to destroy Wakanda, the hero known as Black Panther must team up with C.I.A. agent Everett K. Ross and members of the Dora Milaje, Wakandan special forces, to prevent Wakanda from being dragged into a world war."),
        Film("https://image.tmdb.org/t/p/w342/MvYpKlpFukTivnlBhizGbkAe3v.jpg",
            "Ocean's Eight",
            "Debbie Ocean gathers an all-female crew to attempt an impossible heist at New York City's yearly Met Gala."),
        Film("https://image.tmdb.org/t/p/w342/nBNZadXqJSdt05SHLqgT0HuC5Gm.jpg",
            "Interstellar",
            "Earth's future has been riddled by disasters, famines, and droughts. There is only one way to ensure mankind's survival: Interstellar travel. A newly discovered wormhole in the far reaches of our solar system allows a team of astronauts to go where no man has gone before, a planet that may have the right environment to sustain human life."),
        Film("https://image.tmdb.org/t/p/w342/rzRwTcFvttcN1ZpX2xv4j3tSdJu.jpg",
            "Thor - Ragnarok",
            "Thor (Chris Hemsworth) is imprisoned on the other side of the universe and finds himself in a race against time to get back to Asgard to stop Ragnarök, the destruction of his homeworld and the end of Asgardian civilization, at the hands of an all-powerful new threat, the ruthless Hela (Cate Blanchett)."),
        Film("https://image.tmdb.org/t/p/w342/y31QB9kn3XSudA15tV7UWQ9XLuW.jpg",
            "Guardians Of The Galaxy",
            "he Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.")
        )

    fun loadFilms() = films
}