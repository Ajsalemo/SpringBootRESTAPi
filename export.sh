#!/bin/bash
# Loop through
IFS=$'\n'
for entries in $(./env.sh); do
   export $entries
done

echo "$SPRING_DATASOURCE_HOST"
echo "$SPRING_DATASOURCE_HOST"
echo "$SPRING_DATASOURCE_PORT"
echo "$SPRING_DATASOURCE_DB"
echo "$SPRING_DATASOURCE_USERNAME"
echo "$SPRING_DATASOURCE_PASSWORD"