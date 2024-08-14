# Estructura del Proyecto

***Solamente es el orden en el que voy haciendo los bloques***

**Guia/Roadmap** -> [Backend](https://roadmap.sh/backend) / [Backend Beginner](https://roadmap.sh/backend?r=backend-beginner)

## /src
- /main
    - /java
        - /org
            - /vzw
                - /Internet
                    - [`Como Funciona Internet.md`](Internet/Como%20Funciona%20Internet.md)
                    - [`Que es HTTP.md`](Internet/Que%20es%20HTTP.md)
                    - [`Que es un nombre de dominio.md`](Internet/Que%20es%20un%20nombre%20de%20dominio.md)
                    - [`Hosting.md`](Internet/Hosting.md)
                    - [`Que es DNS.md`](Internet/Que%20es%20DNS.md)
                    - [`Como Funcionan Los Navegadores.md`](Internet/Cómo%20funcionan%20los%20navegadores.md)
                - /PickALanguage (`JS`, `Go`, `Python`, `Ruby`, <mark>`Java`</mark>, `C#`, `PHP`, `Rust`)
                    - /LearnTheFundamentals -> ___En esta parte se sigue el Roadmap: [Java](https://roadmap.sh/java)___
                        - /Basics
                            - [`TerminologiaBasica.md`](PickALanguage/LearnTheFundamentals/Basics/TerminologiaBasica.md)
                        - /TipoDeDatosYVariables
                            - [`VariablesYTiposDeDatos.md`](PickALanguage/LearnTheFundamentals/TiposDeDatosYVariables/VariablesYTiposDeDatos.md)
                            - `TipoDeDatos.java`
                        - /Conditionals
                            - [`Readme.md`](PickALanguage/LearnTheFundamentals/Conditionals/Readme.md) -> _Definicion de Condicionales_
                            - `If.java`
                            - `Operadores.java`
                            - `Switch.java`
                            - /Ejercicios
                                - `{...}`
                        - /Functions
                            - [`Readme.md`](PickALanguage/LearnTheFundamentals/Functions/Readme.md) -> _Definicion de Funciones_
                            - `JavaMethods.java`
                            - `JavaMethodParameters.java`
                            - `JavaMethodOverloading.java`
                            - `JavaScope.java`
                            - `JavaRecursion.java`
                            - /Ejercicios
                                - `{...}`
                        - /Loops
                            - [`Readme.md`](PickALanguage/LearnTheFundamentals/Loops/Readme.md) -> _Definicion de Loops_
                            - `ForLoop.java`
                            - `WhileLoop.java`
                            - `DoWhileLoop.java`
                            - /Ejercicios
                                - `{...}`
                        - /ExceptionHandling
                            - [`Readme.md`](PickALanguage/LearnTheFundamentals/ExceptionHandling/Readme.md) -> _Todo Sobre Manejo de Excepciones_
                            - `TryCatch.java`
                            - `MultipleTryCatch.java`
                            - `NestedTryBlock.java`
                            - `FinallyBlock.java`
                            - `ThrowKeyword.java`
                            - `ExceptionPropagation.java`
                            - `ThrowsKeyword.java`
                            - `ThrowAndThrows.java`
                            - `FinalOrFinallyOrFinalize.java`
                            - `ExceptionHandlingwithMethodOverriding.java`
                            - `CustomExceptions.java`
                            - /Extras
                                - `Testthrows2.java` -> _Parte del Bloque `ThrowsKeyword.java`_
                                - `Testthrows3.java` -> _Parte del Bloque `ThrowsKeyword.java`_
                                - `Testthrows4.java` -> _Parte del Bloque `ThrowsKeyword.java`_
                                - `TestExceptionChild.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestExceptionChild1.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestExceptionChild2.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestExceptionChild3.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestExceptionChild4.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestExceptionChild5.java` -> _Parte del Bloque `ExceptionHandlingwithMethodOverriding.java`_
                                - `TestCustomException1.java` -> _Parte del Bloque `CustomExceptions.java`_
                                - `TestCustomException2.java` -> _Parte del Bloque `CustomExceptions.java`_
                                - `Recordatorio.java` -> _Clase para practicar lo visto_
                            - /Ejercicios 
                               - `{...}`
                        - /DataStructures
                            - [`Readme.md`](PickALanguage/LearnTheFundamentals/DataStructures/Readme.md) -> _Resumen de las Estructuras de Datos_
                            - [`Introduccion.md`](PickALanguage/LearnTheFundamentals/DataStructures/Introduccion.md)
                            - [`Algoritmos.md`](PickALanguage/LearnTheFundamentals/DataStructures/Algoritmos.md)
                            - [`Analisis Asintotico.md`](PickALanguage/LearnTheFundamentals/DataStructures/Analisis%20Asintotico.md)
                            - [`Pointer.md`](PickALanguage/LearnTheFundamentals/DataStructures/Pointer.md)
                            - [`Estructura.md`](PickALanguage/LearnTheFundamentals/DataStructures/Estructura.md)
                            - /DSArray
                                - [`Readme.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSArrays/Readme.md) -> _Que son los Arrays_
                                - `Declaracion.java`
                                - `AccesoAElementos.java`
                                - `ArreglosMultidimencionales.java`
                                - `ManipulacionDeArreglos.java`
                                - /Ejercicios
                                    - `{...}`
                            - /DSLinkedList
                                - [`Readme.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSLinkedList/Readme.md) -> _Que son las Listas Enlazadas_
                                - /SinglyLinkedList
                                    - [`Lista Enlazada Simple.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSLinkedList/SinglyLinkedList/Lista%20Enlazada%20Simple.md)
                                    - `Node.java`
                                    - `SinglyLinkedList.java`
                                    - `Declaracion.java` -> _Como usar la clase `SinglyLinkedList.java`_
                                - /DoublyLinkedList
                                    - [`Lista enlazada Doble.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSLinkedList/DoublyLinkedList/Lista%20Enlazada%20Doble.md)
                                    - `Node.java`
                                    - `Node.java`
                                    - `Declaracion.java` -> _Como usar la clase `DoublyLinkedList.java`_
                                - /CircularSinglyLinkedList
                                    - [`Lista Enlazada Simple Circular.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSLinkedList/CircularSinglyLinkedList/Lista%20Enlazada%20Simple%20Circular.md)
                                    - `Node.java`
                                    - `CircularSinglyLinkedList.java`
                                    - `Declaracion.java` -> _Como usar la clase `CircularSinglyLinkedList.java`_
                                - /CircularDoublyLinkedList
                                    - [`Lista Enlazada Circular Doble.md`](PickALanguage/LearnTheFundamentals/DataStructures/DSLinkedList/CircularDoublyLinkedList/Lista%20Enlazada%20Circular%20Doble.md)
                                    - `Node.java`
                                    - `CircularDoublyLinkedList.java`
                                    - `Declaracion.java` -> _Como usar la clase `CircularDoublyLinkedList.java.java`_
                            - /DSStack
                                - `{...}` 
                            - /DSQueue
                                - `{...}` 
                            - /DSTree
                                - `{...}` 
                            - /DSGraph
                                - `{...}` 
                            - /DSSearching
                                - `{...}` 
                            - /DSSorting
                                - `{...}`
                        - /DateAndTime
                            - `{...}` 
                        - /OOP
                            - `{...}` 
                        - /Interfaces
                            - `{...}` 
                        - /Classes
                            - `{...}` 
                        - /Packages
                            - `{...}` 
                        - /WorkingFilesAndAPI
                            - `{...}` 
                    - /GettingDeeper
                        - `{...}` 
                    - /Buildtools
                        - `{...}` 
                    - /WebFramework
                        - `{...}` 
                    - /ORM
                        - `{...}` 
                    - /LoggingFrameworks
                        - `{...}` 
                    - /JDBC
                        - `{...}` 
                    - /TestingYourApps
                        - `{...}` 
                - /VersionControlSystems
                    - /Git
                        - `{...}` 
                - /RepoHostingServices
                    - /GitHub
                        - `{...}` 
                    - /GitLab
                        - `{...}` 
                    - /BitBucket
                        - `{...}` 
                - /RelationalDataBases
                    - /PostgreSQL
                        - `{...}` 
                    - /MariaDB
                        - `{...}` 
                    - /OracleBasics
                        - `{...}` 
                - /LearnAboutAPIs
                    - /Authentication
                        - /JWT
                            - `{...}` 
                        - /OAuth
                            - `{...}` 
                        - /BasicAuthentication
                            - `{...}` 
                        - /TokenAuthentication
                            - `{...}`
                        - /CookieBasedAuth
                            - `{...}` 
                    - /REST
                        - `{...}` 
                    - /JSONAPIs
                        - `{...}` 
                - /Caching
                    - /ServerSide
                        - `{...}`
                    - /CDN
                        - `{...}`
                    - /ClientSide
                        - `{...}`
                - /WebSecurity
                    - /MD5
                        - `{...}`
                    - /SHA
                        - `{...}`
                    - /Scrypt
                        - `{...}`
                    - /Bcrypt
                        - `{...}`
                    - /APISecurityBestPractices
                        - `{...}`
                - /Testing
                    - /IntegrationTesting
                        - `{...}`
                    - /UnitTesting
                        - `{...}`
                    - /FunctionalTesting
                        - `{...}`
                - /CICD
                    - `{...}`
                - /MoreAboutDatabases
                    - /ORMs
                        - `{...}`
                    - /ACID
                        - `{...}`
                    - /Transactions
                        - `{...}`
                    - /N+1
                        - `{...}`
                    - /Normalization
                        - `{...}`
                    - /FailureModes
                        - `{...}`
                    - /ProfilingPerfor
                        - `{...}`
                - /ScalingDataBases
                    - /DatabaseIndex
                        - `{...}`
                    - /DataReplication
                        - `{...}`
                - /SoftwareDesign&Architecture  ->  _(Opcional roadmap: [Software Design](https://roadmap.sh/software-design-architecture))_
                    - /ArchitecturalPatterns
                        - /MonolithicApps
                            - `{...}`
                        - /Microservices
                            - `{...}` 
                        - /SOA
                            -  `{...}`
                        - /Serverless
                            - `{...}` 
                        - /ServiceMesh
                            - `{...}` 
                        - /TwelveFactorApps
                            - `{...}` 
                - /Containerization&Virtualization
                    - /[Docker](https://roadmap.sh/docker)
                        - `{...}`
                    - /[Kubernetes](https://roadmap.sh/kubernetes)
                        - `{...}`
                - /MessageBrokers
                    - /Kafka
                        -  `{...}`
                - /SearchEngines
                    - /Elasticsearch
                        - `{...}` 
                - /WebServers
                    - /Nginx
                        - `{...}` 
                    - /Apache
                        - `{...}` 
                - /RealTimeData
                    - /ServerSentEvents
                        - `{...}` 
                    - /WebSockets
                        - `{...}` 
                    - /LongPolling
                        - `{...}` 
                    - /ShortPolling
                        - `{...}` 
                - /[GraphQL](https://roadmap.sh/graphql)
                    - `{...}`
                - /NoSQLDataBases
                    - /DocumentDBs
                        - /MongoDB
                            - `{...}` 
                    - /KeyValue
                        - /Redis
                            - `{...}` 
                    - /RealTime
                        - /Firebase
                            - `{...}` 
                    - /TimeSeries
                        - /InfluxDB
                            - `{...}` 
                    - /ColumnDBs
                        - /Cassandra
                            - `{...}` 
                    - /GraphDBs
                        - /Neo4j
                            - `{...}` 
                - /BuildingForScale
                    - /MigrationStrategies&Usage
                        - `{...}`
                    - /TypesOfScalling
                        - `{...}` 
                    - Observability
                        - `{...}` 
                    - DifferenceAndUsage
                        - `{...}` 
                - `main.java`
    - /resources
- /test





### [Conceptos escenciales backend](https://www.youtube.com/watch?v=RbWFJRHhF2M):  

* Servidor
* Latencia
* HTTP & HTTPS
* API
* Arquitectura APIs Web
* Manejar datos en tiempo real
* JSON & XML
* Middleware
* Logs & Monitoreo
* Rate Limit
* CRUD
* Paginacion
* Mecanismos de autenticacion
* Cache
* BD Relacion & No Relacional
* ORM
* Query Builder
* Colas de Mensajeria
* Message Brokers
* Webhooks
* Proxy
* CI/CD
* Contenedores
* Microservicios
* Servicios Cloud



--> PARA GENERAR EL ARCHIVO DE LA ESTRUCTURA DEL PROYECTO FINAL, EN WINDOWS SE USA EL COMANDO:
            -----> tree /F src > estructura.txt