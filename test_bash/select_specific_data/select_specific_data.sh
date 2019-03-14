#!/bin/bash

# init
PROJECTDIR=$(realpath  "../" )
LIB=""
JARPATH="$PROJECTDIR/lib"
CLS=uml2rdf.test.arq.TestQuery1

for jarfile in "$JARPATH"/*.jar ; do
         LIB="$jarfile:$LIB"   
done
input_rq="$PWD/select_specific_data_test.rq"
input_ttl="$PWD/pegaseAIA-dev-onthology_turtle2-5.ttl"

#parameter of the java
PARAM=" $input_rq $input_ttl"

echo "$PROJECTDIR/bin"
cd $PROJECTDIR/bin

#execution
echo java -cp "$LIB" $CLS $PARAM
java -cp "$LIB" $CLS $PARAM
