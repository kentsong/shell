#!/bin/bash

#尋找目標 關鍵字"page = Page." 後面的變數名稱。
filter_page_key() {
  page_result=false
  text=$1                    #param1
  search_text=$2             #param2
  rest=${text#*$search_text} #target rest index
  echo "text=${text}"
  echo "search_text=${search_text}"
  echo "rest=${rest}"
  str_length=${#search_text}
  echo "str_length=${str_length}"
  start_index=$((${#text} - ${#rest} - ${#search_text})) # searched text start index (position)
  echo "start_index=${start_index}"
  echo "#text=${#text}"
  echo "#rest=${#rest}"
  echo "#search_text=${#search_text}"


  if [ $start_index -lt 0 ]; then
    return 1 #break
  fi
  num=$(expr ${start_index} + ${str_length})

  end=0
  while (($num <= ${#text})); do
    str=${text:num:1}
    if [[ $str =~ [a-zA-Z]|\d|_ ]]; then
      let "num++"
      let "end++"
    else
      break
    fi
  done

  begin=$(expr ${start_index} + ${str_length})
  echo "原始 text =${text}"
  echo "結果 text ="${text:begin:end}
  page_result_value=${text:begin:end}
  page_result=true
}

text="@GenericLogEventPage(page = Page.IAP)"
target="page = Page."
echo ${target}
filter_page_key "${text}" "${target}"

