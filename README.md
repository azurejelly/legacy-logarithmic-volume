# Logarithmic Volume Legacy
[Logarithmic Volume Control](https://modrinth.com/mod/logarithmic-volume-control) backported to Forge 1.8.9, because I could not ~~unsee~~ unhear it. Originally made by [girlbossdev](https://github.com/girlbossdev).

## Cloning, building and running
```shell
git clone https://github.com/azurejelly/logarithmic-volume-legacy
cd logarithmic-volume-legacy
./gradlew setupDecompWorkspace # setup workspace (might require -Xmx4G in jvm args)
```

```shell
./gradlew build # builds and generates mod jar to build/libs/
./gradlew buildCopyToRunModsAndRun # copy to ./run/mods/ and run the client
```