## 📋 General Information

**Project Name:** kafka
**Version:** 0.0.1-SNAPSHOT
**Group:** com.ese
**Description:** Spring Kafka Project
**Java Version:** 21

## 🏗️ Project Architecture

This is a **Spring Boot** project focused on learning and using **Apache Kafka**, utilizing the following
technologies:

### Main Technologies

- **Spring Boot 3.5.5**
- **Spring Kafka**
- **Apache Kafka with Apache Avro**
- **Confluent Schema Registry**
- **Java 21**
- **Lombok**
- **MapStruct**

## 📦 Main Dependencies

### Base Framework

- **Spring Boot Starter Web**: For creating REST APIs
- **Spring Boot Starter Actuator**: For monitoring and metrics
- **Spring Kafka**: Kafka integration with Spring

### Serialization and Schemas

- **Apache Avro (1.12.0)**: For data serialization
- **Confluent Kafka Avro Serializer (7.9.0)**: Avro serializer for Kafka
- **Confluent Schema Registry Client (7.9.0)**: Client for schema management

### Utilities

- **Lombok**: To reduce boilerplate code
- **MapStruct (1.6.2)**: For mapping between objects
- **Lombok-MapStruct Binding**: Integration between Lombok and MapStruct

### Testing

- **Spring Boot Starter Test**: For unit testing
- **Spring Kafka Test**: For integration testing with Kafka

## 🔧 Project Configuration

### Maven Repositories

The project is configured to use the Confluent repository:

``` xml
<repository>
    <id>confluent</id>
    <url>https://packages.confluent.io/maven/</url>
</repository>
```

### Build Plugins

1. **Spring Boot Maven Plugin**: For packaging the application
2. **Avro Maven Plugin**: To generate Java classes from Avro schemas
    - Schemas directory: `src/main/resources/`
    - Output directory: `src/main/java/`

## 📂 Project Structure

``` 
kafka/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── target/
├── compose.yml
├── pom.xml
├── README.md
└── HELP.md
```

## 🐳 Docker Compose

The project includes a file that likely contains the configuration to start: `compose.yml`

- Kafka Broker
- Zookeeper
- Schema Registry (Confluent)

## 🎯 Project Purpose

This project is designed as an **educational guide** to learn Apache Kafka from scratch to an expert level,
including:

1. **Basic Kafka configuration with Spring Boot**
2. **Message production and consumption**
3. **Use of Apache Avro for serialization**
4. **Integration with Confluent Schema Registry**
5. **Best practices and advanced patterns**

## 🚀 Running the Project

### Prerequisites

- Java 21
- Maven 3.6+
- Docker (for Kafka services)

### Steps to run

1. Start services with Docker Compose:

``` bash
   docker-compose up -d
```

1. Compile the project:

``` bash
   ./mvnw clean compile
```

1. Run the application:

``` bash
   ./mvnw spring-boot:run
```