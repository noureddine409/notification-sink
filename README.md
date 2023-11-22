# Real-Time Notification System with Server-Sent Events and Spring WebFlux

This repository contains the code for a real-time notification system built using Server-Sent Events (SSE) and Spring WebFlux.

## Project Overview

The project simulates a real-time notification system for a football match. It uses SSE to push updates from the server to the client whenever there's new data available, such as goals, cards, and other game events.

## Key Features

- **Server-Sent Events (SSE)**: Allows the server to push updates to the client in real-time.
- **Spring WebFlux**: Provides a reactive web framework that supports SSE.
- **Sink Object**: Acts as both a publisher and a subscriber, managing the flow of data efficiently and flexibly.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
  ```bash
  git clone https://github.com/noureddine409/notification-sink.git
  ```
2. Navigate to the project directory:
  ```bash
  cd notification-sink
  ```
3. Build the project:
  ```bash
  mvn clean install
  ```
4. Run the application:
  ```bash
  mvn spring-boot:run
  ```

## Usage

The application exposes two endpoints:

- `POST /api/v1/games/update`: Updates the game state.
- `GET /api/v1/games/stream`: Returns a stream of game updates.
