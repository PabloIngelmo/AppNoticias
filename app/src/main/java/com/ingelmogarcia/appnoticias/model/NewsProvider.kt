package com.ingelmogarcia.appnoticias.model

class NewsProvider {
    companion object{

        fun random():NewsModel{
            val position = (0..2).random()
            return news[position]
        }

        private val news = listOf<NewsModel>(
            NewsModel(
                title = "Halaand ficha por el City",
                author = "Tomás Roncero",
                description = "El culebrón Halaand llega a su fin. Este pasado martes el Manchester City " +
                        "ha anunciado que se hace con los servicios del jugador por un traspaso de 200 millones" +
                        "de euros para las próximas 4 temporadas."
            ),
            NewsModel(
                title = "Rusia sigue con su plan",
                author = "Vicente Vallés",
                description = "Rusia sigue bombardeando Ucrania e invadiendo las ciudades costeras para " +
                        "hacerse con el poder."
            ),
            NewsModel(
                title = "Siguen disminuyendo los contagios de Covid-19",
                author = "Susana Griso",
                description = "Los contagios por Covid-19 siguen disminuyendo en España. En el último mes" +
                        "han disminuido un total de 27% respecto al mes anterior."
            )
        )
    }

}