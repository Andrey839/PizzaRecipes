package ru.skillbranch.devintensive.pizzarecipes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var method: ArrayList<String>
    lateinit var pizzaName: ArrayList<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listPicture = arrayListOf(
            R.drawable.pizza1,
            R.drawable.pizza2,
            R.drawable.pizza3,
            R.drawable.pizza4,
            R.drawable.pizza5
        )
        pizzaName = arrayListOf(
            "Pizza",
            "Pizza Margherita",
            "Superhealthy pizza",
            "Pitta pizzas",
            "Pitta pizzas2"
        )
        val pizzaRecipes = arrayListOf(
            "Make your own pizza with a crispy base, mozzarella cheese and a fresh tomato sauce. Add simple toppings like slices of ham and rocket if you like.",
            "Even a novice cook can master the art of pizza with our simple step-by-step guide. Bellissimo",
            "The quantities for this are generous, so if you have any leftovers, pop a wedge of cold pizza into your lunchbox the next day",
            "Little ones will love these fun and super-easy pizza's for lunch or a light supper",
            "Kids will love this quick supper. Experiment with different toppings such as sweetcorn and ham"
        )

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        val pizza: ArrayList<Object>
        pizza = arrayListOf(Object(listPicture[0], pizzaName[0], pizzaRecipes[0]))
        pizza.add(Object(listPicture[1], pizzaName[1], pizzaRecipes[1]))
        pizza.add(Object(listPicture[2], pizzaName[2], pizzaRecipes[2]))
        pizza.add(Object(listPicture[3], pizzaName[3], pizzaRecipes[3]))
        pizza.add(Object(listPicture[4], pizzaName[4], pizzaRecipes[4]))

        recyclerView.adapter = CustomRecycly(pizza, onClickListen = this@MainActivity::openActivity )

        method = arrayListOf(
            "1 Mix together the yeast and sugar with 250ml warm water and leave to sit for 10 mins. Place half the flour in a table-top mixer with a dough hook, pour in the yeast mixture and beat at medium speed for 10 mins (or mix in a bowl, then knead with oiled hands in the bowl for 5-10 mins).\n" +
                    "\n" +
                    "2 Leave somewhere warm for 10 more mins, then add the remaining flour and oil. Beat or knead to a dough for a further 5 mins. Put in a well-oiled bowl, cover with a cloth and place somewhere warm to double in size – about 1½ hrs.\n" +
                    "\n" +
                    "3 For the sauce, heat the oil in a pan over a moderate heat. Add the onion and cook for 3 mins, stirring constantly. Add the garlic, 1 tsp sea salt and 1 tsp ground black pepper and cook for 2 mins more. Add the tomatoes and bring to the boil, then reduce the heat and simmer for a good 20 mins, stirring occasionally.\n" +
                    "\n" +
                    "4 Once your dough has doubled in size, slap it down on a lightly floured surface and knead for 4 mins until soft but not too elastic. Divide into 6 pieces, roll into balls and leave to rest for 10 mins. Heat oven to the highest temperature possible (270C fan in the Good Food test kitchen) and place a flat baking sheet in the oven.\n" +
                    "\n" +
                    "5 With a well-floured rolling pin, roll out each ball of dough as thinly as possible. Remove the baking sheet from the oven, oil or dust with flour, then carefully transfer the dough base onto it. Spread over some of the tomato sauce (I like to apply it in the quantity that you would spread Marmite on toast, or the base will be soft and fall to bits), then the cheese and any toppings you desire.\n" +
                    "\n" +
                    "6 Cook for between 5-10 mins depending on your oven temp, until the base is crisp and the cheese melted. Scatter with basil.",
            "large bowl, then stir in the yeast and salt. Make a well, pour in 200ml warm water and the olive oil and bring together with a wooden spoon until you have a soft, fairly wet dough. Turn onto a lightly floured surface and knead for 5 mins until smooth. Cover with a tea towel and set aside. You can leave the dough to rise if you like, but it’s not essential for a thin crust.\n" +
                    "\n" +
                    "1 Make the sauce: Mix the passata, basil and crushed garlic together, then season to taste. Leave to stand at room temperature while you get on with shaping the base.\n" +
                    "\n" +
                    "2 Roll out the dough: If you’ve let the dough rise, give it a quick knead, then split into two balls. On a floured surface, roll out the dough into large rounds, about 25cm across, using a rolling pin. The dough needs to be very thin as it will rise in the oven. Lift the rounds onto two floured baking sheets.\n" +
                    "\n" +
                    "3 Top and bake: Heat oven to 240C/fan 220C /gas 8. Put another baking sheet or an upturned baking tray in the oven on the top shelf. Smooth sauce over bases with the back of a spoon. Scatter with cheese and tomatoes, drizzle with olive oil and season. Put one pizza, still on its baking sheet, on top of the preheated sheet or tray. Bake for 8-10 mins until crisp. Serve with a little more olive oil, and basil leaves if using. Repeat step for remaining pizza.",
            "Mix the flours and yeast with a pinch of salt in a food processor fitted with a dough blade. Pour in the water and mix to a soft dough, then work for 1 min. Remove the dough and roll out on a lightly floured surface to a round about 30cm across. Lift onto an oiled baking sheet.\n" +
                    "\n" +
                    "1 Spread the canned tomatoes over the dough to within 2cm of the edges. Arrange the cherry tomatoes and courgettes over the top, then scatter with the mozzarella. Mix the capers, olives and garlic, then scatter over the top. Drizzle evenly with the oil. Leave to rise for 20 mins. Heat oven to 240C/ fan 220C/gas 9 or the highest setting.\n" +
                    "\n" +
                    "2 Bake the pizza for 10-12 mins until crisp and golden around the edges. Scatter with the parsley to serve.",
            "1 Heat the grill. Spread each pitta bread with 1 tbsp tomato purée, sprinkle over the mixed herbs, then lay on the tomato slices. Divide the salami between the pittas, sprinkle over the cheese and grill until the cheese is golden and bubbling",
            "1 Heat oven to 200C/180C fan/gas 6 and put a baking sheet inside to heat up. Spread each pitta with 1 tsp purée. Top with the tomatoes, shallot, chorizo and cheddar.\n" +
                    "\n" +
                    "2 Place on the hot sheet and bake for 10 mins until the pittas are crisp, the cheese has melted and the chorizo has frazzled edges. Scatter with basil, if you like, and serve with a green salad."
        )



    }

    private fun openActivity(position: Int) {
        val intent = Intent(this, Pizza2Activity::class.java).apply {
            putExtra("Extra", method[position])
            putExtra("Name", pizzaName[position])
        }
        startActivity(intent)

    }
}
