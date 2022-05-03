package com.coderkprathore.jetpackcompose.lazycolumndog.data

import com.coderkprathore.jetpackcompose.R

object DataProvider {
    val puppy = Puppy(
        id = 1,
        title = "Monty",
        sex ="Male" ,
        age = 14,
        description = "Monty enjoys chicken treats and Cuddling while watching seinfeld.",
        puppyImageId = R.drawable.picture1
    )

    val puppyList = listOf(
        puppy,
        Puppy(
            id = 2,
            title = "Jubilee",
            sex ="Female" ,
            age = 6,
            description = "Jubilee enjoys thoughtful discussion by the campfire.",
            puppyImageId =R.drawable.picture2
        ),
        Puppy(
            id = 3,
            title = "Beezy",
            sex ="Male" ,
            age = 8,
            description = "Beezy's favorite past-time is helping you choose your brand color.",
            puppyImageId =R.drawable.picture3
        ),
        Puppy(
            id = 4,
            title = "Mochi",
            sex ="Male" ,
            age = 10,
            description = "Mochi is the perfact \"rubbery ducty\" debugging pup, always listening",
            puppyImageId =R.drawable.picture4
        ),
        Puppy(
            id = 5,
            title = "Brewery",
            sex ="Female" ,
            age = 12,
            description = "Brewery loves fetching you your favorite homebrew.",
            puppyImageId =R.drawable.picture5
        ),
        Puppy(
            id = 6,
            title = "Lucy",
            sex ="Female" ,
            age = 9,
            description = "Picture yourself in a boat on a river, Lucy is a pup with kaleidoscope eyes.",
            puppyImageId =R.drawable.picture6
        ),
        Puppy(
            id = 7,
            title = "Astro",
            sex ="Male" ,
            age = 10,
            description = "Is it a bird? A plane? No, it's Astro blasting off into your heart! ",
            puppyImageId =R.drawable.picture7
        ),
        Puppy(
            id = 8,
            title = "Boo",
            sex ="Female" ,
            age = 9,
            description = "Boo is just a teddy bear in disguise. what he lacks in grace, he makes up in charm.",
            puppyImageId =R.drawable.picture8
        ),
        Puppy(
            id = 9,
            title = "Pippa",
            sex ="Male" ,
            age = 7,
            description = "Pippa likes to look out the window and write pup-poetry.",
            puppyImageId =R.drawable.picture9
        ),
        Puppy(
            id = 10,
            title = "Coco",
            sex ="Female" ,
            age = 10,
            description = "Coco enjoys getting pampered at the local puppy spa.",
            puppyImageId =R.drawable.picture10
        ),
        Puppy(
            id = 11,
            title = "Bordy",
            sex ="Male" ,
            age = 13,
            description = "Brody is a good boy, waiting for your next command.",
            puppyImageId =R.drawable.picture11
        ),
        Puppy(
            id = 12,
            title = "Stella",
            sex ="Female" ,
            age = 14,
            description = "Stella! Calm and always up for a challenge, she's the perfect companion.",
            puppyImageId =R.drawable.picture12
        )

    )
}