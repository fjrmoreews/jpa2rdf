#!/bin/bash

# init
PROJECTDIR=$(realpath  "../../" )

input_file="$PROJECTDIR/test/zz.csv"
askomics_URL="http://localhost/askomics/#"
APIKEY="pl0S3qEccLH1z7nibEuA"

#execution
echo askocli integrate -a $askomics_URL -k $APIKEY $input_file

askocli integrate -a $askomics_URL -k $APIKEY $input_file
