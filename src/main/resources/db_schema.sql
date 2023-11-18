-- code.players definition

CREATE TABLE `players` (
  `id` bigint NOT NULL,
  `age` int NOT NULL,
  `email` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `level` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- code.sports definition

CREATE TABLE `sports` (
  `id` bigint NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- code.sports_players definition

CREATE TABLE `sports_players` (
  `id` bigint NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `player_id` bigint DEFAULT NULL,
  `sport_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;