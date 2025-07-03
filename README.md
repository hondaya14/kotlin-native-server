# kotlin-native-server

This project was created using the [Ktor Project Generator](https://start.ktor.io).

reference: https://ktor.io/docs/server-native.html

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

