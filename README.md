# Фреймворк Spring (семинары)
## Урок 1. Системы сборки Maven и Gradle для разработки Java приложений

### Домашнее задание
- Выбрать Maven или Gradle
- Создать проект
- Что будет делать проект не важно
- Добавить несколько зависимостей

### Домашняя работа
Простой проект на Java с использованием библиотек для сериализации и десериализации объектов. 

Используются библиотеки Jackson для работы с JSON и Gson для JSON-сериализации. 
Также добавлена библиотеека Apache Commons Lang для некоторых утили.

**Проект выполняет операции сериализации и десериализации объектов класса Person с использованием различных библиотек: Jackson, Gson и Apache Commons Lang.**

### Прямые ссылки на файлы
[pom.xml](https://github.com/ShumAhd/Spring-framework-1/blob/main/pom.xml)

[class App](https://github.com/ShumAhd/Spring-framework-1/blob/main/src/main/java/ro/shum/App.java)

[class Person](https://github.com/ShumAhd/Spring-framework-1/blob/main/src/main/java/ro/shum/Person.java)

### Вывод в консоль
```agsl
Jackson Serialization and Deserialization:
Original: Person{name='null', age=0}
Serialized JSON: {"name":null,"age":0}
Deserialized: Person{name='null', age=0}

Gson Serialization and Deserialization:
Original: Person{name='null', age=0}
Serialized JSON: {"age":0}
Deserialized: Person{name='null', age=0}

Apache Commons Serialization and Deserialization:
Original: Person{name='null', age=0}
Serialized Bytes: [B@4f209819
Deserialized: Person{name='null', age=0}
```