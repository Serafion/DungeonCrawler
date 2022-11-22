[![CircleCI](https://dl.circleci.com/status-badge/img/gh/Serafion/DungeonCrawler/tree/main.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/Serafion/DungeonCrawler/tree/main)
# DungeonCrawler
Text game inspired by mechanics of fast rpg card games like Munchkin

Usage of external api:
1) https://randomuser.me/api/


Stack:
1) Java 17
2) MySQL database with Liquibase
3) Spring framework (Spring Boot, Spring Web, Spring Data)
4) Project Lombok
5) TDD development with JUnit5, Mockito, AssertJ, TestContainers
6) Circle CI builds

Modules:

CharacterGenerator:
Genarates new Player basic data in random manner. Module uses external api via http protocol to aquire random name.

MonsterCreator:
Module to generate random monsters for further gameplay. Designed with factory design pattern

GameLogic:
Module for calculating game restuls and preserving current game state. Design is implementing chain of responsibility to solve different requests.
