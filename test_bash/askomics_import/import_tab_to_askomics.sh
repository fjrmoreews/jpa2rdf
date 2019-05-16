#!/bin/bash

# init

PROJECTDIR=$(realpath  "../../" )

input_file="$PROJECTDIR/input_for_generator/generalanalyse.csv"
input_file2="$PROJECTDIR/input_for_generator/geneinfo.csv"
input_file3="$PROJECTDIR/input_for_generator/sampleinfo.csv"
askomics_URL="http://localhost/askomics/#"
APIKEY="pl0S3qEccLH1z7nibEuA"

#execution
echo askocli integrate -a $askomics_URL -k $APIKEY $input_file

askocli integrate -a $askomics_URL -k $APIKEY $input_file

echo askocli integrate -a $askomics_URL -k $APIKEY $input_file2
askocli integrate -a $askomics_URL -k $APIKEY $input_file2

echo askocli integrate -a $askomics_URL -k $APIKEY $input_file3
askocli integrate -a $askomics_URL -k $APIKEY $input_file3
