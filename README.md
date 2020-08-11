# Ribbon
### Exemplo básico de utilização do Spring Cloud Netflix Ribbon.

Server: API /hello que retorna Hello World.  
Client: API /call-hello que chama a API /hello utilizando Ribbon.  

* [Server](https://github.com/TuannyRamos/Ribbon/tree/master/server)
* [Client](https://github.com/TuannyRamos/Ribbon/tree/master/client)

## Para subir a(s) aplicação(es)
```./mvnw spring-boot:run```

## Para subir a aplicação em outra porta
```SERVER_PORT=XXXX ./mvnw spring-boot:run```
