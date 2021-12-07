
# Project Title

🇺🇸: A simple RestAPI of movies written in java using Spring Web, Spring data and as a MongoDB database

🇧🇷: Uma simples RestAPI de filmes escrita em java ultilzando Spring Web, Spring data e como banco de dados MongoDB



## Movie Endpoints

#### Get all movies

```http
  GET /api/v1/movies?kids=false
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `kids` | `boolean` | **Required**. Filter movies to kids public|

#### Get movie by id

```http
  GET /api/v1/movies/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Find movie by id |

#### Create movie

```http
  POST /api/v1/movies
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. Name of the movie |
| `synopsis` | `string` | **Required**. Description of the movie|
| `genre` | `string` | **Required**. Name of the genre of the movie |

#### Delete movie by id


```http
  DELETE /api/v1/movies/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Delete movie by id |


## Genre Endpoints

#### Get all genres

```http
  GET /api/v1/genres
```

#### Get genre by id

```http
  GET /api/v1/genres/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Find genre by id |

#### Create genre

```http
  POST /api/v1/genres
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `name` | `string` | **Required**. Name of the genre |
| `age` | `int` | **Required**. Audience age|
| `forKids` | `boolean` | **Required**. It's for kids |

#### Delete movie by id


```http
  DELETE /api/v1/genres/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Delete genre by id |


## Deployment

To deploy this project run

```bash
 docker-compose up
``` 

