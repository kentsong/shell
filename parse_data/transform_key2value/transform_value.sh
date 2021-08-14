#!/bin/bash

transform_key_to_value() {
  local RESULT=$(grep -r -F -A2 -h "$1(" $2 | sed -e 's/^[[:space:]]*//' | tr -d "\n")
  for element in "${RESULT[@]}"; do
    page+=${element}
  done
  arrIN=(${page//,/ }) #split by ","
  for e1 in "${arrIN[@]}"; do
    if [[ $e1 == *"${key}"* ]]; then
      value=$(echo $e1 | cut -d"\"" -f 2) # split and get position 2
      transform_array+=("$value")
      return 0
    fi
  done
  echo "key:\"$1\" not found"
  return 1
}

FILE_PATH=./Page.kt
key=LIVESTREAM_ENVELOP_GRAB

transform_key_to_value ${key} ${FILE_PATH} && echo yes || echo no
echo ${transform_array}
