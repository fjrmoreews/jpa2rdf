rm -rf ./tmp_lib
mkdir -p ./tmp_lib
mvn -Dhttps.protocols=TLSv1.2  clean dependency:copy-dependencies

mv target/dependency/* ./tmp_lib/



