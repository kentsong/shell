#!/bin/bash
##################################
# https://stedolan.github.io/jq/ #
# brew install jq                #
##################################

APP_PATH=./app/src/main/assets/EventLogSpec

page_array=()

walk_dir () {
    for pathname in "$1"/*; do
        if [ -d "$pathname" ]; then
            walk_dir "$pathname"
        else
            case "$pathname" in
                *.*)
              pageKeys=$(jq -r '.pageInfo | keys[] as $key | "\($key)"' "${pathname}")
              for key in $pageKeys; do
                page_array+=("$key")
                echo "pageKey=${key}"
              done
            esac
        fi
    done
}

array_contains () {
    local seeking=$1; shift
    local in=1
    for element; do
        if [[ $element == "$seeking" ]]; then
            in=0
            break
        fi
    done
    return $in
}

walk_dir "$APP_PATH"
printf '%s\n' "page_array count =${#page_array[@]}"

array_contains "Army_ArmyInfo" "${page_array[@]}" && echo yes || echo no    # no
array_contains "registration_status" "${page_array[@]}" && echo yes || echo no    # yes