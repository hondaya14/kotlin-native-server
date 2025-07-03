# kotlin-native-server

This project was created using the [Ktor Project Generator](https://start.ktor.io).

Here are some useful links to get you started:

- [Ktor Documentation](https://ktor.io/docs/home.html)
- [Ktor GitHub page](https://github.com/ktorio/ktor)
- The [Ktor Slack chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9). You'll need to [request an invite](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up) to join.

## Features

Here's a list of features included in this project:

| Name                                               | Description                                                 |
| ----------------------------------------------------|------------------------------------------------------------- |
| [Routing](https://start.ktor.io/p/routing-default) | Allows to define structured routes and associated handlers. |

## Building & Running

To build or run the project, use one of the following tasks:

| Task                          | Description                                                          |
| -------------------------------|---------------------------------------------------------------------- |
| `./gradlew test`              | Run the tests                                                        |
| `./gradlew build`             | Build everything                                                     |
| `buildFatJar`                 | Build an executable JAR of the server with all dependencies included |
| `buildImage`                  | Build the docker image to use with the fat JAR                       |
| `publishImageToLocalRegistry` | Publish the docker image locally                                     |
| `run`                         | Run the server                                                       |
| `runDocker`                   | Run using the local docker image                                     |
| `nativeBinaries`              | Build native binaries                                                |

If the server starts successfully, you'll see the following output:


## How to build native binaries
```
kotlin-narive-server ➤ ./gradlew nativeBinaries
```
## How to run native server
```
kotlin-native-server ➤ ./build/bin/native/debugExecutable/ktor-sample.kexe                                                                                                                      
[INFO] (io.ktor.server.Application): Application started in 0.0 seconds.
[INFO] (io.ktor.server.Application): Responding at http://0.0.0.0:8080
^C%
kotlin-native-server ➤ ./build/bin/native/releaseExecutable/ktor-sample.kexe
[INFO] (io.ktor.server.Application): Application started in 0.001 seconds.
[INFO] (io.ktor.server.Application): Responding at http://0.0.0.0:8080
^C%
```

