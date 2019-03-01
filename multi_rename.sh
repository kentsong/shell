#!/bin/bash
#更改目录档名
# params1 目录位置
# params2 附档名

#example：
#$. multi_rename.sh /Users/kent/Desktop/201901发票/超市 pdf

i=1;
path=$1;
subfix=$2;

for filename in $path/*.$subfix;
do
   echo  "$filename";
   echo "$i.$subfix";
   mv "$filename" "$path/$i.$subfix";
   i=`expr $i + 1`;
   echo "$i"
done
