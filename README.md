# Mobile Marvel API

Mobile Marvel Api is a Java REST API for dealing with MarvelDB and fetch data from Comics Resource, Series, Creators and Characters.

## Installation

Use the Docker Pull Command to install Mobile Marvel API.

```bash

```

## Usage

By default, the Docker will expose port 8010.
In this example, we simply map port 8010 of the host to  port 8090 of the Docker
```bash
docker run -p 8010:8010 --name mobile-marvel-api crisr/crm-mobile-marvel-api
```

Verify the deployment by navigating to your server address in  your preferred browser.

## Endpoints

### OpenAPI endpoints

api-docs : `http://localhost:8010/api/v1/api-docs`
swagger:  `http://localhost:8010/api/v1/swagger-ui.html`

### API endpoints
base-url: `http://localhost:8010`
context-path: `/api/v1/marvel`
web request: `/comics`


*Endpoint used to fetch all Comics*
```bash
http://localhost:8010/api/v1/marvel/comics
```
-----------------

![enter image description here](https://img.shields.io/badge/java-11-blue) ![enter image description here](https://img.shields.io/badge/spring--boot-2.7.4-green)
