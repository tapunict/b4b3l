


mvn archetype:generate \
    -DarchetypeGroupId=org.apache.kafka \
    -DarchetypeArtifactId=streams-quickstart-java \
    -DarchetypeVersion=3.9.0 \
    -DgroupId=streams.examples \
    -DartifactId=kafka-streams.examples \
    -Dversion=0.1 \
    -Dpackage=tap