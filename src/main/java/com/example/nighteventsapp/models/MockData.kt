package com.example.nighteventsapp.models

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.nighteventsapp.R

data class Event(
    val id: Int,
    val title: String,
    val description: String,
    val date: String,
    val location: String,
    val isFavorite: MutableState<Boolean> = mutableStateOf(false),
    val isSubscribed: MutableState<Boolean> = mutableStateOf(false),
    val imageRes: Int
)

val eventList = listOf(
    Event(
        id = 1,
        title = "Conferência de Tecnologia 2024",
        description = "Tendências em tecnologia.",
        date = "2024-12-15",
        location = "Parque Tecnológico",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img1
    ),
    Event(
        id = 2,
        title = "Workshop de Inteligência Artificial",
        description = "Aprenda sobre redes neurais e machine learning.",
        date = "2025-02-10",
        location = "Faculdade de Engenharia",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img2
    ),
    Event(
        id = 3,
        title = "Reunião de Desenvolvedores",
        description = "Networking e troca de experiências entre desenvolvedores.",
        date = "2025-01-20",
        location = "Coworking Hub Central",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img3
    ),
    Event(
        id = 4,
        title = "Feira de Culinária Internacional",
        description = "Sabores do mundo todo reunidos em um só lugar.",
        date = "2025-03-18",
        location = "Centro Gastronômico Municipal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img4
    ),
    Event(
        id = 5,
        title = "Palestra Magna sobre Inovação",
        description = "Uma aula inspiradora com especialistas em inovação.",
        date = "2025-04-10",
        location = "Auditório Central da Universidade",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img5
    ),
    Event(
        id = 6,
        title = "Feira Literária 2025",
        description = "Encontro de leitores e autores com lançamentos e workshops.",
        date = "2025-06-20",
        location = "Centro de Convenções Literárias",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img6
    ),
    Event(
        id = 7,
        title = "Encontro de Startups 2025",
        description = "Networking e palestras sobre inovação e empreendedorismo.",
        date = "2025-08-10",
        location = "Hub de Inovação",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img7
    ),
    Event(
        id = 8,
        title = "Festival de Música 2025",
        description = "Grandes bandas e artistas se apresentam ao vivo.",
        date = "2025-09-15",
        location = "Estádio Municipal",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img8
    ),
    Event(
        id = 9,
        title = "Exposição de Arte Contemporânea",
        description = "Obras de artistas renomados e emergentes.",
        date = "2025-10-05",
        location = "Museu de Arte Moderna",
        isFavorite = mutableStateOf(false),
        isSubscribed = mutableStateOf(false),
        imageRes = R.drawable.img9
    ),
    )