DROP TABLE IF EXISTS `book`;
DROP TABLE IF EXISTS `song`;

CREATE TABLE `book` (
                        `book_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
                        `book_name` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
                        `author_name` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `publisher_name` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `season` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `instrument` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `create_timestamp` DATETIME NOT NULL DEFAULT current_timestamp(),
                        `update_timestamp` DATETIME NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
                        `tags` VARCHAR(256) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        PRIMARY KEY (`book_id`) USING BTREE
)
    COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=1
;

CREATE TABLE `song` (
                        `song_id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
                        `book_id` INT(10) UNSIGNED NOT NULL DEFAULT NULL,
                        `song_name` VARCHAR(50) NOT NULL COLLATE 'utf8_general_ci',
                        `composer_name` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `season` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `instrument` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        `page` INT(10) UNSIGNED NULL DEFAULT NULL,
                        `create_timestamp` DATETIME NOT NULL DEFAULT current_timestamp(),
                        `update_timestamp` DATETIME NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
                        `tags` VARCHAR(256) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
                        PRIMARY KEY (`song_id`) USING BTREE,
                        INDEX `FK__book` (`book_id`) USING BTREE,
                        CONSTRAINT `FK__book` FOREIGN KEY (`book_id`) REFERENCES `music_tracker`.`book` (`book_id`) ON UPDATE CASCADE ON DELETE CASCADE
)
    COLLATE='utf8_general_ci'
    ENGINE=InnoDB
    AUTO_INCREMENT=1
;
